package learing.InnerClass.AnonymousInnerClass;

public class Test {
//    //方法外，类的里面--成员匿名内部类
//    Swim swim = new Swim() {
//        @Override
//        public void swim() {
//            System.out.println("我会游泳");
//        }
//    };



    public static void main(String[] args) {


        /*1.什么是匿名内部类?
        没有名字（不用自己取类名字，系统会自动给它取个名字）的内部类，是一个特殊的局部内部类。
        隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置。
        2.匿名内部类的格式?
        new 类名或者接口名(){重写方法};
        3.格式的细节
        包含了1继承或实现，2方法重写，3创建对象。
        整体就是一个类的子类对象或者接口的实现类对象
        4.使用场景
        当方法的参数是接口或者类时，以接口为例，可以传递这个接口的实现类对象，
        如果实现类只要使用一次，就可以用匿名内部类简化代码。*/




        //以下这些都是main方法函数里局部的匿名内部类的对象


        //可以参考普通类的创建方式，只是把类名省略了，把类体放到了new后面:Student stu = new Student();
        //1.创建匿名内部类的对象（接口）

        /*Swim stu = new Swim() {
            @Override
            public void swim() {
                System.out.println("我会游泳");
            }
        };
        stu.swim();*/




        //简写
        new Swim()/*替代了Swim接口的实现类*/{/*{}这个才是匿名内部类*/
                @Override
                public void swim() {
                    System.out.println("我会游泳");
                }
        }.swim();/*外面这整个是匿名内部类的对象，是个Swim接口的实现类对象*/



        //且可以调用继承或者实现的（重写）方法
        //类似普通对象调用方法


        test(
                //2.创建匿名内部类的对象（抽象类）
                new Animal(){
                        @Override
                        public void eat() {
                            System.out.println("狗吃骨头");
                        }
                }
        );



    }


    public static void test(Animal animal){
        animal.eat();//编译看左边，运行看右边
    }


}
