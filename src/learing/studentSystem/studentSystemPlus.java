package learing.studentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class studentSystemPlus {
    //学生管理系统升级版本
    //为学生管理系统书写一个登陆、注册、忘记密码的功能。
    //只有用户登录成功之后，才能进入到学生管理系统中进行增删改查操作。
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        //开始界面
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4退出系统");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    login(users);
                    break;//-----------?
                case 2:
                    register(users);
                    break;
                case 3:
                    forgetPassword(users);
                    break;
                case 4:
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }


    //TODO:登录
    public static void login(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入用户名：");
        String username = sc.next();
        //用户名如果未注册，直接结束登录流程，并提示
        int index = getIndex(users, username);
        if (index == -1) {
            System.out.println("用户名未注册，请先注册");
            return;
        }

        System.out.println("请输入密码：");
        String password = sc.next();

        yz:while (true) {
            //随机生成验证码
            String verifyCode = getVerifyCode();
            System.out.println("验证码为：" + verifyCode);
            System.out.println("请输入验证码：");
            String inputVerifyCode = sc.next();
            //再输入验证码，如果不正确，提示用户重新输入
            if (verifyCode.equalsIgnoreCase(inputVerifyCode)) {
                //判断用户名和密码是否正确
                int tryTimes = 3;
                while (true) {
                    if(users.get(index).getPassword().equals(password) && users.get(index).getUsername().equals(username)) {
                        System.out.println("登录成功");
                        //登录成功后，进入学生管理系统
                        //调用菜单
//                        showMenu();
                        /*TODO:
                            如果不想把studenetSystem的代码全部再移过来-->把studentSystem这个原来的测试类改成一个普通的类（...main(String args[])->...StudentSystem()）*/
                        //创建一个学生管理系统对象
                        studentSystem ss = new studentSystem();
                        //然后再调用改后的普通类的开始方法
                        ss.start();


                        //如果不把break yz;放在这里，那么登录成功后，会继续执行yz标签后面的代码，导致登录成功后，还会提示用户输入用户名和密码。
                        break yz;

                    }else{
                        tryTimes--;
                        System.out.println("密码错误,您还有" + tryTimes + "次机会");
                        if(tryTimes == 0) {
                            System.out.println("登录失败,请联系管理员");
                            return;
                        }
                        System.out.println("请重新输入密码：");
                        password = sc.next();
                    }
                }

            }
        }


    }



    //TODO:注册
    public static void register(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        User user = new User();


        while (true) {
            //1->用户名的要求
            System.out.println("请输入用户名：");
            //TODO://开发细节:先验证格式是否正确，再验证是否唯一,因为在以后所有的数据，都是存在数据库中，如果我们要校验，需要使用到网络资源。
            //用户名要唯一
            String username = sc.next();
            boolean isExist = isExist(users, username);
            if(isExist) {
                System.out.println("用户名已存在");
            }else{
                //用户名的长度在3-15之间
                if(username.length() < 3 || username.length() > 15) {
                    System.out.println("用户名的长度需要在3-15之间");
                }else{
                    //用户名只能是字母加数字的组合，但是不能是纯数字
                    boolean isLegal = isLegalName(username);
                    if(isLegal) {
                        user.setUsername(username);
                        break;
                    }else {
                        System.out.println("用户名可以是字母加数字的组合，但是不能是纯数字");
                    }
                }
            }
        }

        //2->密码的要求

        while (true) {
            System.out.println("请输入密码：");
            String password1 = sc.next();
            System.out.println("请确认密码：");
            String password2 = sc.next();
            boolean checkPassword = checkPassword(password1, password2);
            if(checkPassword) {
                user.setPassword(password2);
                break;
            }else {
                System.out.println("两次密码不一致,请重新输入");
            }
        }

        //3->身份证号码的要求
        while (true) {
            System.out.println("请输入身份证号码：");
            String idCard = sc.next();
            //身份证号码的长度是18位
            if(idCard.length() != 18) {
                System.out.println("身份证号码的长度是18位");
            }else{
                //不能以0开头
                if(idCard.charAt(0) == '0') {
                    System.out.println("身份证号码不能以0开头");
                }else{
                    //前17位只能是数字，第18位可以是数字或X
                    boolean idcardLegal = isLegalIdCard(idCard);
                    if(idcardLegal) {
                        user.setIdCard(idCard);
                        break;
                    }else {
                        System.out.println("身份证号码格式错误");
                    }
                }
            }
        }

        //4->手机号码的要求
        while (true) {
            System.out.println("请输入手机号码：");
            String phone = sc.next();
            //手机号码的长度是11位
            if(phone.length() != 11) {
                System.out.println("手机号码的长度是11位");
            }else{
                //不能以0开头
                if(phone.charAt(0) == '0') {
                    System.out.println("手机号码不能以0开头");
                }else{
                    //只能是数字
                    boolean isLegal = phone.matches("[0-9]+");
                    if(isLegal) {
                        user.setPhoneNumber(phone);
                        break;
                    }else {
                        System.out.println("手机号码只能是数字");
                    }
                }
            }
        }

        //5->添加用户
        users.add(user);
        System.out.println("注册成功");

        //遍历用户列表，查看注册的用户信息
        showUsers(users);


    }


    //TODO:忘记密码
    public static void forgetPassword(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        //判断用户名是否存在
        int index = getIndex(users, username);
        if(index == -1) {
            System.out.println("用户名不存在");
            return;
        }else{
            System.out.println("请输入该账号绑定的身份证号码：");
            String idCard = sc.next();
            System.out.println("请输入该账号绑定的手机号码：");
            String phoneNumber = sc.next();
            //判断身份证号码和手机号码是否正确
            if(idCard.equals(users.get(index).getIdCard()) && phoneNumber.equals(users.get(index).getPhoneNumber())) {
                while (true) {
                    System.out.println("请输入新密码：");
                    String newPassword = sc.next();
                    System.out.println("请再确认一次新密码：");
                    String newPassword2 = sc.next();
                    if(newPassword.equals(newPassword2)) {
                        System.out.println("密码修改成功");
                        users.get(index).setPassword(newPassword);
                        break;
                    }else {
                        System.out.println("两次密码不一致,请重新输入");
                    }
                }
            }else{
                System.out.println("身份证号码或手机号码错误,账号信息不匹配，修改失败");
            }
        }

    }


    //用户名要唯一，判断用户名是否存在
    public static boolean isExist(ArrayList<User> users, String username) {
        /*for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;*/
        return getIndex(users, username) == -1 ? false : true;
    }

    //判断用户名是否是字母加数字的组合，但是不能是纯数字
    public static boolean isLegalName(String username) {
        int zmCount = 0;
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            //判断是否只由字母和数字组成
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                    zmCount++;
                }
            }else {
                return false;
            }
        }
        if(zmCount > 0) {
            return true;
        }else {
            return false;
        }
    }

    //检查两次密码是否一致
    public static boolean checkPassword(String password1, String password2) {
        if(password1.equals(password2)) {
            return true;
        }else {
            return false;
        }
    }

    //判断身份证号码是否合法
    public static boolean isLegalIdCard(String idCard) {
        // 1. 检查长度
        if (idCard.length() != 18) {
            return false;
        }

        // 2. 检查前17位是否为数字
        for (int i = 0; i < 17; i++) {
            char ch = idCard.charAt(i);
            if (ch < '0' || ch > '9') {  // 修复条件
                return false;
            }
        }

        // 3. 检查第18位是否为数字或X/x
        char lastChar = idCard.charAt(17);
        if (lastChar >= '0' && lastChar <= '9' || lastChar == 'X' || lastChar == 'x') {
            return true;
        } else {
            return false;
        }
    }


    //判断用户名是否存在，存在则返回下标，不存在则返回-1
    public static int getIndex(ArrayList<User> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    //随机生成验证码
    public static String getVerifyCode() {
        //随机生成4位验证码，包含数字和字母
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String zm = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        //4个字母+1个数字
        int num = random.nextInt(5);//0、1、2、3、4
        boolean haveNum = false;
        for (int i = 0; i < 5; i++) {
            if(i == num && !haveNum) {
                sb.append(random.nextInt(10));
                haveNum = true;
            }else{
                int index = random.nextInt(zm.length());
                sb.append(zm.charAt(index));
            }
        }
        return sb.toString();
    }

    //遍历用户列表，查看注册的用户信息
    public static void showUsers(ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUsername() + " " + users.get(i).getPassword() + " "
                    + users.get(i).getIdCard() + " " + users.get(i).getPhoneNumber());
        }
    }

    //菜单
    public static void showMenu() {
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
        int index = getIndex1(students, id);
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
        int index = getIndex1(students, id);
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
        return getIndex1(students, id) >= 0;
    }

    //通过id返回下标
    public static int getIndex1(ArrayList<Student> students, String id) {
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
