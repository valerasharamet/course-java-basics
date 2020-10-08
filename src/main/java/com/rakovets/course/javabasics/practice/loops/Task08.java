package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для сети оптовых гипермаркетов:
 * Необходимо сформировать price для некоторого продукта. Известно:
 *
 * @param startPriceAllItems      стоимость всех продуктов, с которых начинается price
 * @param startNumberItems        количество продуктов, с которых начинается price
 * @param differentialNumberItems разница в количестве продуктов между соседними значениями price
 * @param sizeTotalPrice          размерность итогового price
 * @author Dmitry Rakovets
 * @version 1.0
 * @return price, где формат вывода одной записи '${numberItems} - ${cost}'
 */
public class Task08 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        double startPriceAllItems = (args.length != 4 ? scanner.nextDouble() : Double.parseDouble(args[0]));
        int startNumberItems = (args.length != 4 ? scanner.nextInt() : Integer.parseInt(args[1]));
        int differentialNumberItems = (args.length != 4 ? scanner.nextInt() : Integer.parseInt(args[2]));
        int sizeTotalPrice = (args.length != 4 ? scanner.nextInt() : Integer.parseInt(args[3]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        String strReturn = startNumberItems+ " - "+ startPriceAllItems+"\n";
        double step= startPriceAllItems/startNumberItems;
        int dif= startNumberItems;
        for (int i = 0;i< sizeTotalPrice;i++)
        {
            dif= dif+differentialNumberItems;
            strReturn = strReturn+ dif + " - " + (startPriceAllItems+step*differentialNumberItems*(i+1)) + "\n";
        }
        System.out.print(strReturn);
    }
}