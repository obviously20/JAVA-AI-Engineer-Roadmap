package learing.InnerClass.practice.p3;

public class Phone implements Iplay{
    private String name;
    private int price;

    public Phone() {
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void playGame() {
        System.out.println("是Phone类------玩游戏");
    }
}
