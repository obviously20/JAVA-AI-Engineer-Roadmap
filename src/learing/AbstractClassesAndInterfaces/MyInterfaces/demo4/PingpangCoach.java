package learing.AbstractClassesAndInterfaces.MyInterfaces.demo4;

public class PingpangCoach extends Coach implements SpeakEnglish {
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("Teaching Pingpang");
    }

    @Override
    public void speak() {
        System.out.println("Speaking English");
    }
}
