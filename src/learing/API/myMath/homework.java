package learing.API.myMath;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
//        //求一个数是否为素数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        boolean flag = true;
//        for(int i=2;i < Math.sqrt(num)+1;i++){
//            if(num%i==0){
//                flag = false;
//                break;
//            }
//        }
//        if(!flag){
//            System.out.println(num+" is not a prime number");
//        }else{
//            System.out.println(num+" is a prime number");
//        }


//        //求有多少个水仙数
//        int count = 0;
//        for(int i=100; i<1000;i++){
//            int ge = i%10;
//            int shi = i/10%10;
//            int bai =i/100%10;
//            double total = Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3);
//            if(total==i){
//                count++;
//            }
//
//        }
//        System.out.println(count);

        /*自幂数，一个n位自然数等于自身各个数位上数字的n次幂之和
        举例1:三位数
        举例2:四位数
        1^3 +5^3 +3^3=153
        1^4+6^4+3^4+4^3=1634*/
//        //证明没有2位自幂数
//        int count = 0;
//        for(int i=10;i<100;i++){
//            int ge = i%10;
//            int shi = i/10%10;
//            double total = Math.pow(ge,2)+Math.pow(shi,2);
//            if(total==i){
//                count++;
//            }
//        }
//        System.out.println(count);

        //分别统计四叶玫瑰数和五角星数的个数
        int countSi = 0;
        int countEi = 0;
        for (int i = 1000; i < 10000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai =i/100%10;
            int qian = i/1000%10;
            double total = Math.pow(ge,4)+Math.pow(shi,4)+Math.pow(bai,4)+Math.pow(qian,4);
            if(total==i){
                countSi++;
            }
        }
        for (int i = 10000; i < 100000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            int qian = i/1000%10;
            int wan = i/10000%10;
            double total = Math.pow(ge,5)+Math.pow(shi,5)+Math.pow(bai,5)+Math.pow(qian,5)+Math.pow(wan,5);
            if(total==i){
                countEi++;
            }
        }
        System.out.println(countSi);
        System.out.println(countEi);




    }
}
