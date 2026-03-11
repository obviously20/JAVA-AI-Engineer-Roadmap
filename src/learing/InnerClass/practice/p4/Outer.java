package learing.InnerClass.practice.p4;

public class Outer implements Inner {

    public static Outer method() {
        return new Outer();
    }

    @Override
    public void show() {
        System.out.println("HelloWorld");
    }
}
