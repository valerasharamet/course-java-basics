package com.rakovets.course_java_basic._draft.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Использование селектора для серверного приложения.
 */
public class CryptServer {
    static public void main(String args[]) throws Exception {
        int port = Integer.parseInt(args[0]);

        Server server = new Server(port);
    }

    public static class Server implements Runnable {
        // Порт который мы будем слушать
        private int port;

        // Предварительно выделенный буфер для шифрования данных
        private final ByteBuffer buffer = ByteBuffer.allocate(16384);

        public Server(int port) {
            this.port = port;
            new Thread(this).start();
        }

        public void run() {
            try {
                ServerSocketChannel ssc = ServerSocketChannel.open();

                // При создании клиент-серверной системы, мы должны прослушивать
                // ServerSocketChannel. Необходимо сконфигурировать его как
                // nonblocking, что бы можно было использовать его совместно с
                // Selector
                ssc.configureBlocking(false);

                // Получаем сокет, подключенный к этому каналу, и привязываем
                // его к порту определенному порта
                ServerSocket ss = ssc.socket();
                InetSocketAddress isa = new InetSocketAddress(port);
                ss.bind(isa);

                // Создаем новый селектор
                Selector selector = Selector.open();

                // Регистрируем ServerSocketChannel, чтобы мы могли прослушивать
                // входящие соединения
                ssc.register(selector, SelectionKey.OP_ACCEPT);
                System.out.println("Listening on port " + port);

                while (true) {
                    // Проверяем, если ли какие-либо активности -
                    // входящие соединения или входящие данные в
                    // существующем соединении.
                    int num = selector.select();

                    // Если никаких активностей нет, выходим из цикла
                    // и снова ждём.
                    if (num == 0) {
                        continue;
                    }

                    // Получим множество ключей, соответствующие активности,
                    // которые могут быть распознаны и обработаны один за
                    // другим.
                    Set<SelectionKey> keys = selector.selectedKeys();
                    Iterator<SelectionKey> it = keys.iterator();
                    while (it.hasNext()) {
                        // Получим ключ, представляющий один из битов
                        // активности ввода/вывода.
                        SelectionKey key = (SelectionKey) it.next();

                        // Проверяем какой тип активности
                        if ((key.readyOps() & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT) {

                            System.out.println("acc");
                            // It's an incoming connection.
                            // Register this socket with the Selector
                            // so we can listen for input on it

                            Socket s = ss.accept();
                            System.out.println("Got connection from " + s);

                            // Make sure to make it non-blocking, so we can
                            // use a selector on it.
                            SocketChannel sc = s.getChannel();
                            sc.configureBlocking(false);

                            // Зарегистрировать селектор с помощью селектора,
                            // для чтения
                            sc.register(selector, SelectionKey.OP_READ);
                        } else if ((key.readyOps() & SelectionKey.OP_READ) == SelectionKey.OP_READ) {

                            SocketChannel sc = null;

                            try {

                                // It's incoming data on a connection, so
                                // process it
                                sc = (SocketChannel) key.channel();
                                boolean ok = processInput(sc);

                                // Если соеденение е активно, закрываем его
                                if (!ok) {
                                    key.cancel();

                                    Socket s = null;
                                    try {
                                        s = sc.socket();
                                        s.close();
                                    } catch (IOException ie) {
                                        System.err.println("Error closing socket " + s + ": " + ie);
                                    }
                                }

                            } catch (IOException ie) {

                                // В случае исключении удаляем канал из
                                // селектора
                                // selector
                                key.cancel();

                                try {
                                    sc.close();
                                } catch (IOException ie2) {
                                    System.out.println(ie2);
                                }

                                System.out.println("Closed " + sc);
                            }
                        }
                    }

                    // Убираем выбранные ключи, так как мы их уже обраб отали
                    keys.clear();
                }
            } catch (IOException ie) {
                System.err.println(ie);
            }
        }

        /*
         Получение незашифрованных данных и отправка их назад в зашифрованном виде c помощью алгоритма ROT13.
         ROT13/ROT-13 (rotate by 13 places) is a special case of the Caesar cipher
        @link https://en.wikipedia.org/wiki/ROT13
        @link https://en.wikipedia.org/wiki/Caesar_cipher
         */
        private boolean processInput(SocketChannel sc) throws IOException {
            buffer.clear();
            sc.read(buffer);
            buffer.flip();

            // If no data, close the connection
            if (buffer.limit() == 0) {
                return false;
            }

            // Простое шифрование по алгоритму rot-13
            for (int i = 0; i < buffer.limit(); ++i) {
                byte b = buffer.get(i);

                if ((b >= 'a' && b <= 'm') || (b >= 'A' && b <= 'M')) {
                    b += 13;
                } else if ((b >= 'n' && b <= 'z') || (b >= 'N' && b <= 'Z')) {
                    b -= 13;
                }

                buffer.put(i, b);
            }
            sc.write(buffer);
            System.out.println("Processed " + buffer.limit() + " from " + sc);
            return true;
        }
    }
}
