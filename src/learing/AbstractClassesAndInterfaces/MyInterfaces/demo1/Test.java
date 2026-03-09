package learing.AbstractClassesAndInterfaces.MyInterfaces.demo1;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog("旺财", 1);
        a.eat();
        if (a instanceof Dog d){
            d.swim();
        }

        Animal f = new Forg("蛙子", 2);
        f.eat();
        if (f instanceof Forg f1){
            f1.swim();
        }

        Animal r = new Rabbit("萝卜", 3);
        r.eat();


    }
}
