package learing;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        /*卖飞机票
//        需求:
//        机票价格按照淡季旺季、头等舱和经济舱收费、输入原价机票、月份和头等舱或经济舱。
//        按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7折，经济舱6.5折。
//        */
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//        while (flag) {
//            System.out.println("请输入原价机票：");
//            double price = sc.nextDouble();
//            System.out.println("请输入现在的月份:");
//            int mouth = sc.nextInt();
//            System.out.println("请输入你要购买的舱位（头等舱：1，经济舱：2）");
//            int type = sc.nextInt();
//            // 检验输入是否合法
//            if (mouth < 1 || mouth > 12 || price <= 0 || type != 1 && type != 2) {
//                System.out.println("输入错误，请重新输入");
//                continue;
//            } else {
//                switch (type) {
//                    case 1 -> {
////                        if (mouth >= 5 && mouth <= 10) {
////                            System.out.println("旺季优惠后的机票价格为：" + (price * 0.9));
////                        } else {
////                            System.out.println("淡季优惠后的机票价为：" + (price * 0.7));
////                        }
//                        // 调用方法输出结果
//                        outputPrice(mouth,price,0.9,0.7);
//                    }
//                    case 2 -> {
////                        if (mouth >= 5 && mouth <= 10) {
////                            System.out.println("旺季优惠后的机票价为：" + (price * 0.85));
////                        } else {
////                            System.out.println("淡季优惠后的机票价为：" + (price * 0.65));
////                        }
//                        // 调用方法输出结果
//                        outputPrice(mouth,price,0.85,0.65);
//                    }
//                }
//            }
//            flag = false;
//        }

//        /*判断 101-200 之间有多少个素数，并输出所有素数。*/
//        int count=0;
//        int col=0;
//        for(int i=101;i<201;i++){
//            if(isPrime(i)){
//                count++;
//                col++;
//                System.out.printf("%d ",i);
//                if(col%5==0){
//                    System.out.println();
//                }
//            }
//            if(i==200){
//                System.out.println();
//            }
//        }
//        System.out.println("101-200之间有"+count+"个素数");


//        String code=getCode();
//        System.out.println("随机产生的验证码为："+code);

//        String code1=getCode1();
//        System.out.println("随机产生的验证码为："+code1);

//        /*评委打分
//        需求:
//        在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
//        选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述对程并计算出选手的得分。*/
//        Scanner sc = new Scanner(System.in);
//        int[] scores = new int[6];
//        for (int i = 0; i < 6; i++) {
//            if (i == 0) {
//                System.out.printf("请输入第(%d)个评委的打分：", i+1);
//            } else {
//                System.out.printf("\n请输入第(%d)个评委的打分：", i+1);
//            }
//            scores[i] = sc.nextInt();
//            // 判断是否合法
//            if(scores[i]<0||scores[i]>100){
//                System.out.println("输入错误，请重新输入");
//                i--;
//                continue;
//            }
//        }
//        // 先找最小再找最大，不然会有bug
//        wipeOffMin(scores);
//        wipeOffMax(scores);
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }
//        double avgScore=averageScore(scores);
//        System.out.println("选手的最终得分是："+avgScore);

//        /*TODO:有bug，当加密后的密码为0时，倒转过来的步骤（因为是int类型，所以会丢失0的那个位）*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的密码：");
//        int password=sc.nextInt();
////        String password1="";
//        int password1=0;
//        while(password!=0){
//            int wei=password%10;
//            wei=encrypt(wei);
//            password/=10;
//            password1=wei+password1*10;
//        }
//
//        // 加密后的密码
//        System.out.println(password1);
//
//        // 解密后的密码
//        int password2=0;
//        while(password1!=0){
//            int wei=password1%10;
//            wei=decrypt(wei);
//            password1/=10;
//            password2=wei+password2*10;
//        }
//        System.out.println(password2);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的密码：");
//        int password=sc.nextInt();
//        int[] arr=inputArray(password);
//        // 加密
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=(arr[i]+5)%10;
//        }
//        // 反转
//        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//        // 输出加密后的密码
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//
//
//
//        // 解密
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]-=5;
//            if(arr[i]<0){
//                arr[i]+=10;
//            }
//        }
//        // 反转
//        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//
//        // 输出解密后的密码
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        /*TODO*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你购买的彩票号码：");
        // 输入彩票号码，并校验
        int[] guess = inputGuess();
        // 生成开奖号码
        int[] award = creatAward();
        // 比较号码
        int[] result = compare(guess, award);
        //查找表，得奖励
        int getprice = getAward(result);
        System.out.println("你购买的彩票号码为：" + guess[0] + " " + guess[1] + " " + guess[2] + " " + guess[3] + " " + guess[4] + " " + guess[5] + " " + guess[6]);
        System.out.println("开奖号码为：" + award[0] + " " + award[1] + " " + award[2] + " " + award[3] + " " + award[4] + " " + award[5] + " " + award[6]);
        System.out.println("你购买的彩票号码与开奖号码的对比结果为：" + result[0] + "个红球" + result[1] + "个篮球");
        System.out.println("你购买的彩票号码的奖励为：" + getprice);


    }

    public static void outputPrice(int mouth, double price, double wj, double dj) {
        if (mouth >= 5 && mouth <= 10) {
            System.out.println("旺季优惠后的机票价格为：" + (price * wj));
        } else {
            System.out.println("淡季优惠后的机票价为：" + (price * dj));
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*需求:
        定义方法实现随机产生一个5位的验证码
        验证码格式:
        长度为5
        前四位是大写字母或者小写字母
        最后一位是数字*/
    public static String getCode() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String code = "";
        // 随机产生4个字母
        for (int i = 0; i < 4; i++) {
            // 大小写字母，大写：0，小写：1
            int type = r.nextInt(2);//0-1
            int random = r.nextInt(26);//0-25(a-z)
            switch (type) {
                case 0:
                    // 大写字母 A(65)-Z
                    code += (char) (random + 65);
                    break;
                case 1:
                    // 小写字母 a(97)-z
                    code += (char) (random + 97);
                    break;
            }
        }
        // 随机产生一个数字
        int randomNum = r.nextInt(10);//0-9
        code += randomNum;
        return code;
    }

    /*如果改一下，要求数字的位置是随机的*/
    public static String getCode1() {
        Random r = new Random();
        String code = "";
        // 标记数字是否存在过
        boolean hasNum = false;
        // 随机产生5个随机（包含4字母1数字，位置不定）
        for (int i = 0; i < 5; i++) {
            // 大小写字母，大写：0，小写：1，数字：2
            int type = r.nextInt(3);//0-2
//            int random = r.nextInt(26);//0-25(a-z)
            // 保底有一个数字
            if (i == 4 && !hasNum) {
                type = 2;
            }
            switch (type) {
                case 0:
                    // 大写字母 A(65)-Z
                    code += (char) (r.nextInt(26) + 65);
                    break;
                case 1:
                    // 小写字母 a(97)-z
                    code += (char) (r.nextInt(26) + 97);
                    break;
                case 2:
                    if (!hasNum) {
                        int randomNum = r.nextInt(10);//0-9
                        code += randomNum;
                        hasNum = true;
                        break;
                    } else {
                        int change = r.nextInt(2);//0-1
                        if (change == 0) {
                            code += (char) (r.nextInt(26) + 65);
                        } else {
                            code += (char) (r.nextInt(26) + 97);
                        }
                        break;
                    }
            }
        }
        return code;
    }

    /*数组元素的复制
    需求:
    把一个数组中的元素复制到另一个新数组中去*/
    public static void copyArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    public static void wipeOffMax(int[] arr) {
        // 默认最大值的下标为0，来打擂台
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        // 找出最大值的下标之后，将其赋值为0，相当于去掉最大值
        arr[index] = 0;
        // 在这里改了之后，原来的也会改，指向的内存地址不变
    }

    public static void wipeOffMin(int[] arr) {
        // 默认最小值的下标为0，来打擂台
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] > arr[i]) {
                index = i;
            }
        }
        // 找出最小值的下标之后，将其赋值为0，相当于去掉最小值
        arr[index] = 0;
        // 在这里改了之后，原来的也会改，指向的内存地址不变
    }

    public static double averageScore(int[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum / (arr.length - 2));
    }


    /*需求:
    某系统的数字密码(大于0)，比如1983，采用加密方式进行传输。
    规则如下:
    先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。*/

//    // 加密方法
//    public static int encrypt(int number){
//        number+=5;
//        number%=10;
//        return number;
//    }
//
//    // 反转方法
//    public static int reverse(int strNumber){
//        int reverseNumber=0;
//        while(strNumber!=0){
//            int place=strNumber%10;
//            strNumber/=10;
//            reverseNumber=reverseNumber*10+place;
//        }
//        return reverseNumber;
//    }
//
//    //解密
//    public static int decrypt(int number){
//        number-=5;
//        if(number<0){
//            number+=10;
//        }
//        return number;
//    }

    public static int[] inputArray(int password) {
        // 先计算密码的位数
        int count = 0;
        int temp = password;
        while (password != 0) {
            password /= 10;
            count++;
        }
        // 定义数组长度（动态）
        int[] arr = new int[count];
        // 把password存进数组
        int index = arr.length - 1;
        while (temp != 0) {
            arr[index] = temp % 10;
            temp /= 10;
            index--;
        }
        return arr;
    }

    /*双色球系统
    投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择。*/
    // 红球号码不能重复
    public static boolean isExist(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    //随机生成中奖号码
    public static int[] creatAward() {
        Random r = new Random();
        int[] award = new int[7];
        //生成红球号码
        for (int i = 0; i < award.length - 1; ) {
            //1-33
            int number = r.nextInt(33) + 1;
            if (!isExist(award, number)) {
                award[i] = number;
                i++;
            }
        }
        // 生成篮球的号码
        //1-16
        award[6] = r.nextInt(16) + 1;
        return award;
    }

    // 比较方法
    public static int[] compare(int[] guess, int[] aword) {
        int redCount = 0;
        int bullCount = 0;
        for (int i = 0; i < guess.length - 1; i++) {
            for (int j = 0; j < aword.length - 1; j++) {
                if (guess[i] == aword[j]) {
                    redCount++;
                    break;
                }
            }
        }
        if (guess[6] == aword[6]) {
            bullCount++;
        }
        return new int[]{redCount, bullCount};
    }


    public static int getAward(int[] result) {
        int redCount = result[0];
        int bullCount = result[1];
        if (redCount == 6 && bullCount == 1) {
            return 100000000;
        } else if (redCount == 6 && bullCount == 0) {
            return 50000000;
        } else if (redCount == 5 && bullCount == 1) {
            return 30000;
        } else if (redCount == 5 && bullCount == 0) {
            return 200;
        } else if (redCount == 4 && bullCount == 1) {
            return 200;
        } else if (redCount == 4 && bullCount == 0) {
            return 10;
        } else if (redCount == 3 && bullCount == 1) {
            return 10;
        } else if (redCount == 2 && bullCount == 1) {
            return 5;
        } else if (redCount == 1 && bullCount == 1) {
            return 5;
        } else if (redCount ==0&&bullCount==1) {
            return 5;
        } else {
            return 0;
        }

    }

    //输入彩票号码并校验
    public static int[] inputGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你购买的彩票号码：");
        // 输入彩票号码，并校验
        int[] guess = new int[7];
        for (int i = 0; i < guess.length; i++) {
            System.out.printf("请输入第%d个号码：", i + 1);
            int number = sc.nextInt();
            if (i < guess.length - 1) {
                if (number < 1 || number > 33) {
                    System.out.println("红球号码必须在1-33之间");
                    i--;
                    continue;
                }
                if (isExist(guess, number)) {
                    System.out.println("红球号码不能重复");
                    i--;
                    continue;
                }
                guess[i] = number;

            } else {
                if (number < 1 || number > 16) {
                    System.out.println("篮球号码必须在1-16之间");
                    i--;
                    continue;
                }
                guess[i] = number;
            }
        }
        return guess;
    }


}
