package learing.polymorphism.demo1;

public class Test {
    public static void main(String[] args) {
        Person student = new Student();
        student.setName("张三");
        student.setAge(18);

        Person teacher = new Teacher("马保国",42);

        Administrator administrator = new Administrator();
        administrator.setName("李四");
        administrator.setAge(30);


        show(student);
        show(teacher);
        show(administrator);
    }

    public static void show(Person person){
        person.show();
    }
}
