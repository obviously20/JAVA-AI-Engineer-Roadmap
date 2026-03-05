package learing.inheritance.demo1;

public class Test {
    public static void main(String[] args) {
        //创建一个布偶猫对象
        RagdollCat rd = new RagdollCat();
        rd.eat();
        rd.drink();
        rd.catchMouse();//调用直接父类的方法

        System.out.println("------------------");

        //创建一个哈士奇对象
        Husky h = new Husky();
        h.eat();
        h.drink();//调用间接父类的方法
        h.guardTheHouse();//调用直接父类的方法
        h.wreckTheHouse();
    }
}
