package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения (больше 0 г. н.э. и нет никаких циклических смещений)
 *
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 *
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 *
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        String chineseZodiac= "Chinese Zodiac: undefined" ;
        if ((year - 2001) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Snake";
        if ((year - 2002) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Horse";
        if ((year - 2003) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Ram";
        if ((year - 2004) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Monkey";
        if ((year - 2005) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Rooster";
        if ((year - 2006) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Dog";
        if ((year - 2007) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Pig";
        if ((year - 2008) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Rat";
        if ((year - 2009) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Ox";
        if ((year - 2010) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Tiger";
        if ((year - 2011) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Rabbit";
        if ((year - 2012) % 12 == 0 ) chineseZodiac = "Chinese Zodiac: Dragon";

        switch (month)
        {
            case 1:
                if (day <= 20) System.out.println("Zodiac Sign: Goat. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Water-bearer. "+chineseZodiac);
                break;
            case 2:
                if (day <= 19) System.out.println("Zodiac Sign: Water-bearer. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Fish. "+chineseZodiac);
                break;
            case 3:
                if (day <= 20) System.out.println("Zodiac Sign: Fish. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Ram. "+chineseZodiac);
                break;
            case 4:
                if (day <= 20) System.out.println("Zodiac Sign: Ram. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Bull. "+chineseZodiac);
                break;
            case 5:
                if (day <= 20) System.out.println("Zodiac Sign: Bull. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Twins. "+chineseZodiac);
                break;
            case 6:
                if (day <= 21) System.out.println("Zodiac Sign: Twins. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Crab. "+chineseZodiac);
                break;
            case 7:
                if (day <= 22) System.out.println("Zodiac Sign: Crab. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Lion. "+chineseZodiac);
                break;
            case 8:
                if (day <= 22) System.out.println("Zodiac Sign: Lion. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Maiden. "+chineseZodiac);
                break;
            case 9:
                if (day <= 21) System.out.println("Zodiac Sign: Maiden. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Scales. "+chineseZodiac);
                break;
            case 10:
                if (day <= 22) System.out.println("Zodiac Sign: Scales. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Scorpion. "+chineseZodiac);
                break;
            case 11:
                if (day <= 22) System.out.println("Zodiac Sign: Scorpion. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Archer. "+chineseZodiac);
                break;
            case 12:
                if (day <= 21) System.out.println("Zodiac Sign: Archer. "+chineseZodiac);
                else System.out.println("Zodiac Sign: Goat. "+chineseZodiac);
                break;
        }
    }
}