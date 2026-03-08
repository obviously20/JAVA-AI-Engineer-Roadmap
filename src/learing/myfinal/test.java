package learing.myfinal;



public class test {
    public static void main(String[] args) {
        //TODO final关键字：最终的，不可改变的
        /*1.final 修饰方法-->final修饰的方法,表明方法是最终方法不能被重写
        * 3.final 修饰变量-->final修饰的变量,表明变量是最终变量（常量）不能被改变
        * 2.final 修饰类-->final修饰的类,表明类是最终类不能被继承*/


        //TODO 常量：final修饰的变量,表明变量是最终变量（常量）不能被改变
        final int a = 10;
        //a = 20; //错误，常量不能被改变

        /*常量

        实际开发中，常量一般作为系统的配置信息，方便维护，提高可读性。

        常量的命名规范：

        - 单个单词：全部大写
        - 多个单词：全部大写，单词之间用下划线隔开

        细节：
        - final修饰的变量是基本类型：那么变量存储的数据值不能发生改变。
        - final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，对象内部的可以改变。*/

        final int[] ARR = {1,2,3,4,5};
//        ARR=new int[2];不能改变引用地址，但是可以改变对象内部的元素值
        ARR[0] = 100;
        ARR[1] = 200;
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }

        final Student stu = new Student(1001,"张三");
//        stu=new Student(1003,"王五");//错误，不能改变引用地址，但是可以改变对象内部的元素值
        stu.setId(1002);
        stu.setName("李四");
        System.out.println(stu.getId());
        System.out.println(stu.getName());

    }
}
//2.final 修饰类-->final修饰的类,表明类是最终类不能被继承
final class fu {
    //1.final 修饰方法-->final修饰的方法,表明方法是最终方法不能被重写
    public final void show() {
        System.out.println("父类的show方法");
    }
}

//class zi extends fu {
////    @Override
////    public void show() {
////        System.out.println("子类的show方法");
////    }
//}
