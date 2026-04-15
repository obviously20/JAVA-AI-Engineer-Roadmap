package learing.reflection.creatClass;

public class CreatClass {
    public static void main(String[] args) throws ClassNotFoundException {
        /*获取class对象的三种方式:
            1.Class.forName("全类名");
            2.类名.class
            3.对象.getClass();
        */


        //1.Class.forName("全类名");
        //全类名:包名.类名（去对应类下的类名那里右键复制全类名Copy/Paste->Copy Reference）
        //最为常用的
        Class studentClass = Class.forName("learing.reflection.creatClass.Student");
        System.out.println(studentClass);

        //2.类名.class
        //一般更多的是当做参数进行传递
        Class studentClass2 = Student.class;
        System.out.println(studentClass2);

        //3.对象.getClass()
        //当我们己经有了这个类的对象时，才可以使用。
        Student student = new Student();
        System.out.println(student.getClass());



    }
}
