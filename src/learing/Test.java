package learing;

public class Test {
    public static void main(String[] args) {
//        double bankBalance = 500.00;
//        bankBalance+=250;
//        bankBalance-=100;
//        String result = "当前余额为：" + bankBalance;
//        System.out.println(result);

//        String name="zmh";
//        String sex="女";
//        int age=21;
//        String address="广西壮族自治区";
//        double balance=55.55;
//        System.out.println("姓名："+name);
//        System.out.println("性别："+sex);
//        System.out.println("年龄："+age);
//        System.out.println("地址："+address);
//        System.out.println("余额："+balance);

//        //TODO: 数值拆分
//        // 公式：个位数：num%10
//        // 十位数：(num/10)%10
//        // 百位数：(num/100)%10
//        // 千位数：(num/1000)%10 ...
//        System.out.println("请输入一个整数：");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int ge=num%10;
//        int shi=(num/10)%10;
//        int bai = (num/100)%10;
//        System.out.println("个位数为："+ge);
//        System.out.println("十位数为："+shi);
//        System.out.println("百位数为："+bai);


//        /*您和您的约会对象在餐厅里面正在约会，
//        键盘录入两个整数，表示你和你约会对象衣服的时髦度。(手动录入0~10之间的整数，不能录其他)
//        如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。否则输出false。*/
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入您的时髦程度（0~10）：");
//        int mylStyle = sc.nextInt();
//        System.out.println("请输入您约会对象的时髦程度（0~10）：");
//        int honneyStyle = sc.nextInt();
//        boolean result = mylStyle > honneyStyle;
//        if(result) {
//            System.out.println(result + "相亲成功");
//        }else{
//            System.out.println(result + "相亲失败");
//        }

//        /*数字6是一个真正伟大的数字，键盘录入两个整数。如果其中一个为6，最终结果输出true如果它们的和为 6的倍数。最终结果输出true.其他情况都是false。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数：");
//        int num1=sc.nextInt();
//        System.out.println("请输入第二个整数：");
//        int num2=sc.nextInt();
//        int sum=num1+num2;
//        if(num1==6 ||num2==6 ||sum%6==0){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        /*练习:两只老虎
//        需求:动物园里有两只老虎，体重分别为通过键盘录入获得请用程序实现判断两只老虎的体重是否相同*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一只老虎的体重：");
//        double tiger1 = sc.nextDouble();
//        System.out.println("请输入第二只老虎的体重：");
//        double tiger2 = sc.nextDouble();
//        //boolean isSame = (tiger1==tiger2?true:false);
//        String isSame = (tiger1==tiger2?"相同":"不同");
//        System.out.println("两只老虎的体重是否相同："+isSame);

//        /*需求:一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm请用程序实现获取这三个和尚的最高身高。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个和尚的身高(cm)：");
//        double hight1= sc.nextDouble();
//        System.out.println("请输入第二个和尚的身高(cm)：");
//        double hight2 = sc.nextDouble();
//        System.out.println("请输入第三个和尚的身高(cm)：");
//        double hight3 = sc.nextDouble();
//        double maxHigth = (hight1>hight2?hight1:hight2);
//        maxHigth =(hight3>maxHigth?hight3:maxHigth);
//        System.out.println("这三个和尚的最高身高为："+maxHigth+"cm");

//        /*## 题目1(训练)
//        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//        儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//        女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入父亲的身高（cm）：");
//        double fatherHight = sc.nextDouble();
//        System.out.println("请输入母亲的身高（cm）：");
//        double motherHight = sc.nextDouble();
//        double sonHigjt=(fatherHight+motherHight)*1.08/2;
//        double daughterHight=(fatherHight*0.923+motherHight)/2;
//        System.out.printf("儿子的预计身高为：%.2fcm%n",sonHigjt);
//        System.out.printf("女儿的预计身高为：%.2fcm%n",daughterHight);

//        /*## 题目2（训练）
//        红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，
//        她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？*/
//        float redTea = 21F;
//        float greenTea = 24F;
//        float redTeaNow = redTea*2+3;
//        float greenTeaNow = greenTea*2+3;
//        System.out.println("红茶和绿茶现在的钱是否一样多："+(redTeaNow==greenTeaNow?"是":"否"));

//        /*某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
//        订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？*/
//        float fish = 24F;
//        float peanuts = 8F;
//        float rice = 3F;
//        float fishDiscount = 16F;
//        float minPrice = (((fish+peanuts+rice)*0.8F)<(fishDiscount+peanuts+rice)?((fish+peanuts+rice)*0.8F):(fishDiscount+peanuts+rice));
//        System.out.println("这个小伙要点这三样东西，最少要花多少钱："+minPrice);

//        /*需求:
//        键盘录入一个三位数，求这个三位数每一位的数字和。举例:
//        键盘录入123。那么每一位数字相加为:1+2+3，和为:6。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个三位整数");
//        int number = sc.nextInt();
//        int ge = number%10;
//        int shi= number/10%10;
//        int bai = number/100%10;
//        int sum = ge+shi+bai;
//        System.out.println("这个三位数每一位的数字和为："+sum);


//        /*李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，
//        而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。*/
//        double oldPhonePrice = 1500.00;
//        double newPhonePrice = 7988.00;
//        double cheapPrice = newPhonePrice-newPhonePrice*0.8;
//        System.out.println("李雷要不要以旧换新？"+(oldPhonePrice<cheapPrice?"是":"否"));


//        /*让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数：");
//        int num1 = sc.nextInt();
//        System.out.println("请输入第二个整数：");
//        int num2 = sc.nextInt();
//        System.out.println("请输入第三个整数：");
//        int num3 = sc.nextInt();
//        int min = (num1<num2?num1:num2);
//        min = (num3<min?num3:min);
//        System.out.println("这三个整数中的最小值为："+min);

//        /*某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
//        存期		年利率（%）
//        一年		2.25
//        两年		2.7
//        三年		3.25
//        五年		3.6
//        请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
//        提示：
//        存入金额和存入年限均由键盘录入
//        本息计算方式：本金+本金×年利率×年限*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入存入的金额（1000起存）：");
//        double money = sc.nextDouble();
//        System.out.println("请输入存入的年限（一年、两年、三年、五年）：");
//        String time = sc.next();
//        double interest = 0.0;
//        if(time.equals("一年")){
//            interest = (2.25/100)*1;
//        }else if(time.equals("两年")){
//            interest = (2.7/100)*2;
//        }else if(time.equals("三年")){
//            interest = (3.25/100)*3;
//        }else if(time.equals("五年")){
//            interest = (3.6/100)*5;
//        }else{
//            System.out.println("输入的年限有误");
//        }
//        double totalMoney = money+money*interest;
//        System.out.println("到期后得到的本息总额为："+totalMoney);
//        //另一种：
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你要存入的金额：（>=1000）");
//        double input = sc.nextDouble();
//        double interest = 0;
//        if (input >= 1000){
//            System.out.println("请输入你要存储的年限：(1-5)");
//            int year=sc.nextInt();
//            switch (year){
//                case 1->{interest = (2.25/100)*1;}
//                case 2->{interest = (2.7/100)*2;}
//                case 3->{interest = (3.25/100)*3;}
//                case 4->{interest = (3.6/100)*4;}
//                case 5->{interest = (3.6/100)*5;}
//                default -> {System.out.println("输入的年限有误");}
//            }
//        }else{
//            System.out.println("输入的金额要大于等于1000");
//        }
//        double totalMoney = input+input*interest;
//        System.out.println("到期后得到的本息总额为："+totalMoney);

//        /*某商场购物可以打折，具体规则如下:
//        普通顾客购不满100元不打折，满100元打9折会员购物不满200元打8折，满200元打7.5折;
//        不同打折规则不累加计算。
//        请根据此优惠计划进行购物结算，键盘录入顾客的类别(0表示普通顾客，1表示会员)和购物的折前金额(整数即可)，输出应付金额(小数类型)。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入顾客类别（0表示普通顾客，1表示会员）：");
//        int type = sc.nextInt();
//        System.out.println("请输入购物的折前金额：");
//        int price = sc.nextInt();
//        switch (type) {
//            case 0:
//                if (price < 100) {
//                    System.out.println("普通顾客不打折，应付金额为：" + price);
//                } else {
//                    System.out.println("普通顾客满100元打9折，应付金额为：" + price * 0.9);
//                }
//                break;
//            case 1:
//                if (price< 200){
//                    System.out.println("会员顾客打8折，应付金额为：" +price*0.8 );
//                }else{
//                    System.out.println("会员顾客满200元打7.5折，应付金额为：" + price * 0.75);
//                }
//                break;
//        }

//        /*2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金(三险一金数额假设是税前工资的10%)后如果不足5000元，
//        则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下:
//        0~3000元的部分，交税3%
//        3000~12000元的部分，交税10%
//        12000-25000的部分，交税20%
//        25000~35000的部分，交税25%
//        35000~55000的部分，交税30%
//        55000~80000的部分，交税35%
//        超过80000的部分，交税45%
//        比如:黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000x3%+5500x10%=640元。税后工资12860元
//        请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少?*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入税前的工资：");
//        double salary = sc.nextDouble();
//        double give = salary*0.1;
//        double tax = 0;
//        if((salary-give)<5000){
//            tax=0;
//        }else{
//            double calculate = salary-give-5000;
//            if(calculate<=3000){
//                tax=calculate*0.03;
//            }else if(calculate<=12000){
//                tax=(calculate-3000)*0.1+3000*0.03;
//            }else if(calculate<=25000){
//                tax=(calculate-12000)*0.2+12000*0.1+3000*0.03;
//            }else if(calculate<=35000){
//                tax=(calculate-25000)*0.25+25000*0.2+12000*0.1+3000*0.03;
//            }else if(calculate<=55000){
//                tax=(calculate-35000)*0.3+35000*0.25+25000*0.2+12000*0.1+3000*0.03;
//            }else if(calculate<=80000){
//                tax=(calculate-55000)*0.35+55000*0.3+35000*0.25+25000*0.2+12000*0.1+3000*0.03;
//            }else if(calculate>80000){
//                tax=(calculate-80000)*0.45+80000*0.35+55000*0.3+35000*0.25+25000*0.2+12000*0.1+3000*0.03;
//            }
//        }
//        double afterTax = salary-tax-give;
//        System.out.println("你需要交的个税为："+tax+"元");
//        System.out.println("你税后的工资为："+afterTax+"元");

//        /*模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
//        要求:
//        键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算(1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
//        请输入第一个整数: 30
//        请输入第二个整数: 40
//        请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):1控制台输出:30+40=70*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数：");
//        int number1 = sc.nextInt();
//        System.out.println("请输入第二个数:");
//        int number2 = sc.nextInt();
//        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)");
//        switch (sc.nextInt()) {
//            case 1:
//                System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
//                break;
//            case 2:
//                System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
//                break;
//            case 3:
//                System.out.println(number1 + "*" +number2 + "=" + (number1 * number2));
//                break;
//            case 4:
//                System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
//                break;
//            default:
//                System.out.println("您输入的运算符号有误");
//                break;
//        }

//        /*键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数字：");
//        int number1=sc.nextInt();
//        System.out.println("请输入第二个数字：");
//        int number2=sc.nextInt();
//        int sum=0;
//        if(number1>number2) {
//            for (int i=number2;i<=number1;i++){
//                sum+=i;
//            }
//        }else{
//            for (int i=number1;i<=number2;i++){
//                sum+=i;
//            }
//        }
//        System.out.printf("%d-%d这个范围之内的数字和为：%d",number1,number2,sum);


//        /*已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。*/
//        for (int i = 2019; i >= 1949; i -= 12) {
//            System.out.println(i + "是猪年");
//        }
//        for(int i=1949;i<=2019;i++){
//            if(i%12==3){
//                System.out.println(i+"是猪年");
//            }
//        }

//        /*中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。
//        （年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。请打印出1988年到2019年的所有闰年年份。*/
//        for(int year=1988;year<=2019;year++){
//            if(year%400==0 ||(year%4==0 &&year%100!=0)){
//                System.out.println(year+"是闰年");
//            }
//        }

//        /*请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。*/
//        int[] arr={1,2,3,4,5,6};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        /*现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。*/
//        double[] arr={12.9, 53.54, 75.0, 99.1, 3.14};
//        double min=arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

//        /*创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。*/
//        int arr[]=new int[6];
//        Random r=new Random();
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            arr[i]=r.nextInt(100)+1;
//        }
//        System.out.println("数组中所有元素的为：");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//            sum+=arr[i];
//        }
//        System.out.println("\n数组中所有元素的和为："+sum);


//        /*现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，
//        依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值。例如：数组：{2, 1, 3, 5, 4}
//        表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。*/
//        int[] arr={2, 1, 3, 5, 4};
//        int number=0;
//        for(int i=0;i<arr.length;i++){
//            number=number*10+arr[i];
//        }
//        System.out.println(number);

//        /*定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。*/
//        double[] score=new double[10];
//        double sum=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入10个学生的成绩：");
//        for (int i = 0; i < score.length; i++) {
//            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
//            score[i]=sc.nextDouble();
//            sum+=score[i];
//        }
//        System.out.println("学生的平均成绩为："+sum/score.length);

//        /*有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
//        再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
//        请输入一个整数数字：50
//        生成的新数组是：12 14 23 45 50 66 68 70 77 90 91*/
//        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
//        int[] newArr = new int[arr.length + 1];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数数字：");
//        int number = sc.nextInt();
//        int xiabiao = 0;
//        //查找number应该插入的位置
//        for (int i = 0; i < arr.length; i++) {
//            if (number > arr[i] &&number<arr[i+1]) {
//                xiabiao = i + 1;
//                break;
//            }
//        }
//        //将arr数组中从xiabiao开始的元素都后移一位
//        for (int i = newArr.length-1; i >= xiabiao; i--){
//            if (i == xiabiao) {
//                newArr[i] = number;
//            } else {
//                newArr[i] = arr[i-1];
//            }
//        }
//        //将arr数组中从0到xiabiao-1的元素都赋值给newArr数组中从0到xiabiao-1的位置
//        for (int i = 0; i < xiabiao; i++) {
//            newArr[i]=arr[i];
//        }
//        System.out.println("生成的新数组是：");
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i]+" ");
//        }

//        /*定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）*/
//        int[] arr1=new int[10];
//        int[] arr2=new int[arr1.length];
//        int right=arr2.length-1;
//        int left=0;
//        // 输入10个数字，默认是升序输入
//        Scanner sc=new Scanner(System.in);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("请输入第"+(i+1)+"个数字：");
//            arr1[i]=sc.nextInt();
//        }
//        // 展现原来的数组
//        System.out.println("原来的数组为：");
//        for(int i=0;i<arr1.length;i++){
//            System.out.print(arr1[i]+" ");
//            if(arr1[i]%2==0){
//                arr2[right]=arr1[i];
//                right--;
//            }else {
//                arr2[left]=arr1[i];
//                left++;
//            }
//        }
//        // 展现新的数组
//        System.out.println("\n新的数组为：");
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]+" ");
//        }








    }

}
