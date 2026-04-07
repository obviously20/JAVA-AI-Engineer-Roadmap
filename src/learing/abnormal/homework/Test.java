package learing.abnormal.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //需求:
        //键盘录入自己心仪的女朋友姓名和年龄。
        //姓名的长度在3-10之间，
        //年龄的范围为18-40岁，
        //超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
        //提示:
        //需要考虑用户在键盘录入时的所有情况。
        //比如:录入年龄时超出范围，录入年龄时录入了abc等情况

        Scanner sc = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入女朋友的姓名:");
                String name = sc.nextLine();//可能出现长度异常情况-->改造对应的set方法方法，添加判断逻辑
                girlFriend.setName(name);
                System.out.println("请输入女朋友的年龄:");
                String age = sc.nextLine();//可能出现年龄异常情况，比18岁小or 比40岁大-->改造对应的set方法方法，添加判断逻辑
                girlFriend.setAge(Integer.parseInt(age));//可能出现年龄异常情况，录入了abc等情况-->改造对应的set方法方法，添加判断逻辑
                //如果录入的年龄是正确的，就跳出循环
                break;
            } catch (NumberFormatException e) {
//                System.out.println("年龄录入异常,不能录入非数字，请重新录入");
                e.printStackTrace();
//                continue;
            }catch (NameFormatException e){
//                System.out.println("姓名录入异常,姓名长度必须在3-10之间 | 年龄录入异常,年龄范围必须在18-40岁");
                e.printStackTrace();
//                continue;
            }catch (AgeFormatException e){
                e.printStackTrace();
            }
        }

        System.out.println(girlFriend.toString());



    }
}
