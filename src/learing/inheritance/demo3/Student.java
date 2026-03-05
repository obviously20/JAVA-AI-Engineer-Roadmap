package learing.inheritance.demo3;

public class Student extends Person{
        public Student() {
            //TODO:子类实现无参构造时，默认会调用父类的无参构造方法（在第一行调用）
            super();//不管写不写，第一行，都默认调用父类的无参构造方法
            System.out.println("Student类（子类）的无参构造方法被调用");
        }

        //子类的有参构造方法，默认也会调用父类的无参构造方法（在第一行调用）
        public Student(String name, int age) {
            super(name, age);//调用父类的有参构造方法
            System.out.println("Student类（子类）的有参构造方法被调用");
        }
}
