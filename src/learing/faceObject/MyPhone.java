package learing.faceObject;

public class MyPhone {
    private String brand;
    private double price;
    private String color;

    public MyPhone(){

    }
    public MyPhone(String brand,double price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void call(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话....");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机发短信....");
    }
}
