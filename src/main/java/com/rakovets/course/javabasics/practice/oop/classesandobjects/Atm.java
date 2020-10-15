package com.rakovets.course.javabasics.practice.oop.classesandobjects;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Atm {
    private int numberBanknotes100;
    private int numberBanknotes50;
    private int numberBanknotes20;
    public ArrayList< int[]> options = new ArrayList<>();

    public Atm (int numberBanknotes100, int numberBanknotes50,int numberBanknotes20) {
        if (numberBanknotes100<0 || numberBanknotes50<0 || numberBanknotes20 < 0)
            System.out.print("Please, check number of banknotes. It can't be < 0 ");
        this.numberBanknotes20 = numberBanknotes20;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes100 = numberBanknotes100;
    }
    public void addBanknotes20(int numberBaknotes20) {
        this.numberBanknotes20 = this.numberBanknotes20+ numberBaknotes20;
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
        int countBanknotes100,countBanknotes50,countBanknotes20 = 0;
        if ((numberBanknotes100*100 + numberBanknotes50*50 + numberBanknotes20*20)<amount)
            return false;
        else if((amount)%10 > 0)
            return false;
        if(numberBanknotes100 > 0 && numberBanknotes50 > 0 && numberBanknotes20 > 0 ){
            if(amount%numberBanknotes100 == 0) {
                countBanknotes100= amount / 100;
                int [] arr = new int[3];
                arr[0] = countBanknotes100;
                arr[1] = 0;
                arr[2] = 0;
                options.add(arr);
               /* while(countBanknotes100>=2)
                {
                    countBanknotes100--;
                    countBanknotes50 = (amount-countBanknotes100*100)/numberBanknotes50;
                    if( numberBanknotes50 > countBanknotes50 )
                        options.add(countBanknotes100 + "/" +countBanknotes50+"/0");
                    countBanknotes20 =  (amount-countBanknotes100*100)/numberBanknotes20;
                    if( numberBanknotes20 > countBanknotes20 )
                        options.add(countBanknotes100 + "/0/" +countBanknotes20);
                  /*  while (countBanknotes20 >=2)
                    {
                        countBanknotes20--;
                        countBanknotes50 = (amount-countBanknotes50*50)/numberBanknotes50;
                        if( numberBanknotes50 > countBanknotes50 )
                            options.add(countBanknotes100 + "/" +countBanknotes100+"/0");
                    }
                }*/
            }
            if(amount%numberBanknotes50 == 0) {
                countBanknotes50= amount / 50;
                int [] arr = new int[3];
                arr[0] = 0;
                arr[1] = countBanknotes50;
                arr[2] = 0;
                options.add(arr);
            }
            if(amount%numberBanknotes20 == 0) {
                countBanknotes20= amount / 20;
                int [] arr = new int[3];
                arr[0] = 0;
                arr[1] =0 ;
                arr[2] = countBanknotes20;
                options.add(arr);
            }

        }
       /* if(numberBanknotes100 > 0 && numberBanknotes50 > 0 && numberBanknotes20 == 0 ){
            if(amount%numberBanknotes100 == 0) countOptions++;
            if(amount%numberBanknotes50 == 0) countOptions++;
            if(amount%numberBanknotes20 == 0) countOptions++;
        }
        if(numberBanknotes100 > 0 && numberBanknotes50 == 0 && numberBanknotes20 >0 ){
            if(amount%numberBanknotes100 == 0) countOptions++;
            if(amount%numberBanknotes20 == 0) countOptions++;
        }
        if(numberBanknotes100 > 0 && numberBanknotes50 > 0 && numberBanknotes20 == 0 ){
            if(amount%numberBanknotes100 == 0) countOptions++;
            if(amount%numberBanknotes20 == 0) countOptions++;
        }
        if(numberBanknotes100 > 0 && numberBanknotes50 == 0 && numberBanknotes20  == 0 ){
            if(amount%numberBanknotes100 == 0) countOptions++;

        }

        if(numberBanknotes100 == 0 && numberBanknotes50 > 0 && numberBanknotes20 > 0 ){

        }
        if(numberBanknotes100 == 0 && numberBanknotes50 == 0 && numberBanknotes20 > 0 ){

        }
        if(numberBanknotes100 == 0 && numberBanknotes50 > 0 && numberBanknotes20 == 0 ){

        }
        if (numberBanknotes20 > 0 && amount%numberBanknotes20 == 0) countOptions++;

        if (numberBanknotes100 > 0 && amount%numberBanknotes100 !=0) {
            countBanknotes = amount/numberBanknotes100;
            if (countBanknotes>0){

            }
            if (amount  numberBanknotes100 == 0) countOptions++;
            else if(numberBanknotes50 >0)

        }

        else if (amount%numberBanknotes50 ==0) countOptions++;
        else if(amount%numberBanknotes20 ==0) countOptions++;
        if (numberBanknotes20 > 0 && amount%numberBanknotes20 == 0) countOptions++;
        if (numberBanknotes50 > 0 && amount%numberBanknotes50 == 0) countOptions++;*/
        if(options.size()==0) return false;
        return true;
    }
    public ArrayList<int[]> getOptionsCombinationBanknotes(int amount)
    {
            for(int i=0; i<options.size(); i++)
            {
                int opt= i+1;
                int [] arr= options.get(i);
                String str100 = "";
                String str50 = "";
                String str20 = "";
                if(arr[0]>0)  str100 = arr[0] +"x100  ";
                if(arr[1]>0)  str50 = arr[1] +"x50  ";
                if(arr[2]>0)  str20 = arr[2] +"x20";
                System.out.println( opt+ "\t"+ str100 + str50 + str20);
            }
        return options;
    }
    public String getCash(int option)
    {
        String result="";
        int [] arr= options.get(option-1);
        switch (option)
        {
            case 1: result = arr[0] +"x100"; break;
            case 2: result = arr[1] +"x50"; break;
            case 3: result = arr[2] +"x20"; break;
        }
        return result;
    }
}
