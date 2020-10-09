package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для сети оптовых гипермаркетов:
 * Необходимо сформировать price для некоторого продукта. Известно:
 *
 * @param startPriceAllItems      стоимость всех продуктов, с которых начинается price
 * @param startNumberItems        количество продуктов, с которых начинается price
 * @param differentialNumberItems разница в количестве продуктов между соседними значениями price
 * @param differentialSell        скидка % на всю покупку за приобретение дополнительных differentialNumberItems товара
 * @param sizeTotalPrice          размерность итогового price
 * @author Dmitry Rakovets
 * @version 1.0
 * @return price, где формат вывода одной записи '${numberItems} - ${cost} with sell ${totalSell}%'
 */
public class Task09 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        double startPriceAllItems = (args.length != 5 ? scanner.nextDouble() : Double.parseDouble(args[0]));
        int startNumberItems = (args.length != 5 ? scanner.nextInt() : Integer.parseInt(args[1]));
        int differentialNumberItems = (args.length != 5 ? scanner.nextInt() : Integer.parseInt(args[2]));
        int sizeTotalPrice = (args.length != 5 ? scanner.nextInt() : Integer.parseInt(args[3]));
        double differentialSell = (args.length != 5 ? scanner.nextDouble() : Double.parseDouble(args[4]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        String strReturn = startNumberItems+ " - "+ startPriceAllItems+"\n";
        double step = startPriceAllItems / startNumberItems;
        double dif= startNumberItems;
        for (int i = 0;i< sizeTotalPrice;i++)
        {
            dif= dif+differentialNumberItems;
            double ds = (startPriceAllItems+step*differentialNumberItems*(i+1));
            strReturn = strReturn + dif + " - " + (ds-((ds/100))*(i+1)) + " with sell " +(i+1)+ "%" + "\n";
        }
        System.out.print(strReturn);
    }
}