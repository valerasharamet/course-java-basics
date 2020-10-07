package com.rakovets.course.javabasics.practice.methods;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy. В профиле игрока месяц
 * еобходимо выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task05 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        byte monthNumber = INPUT_SCANNER.nextByte();

        getNameMonth(monthNumber);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber - номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getNameMonth(byte monthNumber) {
        switch (monthNumber)
        {
            case 1: return "JANUARY";
            case 2: return "FEBRUARY";
            case 3: return "MARCH";
            case 4: return "APRIL";
            case 5: return "MAY";
            case 6: return "JUNE";
            case 7: return "JULY";
            case 8: return "AUGUST";
            case 9: return "SEPTEMBER";
            case 10: return "OCTOBER";
            case 11: return "NOVEMBER";
            case 12: return "DECEMBER";
            default: return null;
        }
    }
}