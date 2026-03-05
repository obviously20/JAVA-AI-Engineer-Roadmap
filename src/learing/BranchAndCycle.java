package learing;

public class BranchAndCycle {
    public static void main(String[] args) {
        /* TODO 流程控制
         *   1.顺序执行(按照文本顺序)
         *   2.分支执行(switch)
         *   3。重复执行(for/while)
         *   （其中都有条件判断）*/

        //TODO : 条件语句
//        /*老丈人选女婿
//        需求:键盘录入女婿酒量，如果大于2斤，老丈人给出回应，反之不回应*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的酒量：");
//        double L=sc.nextDouble();
//        if(L>2){
//            System.out.println("小伙子不错！");
//        }else{
//            System.out.println("哼");
//        }

//        /*需求:键盘录入一个整数，表示身上的钱，如果大于等于100块，就是网红餐厅，否则，就吃经济实惠的沙县小吃*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你身上的钱有多少：");
//        double momeny = sc.nextDouble();
//        if(momeny>=100){
//            System.out.println("去网红餐厅");
//        }else {
//            System.out.println("沙县");
//        }

//        /*商品付款
//        在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式需求:
//        假设，用户在超市实际购买，商品总价为:600元。键盘录入一个整数表示用户实际支付的钱，如果付款大于等于600，表示付款成功。否则付款失败。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的付款金额：");
//        double pay=sc.nextDouble();
//        if(pay>=600){
//            System.out.println("succer");
//        }else{
//            System.out.println("fail");
//        }

//        /*假设某影院售卖了100张票，票的序号为1~100.其中奇数票号坐左侧，
//        偶数票号坐右侧。键盘录入一个整数表示电影票的票号。根据不同情况，给出不同的提示:如果票号为奇数，那么打印坐左边如果票号为偶数，那么打印坐右边。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你想购买的座位：(1-100)");
//        int sit = sc.nextInt();
//        if(sit>0&&sit<100) {
//            if (sit % 2 == 0) {
//                System.out.println("右侧" + sit);
//            } else {
//                System.out.println("左侧" + sit);
//            }
//        }else{
//            System.out.println("输入错误");
//        }

//        /*商品的价格
//        在实际开发中，多种情况判断时，会用到if的第三种格式:
//        需求:
//        商场都会有VIP的会员制，根据不同的会员会有不同的折扣。假设商品总价为1000，
//        键盘录入会员级别，并计算出实际支付的钱，
//        会员1级:打9折。
//        会员2级:打8折。
//        会员3级:打7折。
//        非会员:不打折，要打也是打骨折。*/
//        Scanner sc = new Scanner(System.in);
//        double pay = 1000;
//        System.out.println("请输入你的会员等级：");
//        int lever = sc.nextInt();
//        if(lever>=1 && lever<=3){
//            if(lever==1){
//                pay=pay*0.9;
//                System.out.println("打0.9折，要付"+pay);
//            }else if(lever==2){
//                pay=pay*0.8;
//                System.out.println("打0.8折，要付"+pay);
//            }else{
//                pay=pay*0.7;
//                System.out.println("打0.7折，要付"+pay);
//            }
//        }else{
//            System.out.println("不打折，要打也是打骨折，要付"+pay);
//        }


//        /*运动计划
//        需求:键盘录入星期数，显示今天的减肥活动，
//        周一:跑步
//        周二:游泳
//        周三:慢走
//        周四:动感单车
//        周五:拳击
//        周六:爬山
//        周日:好好吃一顿*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入今天星期几？");
//        int day = sc.nextInt();
//        if (day >= 1 && day <= 7) {
//            switch (day) {
//                case 1:
//                    System.out.println("跑步");
//                    break;
//                case 2:
//                    System.out.println("游泳");
//                    break;
//                case 3:
//                    System.out.println("慢走");
//                    break;
//                case 4:
//                    System.out.println("动感单车");
//                    break;
//                case 5:
//                    System.out.println("拳击");
//                    break;
//                case 6:
//                    System.out.println("爬山");
//                    break;
//                default:
//                    System.out.println("hhc");
//                    break;
//            }
//        }else{
//            System.out.println("输入格式不正确");
//        }

        //TODO : switch穿透的利用
        /*需求:键盘录入星期数，输出工作日、休息日。(1-5)工作日，(6-7)休息日。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入星期数");
//        int week = sc.nextInt();
//        switch (week) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("工作日");
//                break;
//            case 6:
//            case 7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//
//        }
//        // 可以简写为：
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入星期数");
//        int week = sc.nextInt();
//        switch (week) {
//            case 1,2,3,4,5:
//                System.out.println("工作日");
//                break;
//            case 6,7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//
//        }
//        //另一种形式：省略了break
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入星期数");
//        int week = sc.nextInt();
//        switch (week) {
//            case 1 -> {
//                System.out.println("工作日");
//            }
//            case 2 -> {
//                System.out.println("工作日");
//            }
//            case 3 -> {
//                System.out.println("工作日");
//            }
//            case 4 -> {
//                System.out.println("工作日");
//            }
//            case 5 -> {
//                System.out.println("工作日");
//            }
//            case 6 -> {
//                System.out.println("休息日");
//            }
//            case 7 -> {
//                System.out.println("休息日");
//            }
//            default -> {
//                System.out.println("输入错误");
//            }
//
//        }

        //TODO 循环结构
//        /*在实际开发中，需要重复执行的代码，会选择循环实现，
//        比如:如左图所示。玩游戏的时候，如果网不好那么会经常断线重连那么断线重连这个业务逻辑就需要重复执行。假设现在公司要求
//        断线重连的业务逻辑最多只写5次请用代码实现。
//        备注:断线重连的业务逻辑可以用输出语句替代*/
//        for(int i=1;i<=5;i++){
//            System.out.printf("断线重连[%d/5]\n",i);
//        }

//        /*案例5:求和
//        需求:在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环，比如:求1-5之间的和*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要求到的结尾数");
//        int n = sc.nextInt();
//        int sum = 0;
//        if (n > 0) {
//            for (int i = 1; i <= n; i++) {
//                sum += i;
//            }
//            System.out.println(sum);
//        }else{
//            System.out.println("输入的值必须大于0");
//        }

//        /*求1-100之间的偶数和*/
//        int sum=0;
//        for(int i=2;i<=100;i+=2){
//            sum+=i;
//        }
//        System.out.println(sum);

//        /*案例7:统计满足条件的数字
//        需求:
//        表示一个范围。键盘录入两个数字
//        统计这个范围中。
//        既能被3整除，又能被5整除数字有多少个?*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数:");
//        int number1 = sc.nextInt();
//        System.out.println("请输入第二个数:");
//        int number2 = sc.nextInt();
//        int sum = 0;
//
//        if(number1>number2){
//            System.out.printf("在%d-%d中既能被3整除，又能被5整除数字有%n", number2, number1);
//            for(int i=number2;i<=number1;i++){
//                if(i%3==0&&i%5==0){
//                    System.out.printf("%d\t",i);
//                    sum++;
//                }
//            }
//            System.out.println();
//            System.out.printf("在%d-%d中既能被3整除，又能被5整除数字有%d个%n", number2, number1,sum);
//        }else{
//            System.out.printf("在%d-%d中既能被3整除，又能被5整除数字有%n", number1, number2);
//            for(int i=number1;i<=number2;i++){
//                if(i%3==0&&i%5==0){
//                    System.out.printf("%d\t",i);
//                    sum++;
//                }
//            }
//            System.out.println();
//            System.out.printf("在%d-%d中既能被3整除，又能被5整除数字有%d个%n", number1, number2,sum);
//        }

//        /*案例1:打印折纸的次数，世界最高山峰是珠穆朗玛峰(8844.43米=
//        8844430毫米)假如我需求:有一张足够大的纸，它的厚康是0.1毫米请问，我折叠多少次，可以折成珠穆朗玛峰的高度?*/
//        double paper=0.1;
//        int count=0;
//        while(paper<=8844430.0){
//            paper*=2;
//            count++;
//        }
//        System.out.println(count);


        //TODO：算法题
//        /*案例2:回文数
//        需求:给你一个整数x。
//        如果x是一个回文整数，打印 true，否则，返回 false 。
//        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数。例如，121是回文，而 123 不是*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int n = sc.nextInt();
//        // 定义一个变量来代替n 进行形成回文数，方便后面的比较还能找到原来的数
//        int n1=n;
//        int dao=0;
//        while(n1!=0){
//            // 从右往左依次获取位数
//            int wei = n1 % 10;
//            //获取到后就不需要了
//            n1=n1/10;//更新
//            //倒置
//            dao=dao*10+wei;
//        }
//        System.out.println(dao);
//        if(dao==n){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        /*需求:给定两个整数，被除数和除数(都是正数，且不超过int的范围)将两数相除，要求不使用乘法、除法和 %运算符。得到商和余数。 */
//        /*核心思想：一直相减*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入被除数：");
//        int n = sc.nextInt();
//        System.out.println("请输入除数：");
//        int m = sc.nextInt();
//        int count = 0;
//        while(n>=m){
//            n=n-m;
//            count++;
//        }
//        System.out.println("商为："+count);
//        System.out.println("余数为"+n);


//        // do...while...先执行后判断
//        // 案例3：打印1-100之间的偶数
//        int i=1;
//        do{
//            if(i%2==0){
//                System.out.println(i);
//            }
//            i++;
//        }while(i<=100);

//        // continue:跳过当前循环，继续执行下一个循环
//        for(int i=1;i<=5;i++){
//            if(i==3){
//                continue;
//            }
//            System.out.println("吃第"+i+"个包子");
//        }

//        //break:跳出循环
//        for(int i=1;i<=5;i++){
//            System.out.println("吃第"+i+"个包子");
//            if(i==3) {
//                break;
//            }
//        }

//        /*案例1:逢7过
//        逢7过朋友聚会的时候可能会玩一个游戏游戏规则:从任意一个数字开始报数，当你要报的数字包含7是7的倍或者数时都要说过:过
//        需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据*/
//        for(int i=1;i<=100;i++){
//            if(i%7==0 ||i%10==7 || i/10%10==7){
//                System.out.println("过");
//            }else{
//                System.out.println(i);
//            }
//        }

        /*案例2求平方根
        需求:键盘录入一个大于等于2的整数x，计算并返回x的平方根。结果只保留整数部分，小数部分将被舍去*/
        //TODO:核心思想：从1一直乘，直到乘到的结果大于x，那么它的前一个数就是x的平方根的整数部分（或者它本身）
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个大于等于2的整数：");
//        int x = sc.nextInt();
//        int sqrt=0;
//        while((sqrt*sqrt)<=x){
//            sqrt++;
//        }
//        if((sqrt-1)*(sqrt-1)==x) {
//            System.out.println("平方根为：+-" + (sqrt - 1));
//        }else{
//            System.out.println("该数平方根的整数部分为："+(sqrt-1));
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个大于2的数:");
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if(i*i==n){
//                System.out.println("该数的平方根为：+-"+i);
//                break;
//            }else if(i*i>n){
//                System.out.println("该数的平方根的整数部分为："+(i-1));
//                break;
//            }
//        }

        /*求质数案例3:
        需求:键盘录入一个正整数判断该整数是否为一个质数。*/
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个数我来判断是否为质数:");
//        int n=sc.nextInt();
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                System.out.println("该数不是质数");
//                break;
//            }
//            if(i==(n-1)){
//                System.out.println("该数为质数");
//            }
//        }


//        //TODO:标记：flag
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个数我来判断是否为质数:");
//        int n=sc.nextInt();
//        boolean flag=true;
//        for(int i=2;i<n;i++){
//            if(n%i==0){
//                flag=false;
////                System.out.println("该数不是质数");
//                break;
//            }
//        }
//        if(flag){
//                System.out.println("该数为质数");
//        }else{
//                System.out.println("该数不是质数");
//        }

//        //TODO:提高效率：在判断一个数是否为质数时，只需要判断到它的平方根即可
//        // 因为一个数的因子是成对出现的，所以只需要判断到它的平方根即可 eg:12的因子有(1,12),(2,6),(3,4)，所以只需要判断到3即可,
//        // 12%3==0与12%4==0效果相同；12%2==0与12%6==0效果相同
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个数我来判断是否为质数:");
//        int n=sc.nextInt();
//        boolean flag=true;
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                flag=false;
////                System.out.println("该数不是质数");
//                break;
//            }
//        }
//        if(flag){
//                System.out.println("该数为质数");
//        }else{
//                System.out.println("该数不是质数");
//        }


//        /*练习
//        案例4:猜数字小游戏
//        需求:程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少?*/
        //TODO：下面的两个 if()语句放的位置不同，实现的功能不同

//        /*三次猜不对就退出游戏*/
//        //TODO: 创建对象
//        Random r=new Random();
//        //TODO:（100+1）是为了包含100这个数，范围是[0,100]，如果（）是x 的话，范围就是[0,x-1]
//
//        // TODO: 生成任意范围内的随机数方法: x~y 公式：r.nextInt(y-x+1)+x; eg:生成7~15的随机数，（7-7）~（15-7）=0~8，那r.nextInt(8+1)+7=7~15
//        int number=r.nextInt(10)+1;//0~9；（0+1）~（9+1）=1~10
//        Scanner sc = new Scanner(System.in);
//        int count=0;
//        while(true){
//            System.out.println("请输入你猜的数字（1-10）：");
//            int guess = sc.nextInt();
//            count++;
//            if(guess>number){
//                System.out.println("你猜的数字大了");
//            }else if(guess<number){
//                System.out.println("你猜的数字小了");
//            }else if(guess==number){
//                System.out.println("恭喜你猜对了");
//                System.out.println("你用了"+count+"次猜中");
//                break;
//            }

            //TODO: 控制游戏退出的次数

//            if(count==3){
//                System.out.println("很遗憾，你猜错了3次，游戏退出");
//                break;
//            }
//        }

//        //TODO: 创建对象
//        Random r=new Random();
//        //TODO:（100+1）是为了包含100这个数，范围是[0,100]，如果（）是x 的话，范围就是[0,x-1]
//
//        // TODO: 生成任意范围内的随机数方法: x~y 公式：r.nextInt(y-x+1)+x; eg:生成7~15的随机数，（7-7）~（15-7）=0~8，那r.nextInt(8+1)+7=7~15
//        int number=r.nextInt(10)+1;//0~9；（0+1）~（9+1）=1~10
//        Scanner sc = new Scanner(System.in);
//        int count=0;
//        while(true){
//            System.out.println("请输入你猜的数字（1-10）：");
//            int guess = sc.nextInt();
//            count++;
//            /*TODO：多少次保底，游戏里面的保底机制，eg:361抽水晶保底*/
//            if(count==3){
//                System.out.println("恭喜你猜对了，（并不是真正的猜对了，只是触发了保底数）");
//                break;
//            }
//            if(guess>number){
//                System.out.println("你猜的数字大了");
//            }else if(guess<number){
//                System.out.println("你猜的数字小了");
//            }else if(guess==number){
//                System.out.println("恭喜你猜对了");
//                System.out.println("你用了"+count+"次猜中");
//                break;
//            }
//
//        }














    }
}
