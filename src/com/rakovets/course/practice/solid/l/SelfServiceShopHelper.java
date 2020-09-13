package com.rakovets.course.practice.solid.l;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelfServiceShopHelper {
    public static void main(String[] args) {
        List<Client> queue = new ArrayList<>();
        VipClient mark = new VipClient();
        mark.costBuyItems = 100;
        queue.add(mark);
        SuperVipClient maxim = new SuperVipClient();
        maxim.costBuyItems = 1000;
        queue.add(maxim);
        calculatePaymentClient(queue).stream().forEach(System.out::println);
    }

    static List<Integer> calculatePaymentClient(List<Client> clients) {
        return clients.stream()
                .map(client -> client.costBuyItems *  client.getDiscount() / 100)
                .collect(Collectors.toList());
    }
}
