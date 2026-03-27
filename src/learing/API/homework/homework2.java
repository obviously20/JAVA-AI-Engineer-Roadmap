package learing.API.homework;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        /*需求：
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。
        要求:字符串中只能是数字不能有其他字符最少一位，最多10位日不能开头*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String strnum = sc.nextLine();

        //判断字符串是否是数字
        if(!strnum.matches("[1-9]\\d{0,9}")){
            System.out.println("请输入一个整数");
            return;
        }

        //创建一个变量，用于存储转换后的整数
        int num = 0;

        //将字符串转换为整数
        for (int i = 0; i < strnum.length(); i++) {
            //将字符转换为整数
            //这里有个细节：将字符转换为整数时，需要减去'0'
            int  c = strnum.charAt(i) - '0';
            //将整数拼接起来
            num = num*10 +c;
        }
        //输出转换后的整数
        System.out.println("转换后的整数为："+num);

        //验证是否与parseInt方法的结果一致
        System.out.println(num+1);




    }
}
