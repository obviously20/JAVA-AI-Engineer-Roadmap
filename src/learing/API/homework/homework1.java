package learing.API.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        /*需求：
        键盘录入一些1~100日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。*/

        //先创建一个集合对象
        ArrayList<Integer> list = new ArrayList<>();
        //创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        //开始写循环--不知道次数-->while循环
        while (true){
            //提示用户录入一个整数
            System.out.print("Enter number: ");
            //过滤异常数据
            String strnum = sc.nextLine();
            int num = Integer.parseInt(strnum);
            if(num<1||num>100){
                System.out.println("请输入1~100之间的整数");
                continue;
            }else{
                //将录入的整数添加到集合中
                //这里有个细节：将int类型的num自动装箱为Integer类型的num，再添加到集合中
                //本质上是：
                //Integer num = Integer.valueOf(num);
                list.add(num);

                //判断集合中所有数据和是否超过200
                if(getsum(list)>200){
                    System.out.println("集合中所有数据和超过200");
                    break;
                }
            }
        }



    }

    private static int getsum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum ;
    }
}
