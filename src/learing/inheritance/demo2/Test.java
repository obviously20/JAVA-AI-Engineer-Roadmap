package learing.inheritance.demo2;

public class Test {
    public static void main(String[] args){
        //创建一个哈士奇对象
        Husky hsq = new Husky();
        hsq.eat();
        hsq.drink();
        hsq.lookHome();
        hsq.breakHome();

        System.out.println("------------------");

        //创建一个沙皮狗对象
        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();
        sp.lookHome();

        System.out.println("------------------");

        //创建一个中华田园犬对象
        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();
        cd.lookHome();
    }
}
