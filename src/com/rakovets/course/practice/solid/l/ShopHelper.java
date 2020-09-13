package com.rakovets.course.practice.solid.l;

public class ShopHelper {
    public static void main(String[] args) {
        VipClient mark = new VipClient();
        int costBuyItems = 100;
//        int resultDiscount = costBuyItems *  mark.getVipDiscount() / 100;
//        int resultCost = costBuyItems - resultDiscount;
//        System.out.println(resultCost);

        SuperVipClient maxim = new SuperVipClient();
        int costBuyItems2 = 100;
//        int resultDiscount2 = costBuyItems2 *  maxim.getSuperVipDiscount() / 100;
//        int resultCost2 = costBuyItems2 - resultDiscount2;
//        System.out.println(resultCost2);
    }
}
