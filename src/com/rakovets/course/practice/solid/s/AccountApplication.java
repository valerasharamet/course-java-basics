package com.rakovets.course.practice.solid.s;

public class AccountApplication {
    public static void main(String[] args) {
        TaxTable firstMonthTable = new TaxTable();
        firstMonthTable.add();
        String where = "SexShop";
        int money = 100;

        AccountPaymnetItemSaver.saveToFile(where, money);

        firstMonthTable.add();
        firstMonthTable.add();
        firstMonthTable.add();
        firstMonthTable.add();
        firstMonthTable.add();
        firstMonthTable.add();
        TaxTable.calculateTaxTable(firstMonthTable);
    }
}
