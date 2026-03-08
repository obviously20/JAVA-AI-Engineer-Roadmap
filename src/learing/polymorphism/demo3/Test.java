package learing.polymorphism.demo3;

public class Test {
    public static void main(String args[]){
        //TODO:多态的优势：在多态的形式下，右边的对象可以实现解耦合，便于拓展和维护（方法中，使用父类型作为参数，可以接收子类对象）
        //现在用到的是new Dog() 再过多几年要变另一个对象的时候，直接改new 就行，后面的不用改
//        Animal a = new Dog();
//        a.eat();

        //TODO：多态的劣势：不能使用子类的特有功能
        //TODO:小->大：自动类型转换
        Animal a = new Dog();
        a.eat();
        //但是不能使用子类的特有功能,会报错
//        a.lookhome();

        //TODO:如何解决？———可以转换成真正的子类类型，从而调用子类特有的方法———进行类型转换(自动类型转换、强制类型转换)
        //TODO:大->小（父类->子类）:强制类型转换
        //Dog d = (Dog)a;
        //d.lookhome();
        //TODO:但要注意类型转换不是随便转Dog->Cat X 报错
//        Cat c = (Cat)a;
//        c.lookhome();
        //TODO 所以要对类型先进行判断再进行转换------关键字instanceof
        /*if(a instanceof Dog){
            Dog d = (Dog)a;
            d.lookhome();
        } else if (a instanceof Cat) {
            Cat c = (Cat)a;
            c.catchMouse();
        }else{
            System.out.println("没有这个种类");
        }*/

        //TODO 上面还有更加方便的jdk14新特性
        //“a instanceof Dog d”: 先判断变量a是否是Dog类型，是的话：将其强转复值给类型为Dog的变量d
        //不是的话，返回false
        if(a instanceof Dog d){
            d.lookhome();
        } else if (a instanceof  Cat c) {
            c.catchMouse();
        }else {
            System.out.println("没有这个种类");
        }





    }
}

class Animal{
    String variety;

    public void eat(){
        System.out.println("Animal---eat()");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog--eat()");
    }

    public void lookhome(){
        System.out.println("Dog--lookhome()");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat--eat()");
    }

    public void  catchMouse(){
        System.out.println("Cat--catchMouse()");
    }
}
