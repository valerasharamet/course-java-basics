package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double [] averageMark = new double[marks.length];
        int countSemester = 0;
        double grade = 0.00;
        for (int i = 0 ; i < marks.length; i++) {
            countSemester =0;
            grade = 0.00;
            for (int j = 0; j < marks[i].length; j++) {
                grade = grade + marks[i][j];
                countSemester++;
            }
           averageMark[i] = Math.round((grade/countSemester)*100)/100.00;;
        }
        return averageMark;
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        int [] minMark = new int[marks.length];
        for (int i = 0 ; i < marks.length; i++) {
            int minGrade = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if(marks[i][j] < minGrade) {
                    minGrade = marks[i][j];
                }
            }
            minMark[i] = minGrade;
        }
        return minMark;
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        int [] maxMark = new int[marks.length];
        for (int i = 0 ; i < marks.length; i++) {
            int maxGrade = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if(marks[i][j] > maxGrade) {
                    maxGrade = marks[i][j];
                }
            }
            maxMark[i] = maxGrade;
        }
        return maxMark;
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}