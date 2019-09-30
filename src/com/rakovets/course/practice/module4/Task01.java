package com.rakovets.course.practice.module4;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Разработать программу для фитнес браслета:
 * Программа позволяет расчитать количество дней необходимых для подготовки спортсмена к марафону,
 * если известно:
 * @param startDistance дистанция которую пробегает спортсмен до начала тренировки
 * @param finishDistance дистанция которую желает пробежать спортсмен после окончания тренировок
 * @param dailyProgress ежедневный прогресс, который собирается совершать спортсмен
 * @return 'true'/'false'
 *
 * @author Dmitry Rakovets
 * @since 1.0
 */
public class Task01 {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameters:");

        // Код необходимый для тестирования, не изменять
        int startDistance = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int finishDistance = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int dailyProgress = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}