package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Определить количество дней в году.
 * В високосном годе - 366 дней, тогда как в обычном 365. Високосными годами являются все года
 * делящиеся без остатка на 4 за исключением годов, которые делятся нацело на 400
 * Известно:
 *
 * @param year - год
 * @return 'leap year'/'not a leap year'
 */

public class Task07 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int year = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        if(year % 4 == 0 && year % 400 !=0) {
            System.out.print("leap year");
        } else {
            System.out.print("not a leap year");
        }
    }
}