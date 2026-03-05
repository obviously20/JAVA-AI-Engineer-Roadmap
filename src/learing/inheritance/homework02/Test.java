package learing.inheritance.homework02;

public class Test {
    public static void main(String[] args) {
        //创建一个学生对象
        Student student = new Student("张三", 18, "1班");
        System.out.println("学生姓名："+student.getName()+"，年龄："+student.getAge()+"，班级："+student.getInCalss());
        student.viewSchedule();
        student.fillInClassFeedback();

        //创建一个教师对象
        Teacher teacher = new Teacher("张三", 30, "数学");
        System.out.println("教师姓名："+teacher.getName()+"，年龄："+teacher.getAge()+"，部门："+teacher.getDepartment());
        teacher.viewSchedule();
        teacher.postAQuestion();
    }
}
