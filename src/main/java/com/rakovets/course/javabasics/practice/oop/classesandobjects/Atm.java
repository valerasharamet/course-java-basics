package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBaknotes20;
    int [][] options;

    public Atm (int numberBanknotes100, int numberBanknotes50,int numberBanknotes20) {
        this.numberBaknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public void addBanknotes20(int numberBaknotes20) {
        this.numberBaknotes20 = this.numberBaknotes20+ numberBaknotes20;
    }
    public void addBanknotes50(int numberBaknotes50) {
        this.numberBanknotes50= this.numberBanknotes50+numberBaknotes50;
    }
    public void setNumberBaknotes100(int numberBanknotes100) {
        this.numberBanknotes100 = this.numberBanknotes100+numberBanknotes100;
    }
    public boolean isPossibleIssue(int amount)
    {
        int countOptions = 0;
        int countBanknotes = 0;
        if ((numberBanknotes100*100 + numberBanknotes50*50 + numberBaknotes20*20)<amount)
            return false;
        else if((amount)%10 > 0)
            return false;

        if (numberBanknotes100 > 0) {
            if (amount % numberBanknotes100 == 0) countOptions++;
            else if(numberBanknotes50 >0);

        }

        else if (amount%numberBanknotes50 ==0) countOptions++;
        else if(amount%numberBaknotes20 ==0) countOptions++;
        if (numberBaknotes20 > 0 && amount%numberBaknotes20 == 0) countOptions++;
        if (numberBaknotes50 > 0 && amount%numberBanknotes50 == 0) countOptions++;

        return true;
    }
    public int[][] getOptionsCombinationBanknotes(int amount)
    {
         int [][] result;
       /*  String result = "";
         if (isPossibleIssue(amount))
         {
            if( amount>=100 && numberBanknotes100>0) {
                int count100 = amount / numberBanknotes100;
                        result = "100*"+
            }
         }*/
         return options;
    }

}
