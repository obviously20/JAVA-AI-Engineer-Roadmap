package learing.API.homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        /*需求：
        定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制*/

        //先输入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = Integer.parseInt(sc.nextLine());
        //调用方法
        String binary = MyToBinaryString(num);
        System.out.println(binary);

        //验证结果
        System.out.println(Integer.toBinaryString(num));





    }

    private static String MyToBinaryString(int num) {
        //先创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //开始写循环--不知道次数-->while循环;一直除以2，直到商为0，并将每次的余数添加到StringBuilder对象开头中
        while (true){
            //先取余数%
            int temp = num%2;
            //再将余数添加到StringBuilder对象开头中insert(0,temp);
            sb.insert(0,temp);
            //然后将num除以2得到商
            num /= 2;
            //判断商是否为0
            if(num==0){
                break;
            }
        }
        //将StringBuilder对象转换为字符串
        return sb.toString();
    }


}
