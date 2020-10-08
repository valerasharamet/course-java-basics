package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от количества HP.
 * Меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, в остальных случаях зеленый,
 * если известно:
 *
 * @param healthPointPercentage - количество HP игрока в процентах
 * @return 'RED'/'ORANGE'/'YELLOW'/'GREEN'
 */
public class Task03 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int healthPointPercentage = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        if(healthPointPercentage >= 0 && healthPointPercentage < 25)
            System.out.print("RED");
        if(healthPointPercentage >= 25 && healthPointPercentage < 50 )
            System.out.print("ORANGE");
        if(healthPointPercentage >= 50 && healthPointPercentage < 75 )
            System.out.print("YELLOW");
        if(healthPointPercentage >= 75 && healthPointPercentage <= 100 )
            System.out.print("GREEN");
    }
}