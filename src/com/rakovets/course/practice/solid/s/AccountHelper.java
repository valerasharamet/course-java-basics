package com.rakovets.course.practice.solid.s;

public class AccountHelper {
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
        calculateTaxTable(firstMonthTable);
    }

    private static void calculateTaxTable(TaxTable firstMonthTable) {
    }



    private static class TaxTable {
        TaxTable() {

        }

        void add() {

        }
    }

    private static class TaxItem {
        String position;
        int amount;

        public TaxItem() {
        }
    }
}
