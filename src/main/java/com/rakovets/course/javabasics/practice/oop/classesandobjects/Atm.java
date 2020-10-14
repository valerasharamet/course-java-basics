package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBaknotes20;

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
        boolean res = true;
        if ((numberBanknotes100*100 + numberBanknotes50*50 + numberBaknotes20*20)<amount)
            res = false;
        else if((numberBanknotes100*100 + numberBanknotes50*50 + numberBaknotes20*20)%10 > 0)
            res =false;
        return res;
    }
    public int[] getOptionsCombinationBanknotes(int amount)
    {
         int [] options =
         String result = "";
         if (isPossibleIssue(amount))
         {
            if( amount>=100 && numberBanknotes100>0) {
                int count100 = amount / numberBanknotes100;
                        result = "100*"+
            }
         }
         return  result;
    }

}
