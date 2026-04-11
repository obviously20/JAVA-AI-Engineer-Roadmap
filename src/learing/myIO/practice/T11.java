package learing.myIO.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class T11 {
    public static void main(String[] args) throws IOException {
        //登录注册2(学生独立完成)
        //需求:写一个登陆小案例(添加锁定账号功能)
        //步骤:
        //将正确的用户名和密码手动保存在本地的userinfo.txt文件中。保存格式为:username=zhangsan&password=123&count=0让用户键盘录入用户名和密码
        //如果一致则打印登陆成功
        //比较用户录入的和正确的用户名密码是否一致
        //如果不一致则打印登陆失败，连续输错三次被锁定，提示用户联系管理员


        // 1. 读取文件
        BufferedReader br = new BufferedReader(new FileReader("src/learing/myIO/tryland/T11.txt"));
        String line;
        ArrayList<String> usernamelist = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            // ✅ 修复：跳过空行！！！（核心修复）
            if (line.trim().isEmpty()) {
                continue;
            }
            usernamelist.add(line);
        }
        br.close();

        ArrayList<String> username = new ArrayList<>();
        ArrayList<String> password = new ArrayList<>();
        ArrayList<Integer> countlist = new ArrayList<>();

        for (String s : usernamelist) {
            String[] arr = s.split("&");
            // ✅ 修复：必须判断长度 >=3 才解析，防止格式错误
            if (arr.length >= 3) {
                try {
                    username.add(arr[0].split("=")[1]);
                    password.add(arr[1].split("=")[1]);
                    countlist.add(Integer.parseInt(arr[2].split("=")[1]));
                } catch (Exception e) {
                    // 格式错误的行直接跳过
                    System.out.println("发现格式错误行：" + s);
                }
            }
        }

        // 2. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uname = sc.nextLine();
        System.out.println("请输入密码：");
        String upwd = sc.nextLine();

        // 3. 查找用户
        int index = -1;
        int count = -1;
        for (int i = 0; i < username.size(); i++) {
            if (username.get(i).equals(uname)) {
                index = i;
                count = countlist.get(i);
                break;
            }
        }

        if (index == -1) {
            System.out.println("用户名不存在");
        } else if (count >= 3) {
            System.out.println("账号已被锁定，请联系管理员");
            return;
        } else if (password.get(index).equals(upwd)) {
            System.out.println("登录成功");
            countlist.set(index, 0);
        } else {
            System.out.println("登录失败");
            count++;
            countlist.set(index, count);

            if (count >= 3) {
                System.out.println("账号已被锁定，请联系管理员");
            } else {
                System.out.println("剩余尝试次数：" + (3 - count));
            }
        }

        // 4. 写回文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/learing/myIO/tryland/T11.txt"));
        for (int i = 0; i < username.size(); i++) {
            bw.write("username=" + username.get(i) + "&password=" + password.get(i) + "&count=" + countlist.get(i));
            bw.newLine();
        }
        bw.close();
    }
}