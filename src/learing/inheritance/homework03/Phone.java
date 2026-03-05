package learing.inheritance.homework03;

public class Phone {
    private String brand;
    private int price;
    public static int size = 6;

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call() {
        System.out.println("正在使用价值"+getPrice()+"的"+getSize()+"寸"+getBrand()+"手机打电话");
    }

     public void sendMessage() {
         System.out.println("正在使用价值"+getPrice()+"的"+getSize()+"寸"+getBrand()+"手机发短信");
     }

     public void playGame() {
         System.out.println("正在使用价值"+getPrice()+"的"+getSize()+"寸"+getBrand()+"手机玩游戏");
     }

}
