package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * Необходимо определить, какие символы вводит пользователь:
 * - латиници
 * - кирилица
 * - цифра
 * - спец. символ
 * Так же программа не должна зависеть от регистра. Известно:
 *
 * @param letter - символ введенный пользователем
 * @return 'latin'/'cyrillic'/'digit'/'undefined'
 * <p>
 * Help: Unicode (decimal)
 */

public class Task11 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        char letter = (args.length != 1) ? scanner.next().charAt(0) : args[0].charAt(0);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        if (Character.isDigit(letter)) {
            System.out.print("digit");
        } else if (Character.isAlphabetic(letter)) {
            if (Character.UnicodeBlock.of(letter).equals(Character.UnicodeBlock.CYRILLIC)) {
                System.out.print("cyrillic");
            } else if (Character.UnicodeBlock.of(letter).equals(Character.UnicodeBlock.BASIC_LATIN)){
                System.out.print("latin");
            }
        }
        else System.out.print("undefined");
    }
}