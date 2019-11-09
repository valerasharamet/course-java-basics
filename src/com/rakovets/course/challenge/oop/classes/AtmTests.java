package com.rakovets.course.challenge.oop.classes;

public class AtmTests {
    public static void main(String[] args) {
        Atm atmBelarusBank = new Atm(1, 1, 1);
        atmBelarusBank.display();
        atmBelarusBank.addBanknotesNominal100(50);
        atmBelarusBank.addBanknotesNominal50(190);
        atmBelarusBank.addBanknotesNominal20(590);
        atmBelarusBank.display();
        System.out.println("Get Money? " + atmBelarusBank.isExistSetBanknotes(100));
    }
}
