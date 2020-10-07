package com.rakovets.course.javabasics.practice.loops;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 *
 * @param amount сумма
 * @author Dmitry Rakovets
 * @version 1.0
 * @return сумма в бухгалтерском формате
 */
public class Task06 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);

        // Код необходимый для тестирования, не изменять
        long amount = (args.length != 1 ? scanner.nextLong() : Long.parseLong(args[0]));

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        boolean minus = false;
        if(amount<0)
        {
            minus = true;
            amount = -amount;
        }
        String strAmount = Long.toString(amount);
        String strReturn = "";
        int count = strAmount.length()/3;
        int div= strAmount.length() % 3;
        if ( div == 0 )
        {
            strReturn = strAmount.substring(0,3)+" ";
            strAmount = strAmount.substring(3,strAmount.length());
        }
        else
        {
            strReturn = strAmount.substring(0,div)+" ";
            strAmount=strAmount.substring(div,strAmount.length());
        }
        for ( int i = 0;i < strAmount.length()/3;i++)
        {
            int idx = i*3;
            strReturn =  strReturn + strAmount.substring(idx,idx+3)+" ";
        }
        if (minus == true)  System.out.print("-"+strReturn);
        else System.out.print(strReturn);
    }
}