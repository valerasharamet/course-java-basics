package com.rakovets.course.challenge.oop.classes;

public class Atm {
    private int banknotesNominal20;
    private int banknotesNominal50;
    private int banknotesNominal100;

    Atm(int banknotesNominal100, int banknotesNominal50, int banknotesNominal20) {
        this.banknotesNominal100 = banknotesNominal100;
        this.banknotesNominal50 = banknotesNominal50;
        this.banknotesNominal20 = banknotesNominal20;
    }

    void addBanknotesNominal20(int count) {
        this.banknotesNominal20 += count;
    }

    void addBanknotesNominal50(int count) {
        this.banknotesNominal50 += count;
    }

    void addBanknotesNominal100(int count) {
        this.banknotesNominal100 += count;
    }

    boolean isExistSetBanknotes(int count) {
        boolean isExistSetBanknotes = false;
        for (int i100 = 0; i100 <= this.banknotesNominal100; i100++) {
            for (int i50 = 0; i50 <= this.banknotesNominal50; i50++) {
                for (int i20 = 0; i20 <= this.banknotesNominal20; i20++) {
                    if ((i100 * 100 + i50 * 50 + i20 * 20) == count) {
                        System.out.printf("%d * 100, %d * 50, %d * 20\n", i100, i50, i20);
                        isExistSetBanknotes = true;
                    }
                }
            }
        }
        return isExistSetBanknotes;
    }

    void display() {
        System.out.printf("100: %d\n50: %d\n20: %d\n", this.banknotesNominal100,
            this.banknotesNominal50, this.banknotesNominal20);
    }
}
