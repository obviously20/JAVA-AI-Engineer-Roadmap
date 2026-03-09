package learing.AbstractClassesAndInterfaces.MyInterfaces.demo4;

public class PingpangPlayer extends Player implements SpeakEnglish {

    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Playing Pingpang");
    }

    @Override
    public void speak() {
        System.out.println("Speaking English");
    }
}
