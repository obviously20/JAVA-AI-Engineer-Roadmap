package learing.AbstractClassesAndInterfaces.MyInterfaces.demo4;

public class BasketballPlayer extends Player {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}
