package learing.studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void start/*main*/(/*String[] args*/) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        //TODO:"cycle:while (true)"--循环标签，用于跳出循环
        cycle:
        while (true) {
            System.out.println("---------------------欢迎来到黑马学生管理系统----------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出系统");
            System.out.println("请输入您的选择：");
            String choice = sc.next();
            switch (choice) {
                case "1" -> addStudent(students);
                case "2" -> deleteStudent(students);
                case "3" -> updateStudent(students);
                case "4" -> queryStudent(students);
                case "5" -> {
                    System.out.println("退出系统");
                    //TODO:"break cycle;"--跳出循环标签为"cycle"的循环
                    break cycle;
                    //TODO:方法2：使用System.exit(0);退出系统(停止虚拟机运行，则其里面的代码也会停止运行)
//                    System.exit(0);
                }
                default -> System.out.println("您的输入有误，请重新输入");
            }
        }
    }


    public static void addStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        while (true) {
            System.out.println("请输入学生的id：");
            String id = sc.next();
            //判断id是否唯一
            boolean flag = isUnique(students, id);
            if (flag) {
                System.out.println("该id已存在，请重新输入");
            } else {
                student.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        student.setName(name);

        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        student.setAge(age);

        System.out.println("请输入学生的地址：");
        String address = sc.next();
        student.setAddress(address);

        students.add(student);
        System.out.println("添加学生成功");
    }


    public static void deleteStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id：");
        String id = sc.next();
        //判断id是否存在
        int index = getIndex(students, id);
        if(index == -1) {
            System.out.println("该id不存在");
            return;
        }else if(index >= 0) {
            students.remove(index);
            System.out.println("删除学生成功");
        }

    }


    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id：");
        String id = sc.next();
        int index = getIndex(students, id);
        if(index == -1) {
            System.out.println("该id不存在");
            return;
        }else if(index >= 0) {
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            students.get(index).setName(name);

            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            students.get(index).setAge(age);

            System.out.println("请输入学生的地址：");
            String address = sc.next();
            students.get(index).setAddress(address);

            System.out.println("修改学生成功");
        }
    }


    public static void queryStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息,请添加后查询");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }

    }


    //id要唯一
    public static boolean isUnique(ArrayList<Student> students, String id) {
        /*for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(students, id) >= 0;
    }

    //通过id返回下标
    public static int getIndex(ArrayList<Student> students, String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

}
