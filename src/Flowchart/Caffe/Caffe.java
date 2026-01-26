package Flowchart.Caffe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Caffe {
    public static void main(String[] args) {

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("아메리카노", 4000, "원"));
        orderList.add(new Order("카페라테", 4500, "원"));
        orderList.add(new Order("카푸치노", 4500, "원"));
        orderList.add(new Order("녹차", 4000, "원"));
        orderList.add(new Order("핫초코", 5000, "원"));

        List<Order> cartOrders = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("== 메뉴를 선택해 주세요 ==");

            for (Integer i = 0; i < orderList.size(); i++) {

                System.out.println(i + 1 + ". " + orderList.get(i).getSimpleInfo());
            }
            System.out.println("0. 종료/결제하기");

            int result = 0;

            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 선택해 주세요");
            }

            if (result > 0 && result <= orderList.size()) {
                Order order = orderList.get(result - 1);
                cartOrders.add(order);
                System.out.println(">>> " + order.getName() + order.getPrice());
            } else if (result == 0) {
                System.out.println("=== 주문 내역 ===");
                int total = 0;

                for (Order order : cartOrders) {
                    System.out.println(order.getInfo());
                    total += order.getPrice();
                }

                System.out.println();
                System.out.println("===============");
                System.out.println("총 결제 금액 : " + total + "원");
                System.out.println("===============");

                System.out.println();

                cartOrders.clear();
            }
        }
    }
}
