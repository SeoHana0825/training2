package Flowchart.Caffe;

public class Order {

    private final String name;
    private final int price;
    private final String currency;

    public Order(String name, int price, String currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    // 메뉴 보드 디자인
    public String getSimpleInfo() {
        return this.name + " | " + this.price + this.currency;
    }

    // 메뉴 선택 후 상세 내용
    public String getInfo() {
        return this.name + " | " + this.price + this.currency;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
