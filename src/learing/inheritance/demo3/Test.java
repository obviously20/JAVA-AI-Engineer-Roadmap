package learing.inheritance.demo3;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("张三", 18);
        System.out.println(s2.name+" "+s2.age);
    }
}
