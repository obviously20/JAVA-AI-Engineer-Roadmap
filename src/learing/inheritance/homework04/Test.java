package learing.inheritance.homework04;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", "男", 18, "中国", "清华大学", "20200101");
        System.out.println("学生姓名：" + s1.getName()+"，性别："+s1.getGender()+"，年龄："+s1.getAge()+"，国籍："+s1.getNationality()+"，学校："+s1.getSchool()+"，学号："+s1.getStuNumber());
        s1.work();

        StudentLeader sl = new StudentLeader("lisi", "男", 20, "中国", "清华大学", "20200102", "学生干部");
        System.out.println("学生干部姓名：" + sl.getName()+"，性别："+sl.getGender()+"，年龄："+sl.getAge()+"，国籍："+sl.getNationality()+"，学校："+sl.getSchool()+"，学号："+sl.getStuNumber()+"，职务："+sl.getJob());
        sl.work();
        sl.meeting();

        Worker w1 = new Worker("wangwu", "男", 30, "中国", "清华大学", 10);
        System.out.println("工人姓名：" + w1.getName()+"，性别："+w1.getGender()+"，年龄："+w1.getAge()+"，国籍："+w1.getNationality()+"，单位："+w1.getUnit()+"，工作年龄："+w1.getWorkAge());
        w1.work();

    }
}
