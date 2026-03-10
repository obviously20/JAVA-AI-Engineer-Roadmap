package learing.InnerClass.MemberInnerClass;

public class Test {
    public static void main(String[] args) {
        /*TODO 获取成员内部变量的两种方式：
        *   1.如果是私有以外的修饰符修饰的成员变量，直接访问就行
        *   2.外部类编写方法，对外提供内部类对象（private）*/

        //TODO：方式1：直接访问
        //详细：可以参考普通的成员变量的访问方式 Student stu = new Student(); 假设a是Student的成员变量sout(new Student().a);==sout(stu.a);
        /*Outer outer = new Outer();
        Outer.Inner oi = outer.new Inner();*/
        //下面是简写的
//        Outer.Inner oi = new Outer().new Inner();

        //TODO：方式2：通过外部类的方法获取内部类对象
        Outer outer = new Outer();
        System.out.println(outer.getInner());

    }
}
