package learing.stringLearn;

import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringIntroduction {
    public static void main(String args[]) {
        /*TODO: 字符串的介绍*/
        //字符串拼接
        //TODO:字符串拼接是产生新的字符串对象
//        String str1 = "hello";
//        String str2 = "world";
//        System.out.println(str1+str2);//新的字符串对象:helloworld
//        System.out.println(str1+str2+"!");//新的字符串对象:helloworld!
//        System.out.println(str1+str2+456);//新的字符串对象:helloworld456
//        String str3 = "gogogo";
//        str3="dontgo";//创建新的字符串对象:dontgo再赋值给str3，而那个gogogo就成为了垃圾对象(等待垃圾回收)


        //TODO:字符串的作用:比较、替换、截取、查找、切割、检索、加密、打乱内容、大小写转换...
        //TODO:String,StringBuilder,StringBuffer,StringJoiner,Matcher,Pattern...

//        //字符串的构造方法
//        //方法1：直接赋值
//        String str1 = "hello";
//        System.out.println(str1);//hello
//
//        //方法2：使用new关键字
//        //2.1 new一个空字符串对象
//        String str2 = new String();
//        System.out.println(str2);//空字符串""
//        System.out.println("@"+str2+"@");
//
//        //2.2 new一个有内容的字符串对象(多此一举)
//        String str3 = new String("world");
//        System.out.println(str3);//world

        //TODO：2.3 使用字符数组创建字符串对象
//        //应用场景：当要对字符串进行操作时，即把字符串第一个字母改成'Q'
//        //则可以将要变换的字符串先改成字符数组{a,b,c,d,e}-->{Q,b,c,d,e}-->"Qbcde"
//        char[] charArray = {'a','b','c','d','e'};
//        String str4 = new String(charArray);
//        System.out.println(str4);//abcde

        //TODO：2.4 使用byte数组创建字符串对象
//        //应用场景：在互联网中传输数据时，数据都是以字节的形式传输的，
//        //而在接收数据时，需要将字节转换为字符串，就可以使用byte数组创建字符串对象
//        byte[] byteArray = {97,98,99,100};//对应ACSIA=a,b,c,d
//        String str5 = new String(byteArray);
//        System.out.println(str5);//abcd
//
//        //字符串的比较
//        //TODO:拓：==比较的是字符串对象的地址是否相同；比较普通类型时，比较的是值是否相同
//        String str1 = "hello";
//        String str2 = "world";
//        String str3 = "hello";
//        String str4 = "Hello";
//        System.out.println(str1 == str2);//false
//        System.out.println(str1 == str3);//true,因为str1和str3指向的是同一个字符串对象"hello",都在串池里用一个地址
//        //TODO:str1.equals(str2),比较字符串的内容是否相同
//        System.out.println(str1.equals(str2));//false,equals()比较的是字符串的内容是否相同
//        System.out.println(str1.equals(str3));//true,equals()比较的是字符串的内容是否相同
//        //TODO:str1.equalsIgnoreCase(str4),比较字符串的内容是否相同，忽略大小写,且只能忽略字母的大小写,不能忽略其他字符的大小写
//        System.out.println(str1.equalsIgnoreCase(str4));//true,equalsIgnoreCase()比较的是字符串的内容是否相同，忽略大小写,且只能忽略字母的大小写,不能忽略其他字符的大小写

//        //CTRL+B,查看方法的源码，根据其返回值查看源码-->继续跟进ctrl+B
//        /*用户登录
//        需求:已知正确的用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示*/
//        Scanner sc = new Scanner(System.in);
//        int count = 0;//记录登录次数;
//        boolean isLogin = false;//记录是否登录成功
//        while (count < 3) {
//            System.out.println("请输入用户名:");
//            String username = sc.nextLine();
//            System.out.println("请输入密码:");
//            String password = sc.nextLine();
//            //TODO:用户登录的判断
//            if (username.equals("admin") && password.equals("123456")) {
//                System.out.println("登录成功");
//                isLogin = true;//登录成功后，将isLogin设置为true
//                break;//登录成功后，跳出循环
//            } else if (username.equals("admin") && !password.equals("123456")) {
//                System.out.printf("密码错误,您还有%d次机会%n", 2 - count);
//                count++;//登录失败后，次数加1
//            } else if (!username.equals("admin") && password.equals("123456")) {
//                System.out.printf("用户名错误,您还有%d次机会%n", 2 - count);
//                count++;//登录失败后，次数加1
//            } else {
//                System.out.printf("用户名和密码错误,您还有%d次机会%n", 2 - count);
//                count++;//登录失败后，次数加1
//            }
//        }
//        if (count == 3 && !isLogin) {
//            System.out.println("登录失败，3次均失败,是否找回密码?");
//        }


//        //字符串的遍历:用到charAt()方法 & length()方法
//        String str = "I love you";
//        //str.length().fori:快速生成for循环
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//        /*TODO:public char charAt(int index):根据索引返回字符
//               public int length():返回此字符串的长度
//               数组的长度:数组名.length
//              字符串的长度:字符串对象.length()*/


//        /*统计字符次数
//        键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)*/
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        int upperCase = 0;
//        int lowerCase = 0;
//        int digit = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
//                upperCase++;
//            }else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
//                lowerCase++;
//            }else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
//                digit++;
//            }
//        }
//        System.out.printf("UpperCase: %d%n",upperCase);
//        System.out.printf("LowerCase: %d%n",lowerCase);
//        System.out.printf("Digit: %d%n",digit);

//        /*拼接字符串
//        定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。例如:
//        数组为int[]arr={1,2,3};
//        执行方法后的输出结果为:[1,2,3]*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入10个整数:");
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("请输入第%d个整数:",i+1);
//            arr[i] = sc.nextInt();
//        }
//        String str = arrayToString(arr);
//        System.out.println(str);

//        /*字符串反转
//        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果例如，键盘录入abc，输出结果cba*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串:");
//        String str = sc.nextLine();
//        reverseString(str);

//        //练习：金额转换
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个金额:");
//        int n = sc.nextInt();
//        //1.判断金额是否合法
//        while(true){
//            if(n>=0 && n<=9999999){
//                break;
//            }else{
//                System.out.println("金额不合法,请重新输入:");
//                n=sc.nextInt();
//            }
//        }
////        System.out.println("您输入的金额为:"+n);
//
//        //2.转换数字
//        String str ="";
//        while(true){//2345
//            int ge = n%10;
//            String c = numberToString(ge);
//            //"伍"+""->"伍"
//            //"肆"+"伍"->"肆伍"
//            str=c+str;
//            n=n/10;
//            if(n==0){
//                break;
//            }
//        }
////        System.out.println("您输入的金额为:"+str);
//
//        //3.在前面补零，补齐7位
//        int count = 7 - str.length();
//        for (int i = 0; i < count; i++) {
//            str = "零" + str;
//        }
////        System.out.println("您输入的金额为:"+str);
//
//        //插入单位
//        String result="";
//        String[] unit = {"佰","拾","万","仟","佰","拾","元"};
//        for(int i=0;i<str.length();i++){
//            result=result+str.charAt(i)+unit[i];
//        }
//        System.out.println("您输入的金额为:"+result);

//        //练习：手机号屏蔽
//        //TODO:subString()方法:截取字符串(包头不包尾)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个手机号:");
//        String phoneNumber = sc.nextLine();
//        //1.截取手机号前三位
//        String start = phoneNumber.substring(0,3);//0 1 2
//        //2.截取手机号后四位
//        String end = phoneNumber.substring(7);//7 - 结尾
//        //3.拼接手机号
//        String result = start+"****"+end;
//        System.out.println(result);

//        //身份证号码信息查看
//        String idNumber = "44030419900101002X";
//        String year = idNumber.substring(6,10);
//        String month = idNumber.substring(10,12);
//        String day = idNumber.substring(12,14);
//        System.out.println("出生年月日："+year+"年"+month+"月"+day+"日");
//        //性别
//        //'0'--48
//        //'9'--57
//        char sex = idNumber.charAt(16);
//        int gender = sex - 48;
//        if(gender % 2 == 0){
//            System.out.println("性别：女");
//        }else{
//            System.out.println("性别：男");
//        }

//        //练习：游戏骂人敏感词替换
//        //TODO:string.replace()方法:替换字符串
//        Scanner sc = new Scanner(System.in);
//        //获取用户输入的字符串
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        //建立一个敏感词库
//        String[] words = {"TMD","CNM","SB","RNM","MLGB"};
//        //替换敏感词
//        for(int i=0;i<words.length;i++){
//            s = s.replace(words[i],"****");
//        }
//        System.out.println(s);


//        //TODO：StringBuilder类(本质上是个容器，里面的内容是可以改变的)
        //TODO:使用StringBuilder类的场景：1.字符串拼接（append()方法） 2.字符串反转（reverse()方法）
//        //StringBuilder类的创建
//        //1.
//        StringBuilder sb1 = new StringBuilder();
//        System.out.println(sb1);
//        StringBuilder sb2 = new StringBuilder("abc");
//        System.out.println(sb2);
//
//        //StringBuilder类的方法
//        //1.sb.append()方法:追加字符串
//        sb2.append("def");
//        System.out.println(sb2);
//
//        //2.sb.reverse()方法:反转字符串(把反转后的字符串再放回sb2容器中)
//        sb2.reverse();
//        System.out.println(sb2);
//
//
//        //3.sb.length()方法
//        int len = sb2.length();
//        System.out.println(len);
//
//        //4.sb.toString()方法:把StringBuilder类（工具类）转换为String类
//        //这样可以使得变量可以使用StringBuilder类的方法,转换后又可以使用String类的方法
//        String str = sb2.toString();
//        System.out.println(str);
//        int len2 = str.length();
//        System.out.println(len2);


//        //TODO:链式编程(方法调用可以连写，每个方法调用完后返回的都是一个对象，所以可以继续调用方法)
//        //TODO:链式编程(可以在一行代码中调用多个方法)
//        StringBuilder sb = new StringBuilder();
//        sb.append("abc").append("def").append("123");//abcdef123
//        System.out.println(sb);
//        int len3 = sb.append("abc").append("def").append("123").toString().length();//前面的abcdef123长度为9，后面的abcdef123长度为9，所以总长度为18
//        System.out.println(len3);


//        /*对称字符串
//        需求:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
//        对称字符串:123321、111
//        非对称字符串:123123*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一串字符串：");
//        String s = sc.nextLine();
//        //判断字符串是否对称
//        StringBuilder s1 = new StringBuilder(s);
//        if(s.equals(s1.reverse().toString())){
//            System.out.println("该字符串是对称字符串");
//        }else{
//            System.out.println("该字符串不是对称字符串");
//        }

//        /*拼接字符串
//        需求:定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。a调用该方法，并在控制台输出结果。
//        例如:数组为int[]arr={1,2,3;执行方法后的输出结果为:[1,2,3]*/
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        String str = numberToString2(arr);
//        System.out.println(str);

//        //TODO:StringJoiner类:拼接字符串
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        //1.创建StringJoiner对象
//        //1.1（中间间隔符号）
//        //StringJoiner sj = new StringJoiner("---");
//        //1.2(中间间隔符号，前缀，后缀)
//        StringJoiner sj = new StringJoiner(",","[","]");
//        //2.添加元素
//        for(int i=0;i<arr.length;i++){
//            sj.add(arr[i]+"");//.add不能添加整型，要先转换为字符串（+""）
//        }
//        //3.长度--包含前缀、后缀和中间间隔符号
//        int len = sj.length();
//        System.out.println(len);
//        //4.转换为字符串
//        String str2 = sj.toString();
//        System.out.println(str2);


//        /*转换罗马数字
//        键盘录入一个字符串，
//        要求1:长度为小于等于9
//        要求2:只能是数字
//        将内容变成罗马数字
//        下面是阿拉伯数字跟罗马数字的对比关系:
//        I -1、II -2、III -3,IV-4、V-5、VI-6、VII -7、VIII-8,IX-9
//        注意点:
//        罗马数字里面是没有0的
//        如果键盘录入的数字包含0，可以变成””(长度为0的字符串)*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串(长度小于等于9，只能是数字)：");
//        String str = sc.nextLine();
//        boolean isRight = true;
//        StringJoiner sj = new StringJoiner("、");
//        //1.判断字符串是否符合要求
//        while (isRight) {
//            if ((str.length() < 9 && str.length() > 0)||str.length()==9) {
//                //2.判断字符串是否只包含数字
//                //TODO:正则表达式判断字符串是否只包含数字，只包含就为true
//                if (str.matches("[0-9]+")) {
//                    //3.将字符串转换为罗马数字
//                    for (int i = 0; i < str.length(); i++) {
//                        //case1:
//                        int n = str.charAt(i) - '0';//TODO:将字符转换为数字
//                        sj.add(numberToString3(n));
////                        //case2:
////                        sj.add(numberToString4(str.charAt(i)));
//                    }
//                    //4.打印罗马数字
//                    String str2 = sj.toString();//TODO:将StringJoiner对象转换为字符串
//                    System.out.println(str2);
//                    System.out.println("转换成功,是否继续转换？(y/n)");
//                    String choice = sc.nextLine();
//                    if (choice.equalsIgnoreCase("y")) {
//                        System.out.println("请输入一个字符串(长度小于等于9，只能是数字)：");
//                        str = sc.nextLine();
//                    } else {
//                        isRight = false;
//                    }
//                } else {
//                    System.out.println("您输入的字符串内容不符合要求，请重新输入");
//                    str = sc.nextLine();
//                }
//            }else{
//                System.out.println("您输入的字符串长度不符合要求，请重新输入");
//                str = sc.nextLine();
//            }
//        }


//        /*TODO:调整字符串-->sl1:利用substring方法进行分割拼接、sl2:将字符串转换为字符数组进行交换，再转回字符串
//        给定两个字符串，A和B。A的旋转操作就是将A最左边的字符移动到最右边。
//        例如，若A='abcde'，在移动一次之后结果就是'bcdea'。
//        如果在若干次调整操作之后，A能变成B，那么返回True。如果不能匹配成功，则返回false*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入字符串A：");
//        String stra = sc.nextLine();
//        System.out.println("请输入字符串B：");
//        String strb = sc.nextLine();
//        if (stra.length() == strb.length()) {
//            //sl1:利用substring方法进行分割拼接
//            boolean isRotate = isRotateString(stra, strb);
//            //sl2:将字符串转换为字符数组进行交换，再转回字符串
////            boolean isRotate = isRotateString2(stra, strb);
//            if (isRotate) {
//                System.out.println("字符串A可以旋转成字符串B");
//            } else {
//                System.out.println("字符串A不能旋转成字符串B");
//            }
//        } else {
//            System.out.println("字符串A和字符串B长度不同，不能旋转");
//        }

//        /*键盘输入任意字符串，打乱里面的内容 */
//        //修改字符串里面的内容
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string: ");
//        String s = sc.nextLine();
//        Random rand = new Random();
//        char[] charArray = s.toCharArray();
//        int randomNum = rand.nextInt(charArray.length);
//        for (int i = 0; i < charArray.length; i++) {
//            char temp = charArray[i];
//            charArray[i] = charArray[randomNum];
//            charArray[randomNum] = temp;
//        }
//        s = new String(charArray);
//        System.out.println(s);

//        /*生成验证码
//        内容：可以是小写字母，也可以是大写字母，还可以是数字
//        规则：
//  	    长度为5
//  	    内容中是四位字母，1位数字。
//  	    其中数字只有1位，但是可以出现在任意的位置。*/
//        System.out.println("以下是验证码：");
//        StringBuilder sb = new StringBuilder();
//        Random random = new Random();
//        boolean havenum = false;
//        int numbersindex = random.nextInt(5);
//        //定义验证码的字符集
//        String zm = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        for (int i = 0; i < 5; i++) {
//            int randomNum = random.nextInt(zm.length());
//            if(i == numbersindex && !havenum ){
//                sb.append(random.nextInt(10));
//                havenum = true;
//            } else {
//                sb.append(zm.charAt(randomNum));
//            }
//        }
//        String s = sb.toString();
//        System.out.println(s);

//        /*请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        int encount = 0;
//        int digitcount = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
//                digitcount++;
//            } else if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
//                encount++;
//            }
//        }
//        System.out.println("字母有：" + encount + "个");
//        System.out.println("数字有：" + digitcount + "个");



//        /*请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        boolean isSymmetric = isSymmetric(s);
//        if(isSymmetric){
//            System.out.println("字符串是对称的");
//        }else{
//            System.out.println("字符串不是对称的");
//        }

//        /*我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
//        请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
//        规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your id_card number: ");
//        String cardNumber = sc.nextLine();
//        boolean isLegal = isLegalIdCard(cardNumber);
//        if(isLegal){
//            System.out.println("Your ID card number is correct");
//        }else{
//            System.out.println("Your ID card number is incorrect");
//        }

//        /*定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
//        要求：
//        1、如果传递的参数为空，返回null
//        2、如果传递的数组元素个数为0，返回[]
//        3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        char[] chars = s.toCharArray();
//        s= arrayToString(chars);
//        System.out.println(s);

//        /*题目AAA
//        在String类的API中，有如下两个方法：
//        ```java
//        // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
//        public int indexOf(String str)
//        // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
//        public String substring(int beginIndex)
//        ```
//        请仔细阅读API中这两个方法的解释，完成如下需求。
//        现有如下文本："Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
//        请编写程序，统计该文本中"Java"一词出现的次数。*/
//        String text = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
//        int count = 0;
//        int index = 0;
//        //TODO:str.indexOf("Java", index) 查找从index开始第一次出现"Java"的索引
//        while((index = text.indexOf("Java", index)) != -1) {
////            System.out.println("Java一词出现的索引为：" + index);
//            count++;
//            index += "Java".length();
//        }
//        System.out.println("Java一词出现的次数为：" + count);

//        /*给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，
//        注意:需要用己有的知识完成。
//        它们的乘积也表示为字符串形式。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string1: ");
//        String s1 = sc.nextLine();
//        System.out.println("Enter a string2: ");
//        String s2 = sc.nextLine();
//        int num1 = changeToInt(s1);
//        int num2 = changeToInt(s2);
//        int product = num1 * num2;
//        System.out.println("The product of " + s1 + " and " + s2 + " is " + product);

//        /*给你一个字符串S,右单词组成，符隔开。
//        返回字符串中最后一个单词的长度。
//        单词是指仅由字母组成、不包含任何空格字符的最大子字符串。
//        示例 1:输入:s = "Hello World"输出:5解释:最后一个单词是“world”，长度为5。
//        示例2:输入:s="输出:4fly me tothe moon解释:最后一个单词是“moon"，长度为4。
//        示例 3:输入:s = "luffy is still joyboy"输出:6解释:最后一个单词是长度为6的“joyboy”。*/
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String s = sc.nextLine();
//        int len = countLastWord(s);
//        System.out.println("The length of the last word is: " + len);
































    }

    public static String arrayToString(int[] arr) {
        String str = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ",";
            }
        }
        str += "]";
        return str;
    }

    public static void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    //转换数字
    public static String numberToString(int n) {
        String[] strarr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return strarr[n];
    }

    public static String numberToString2(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sb.append("[").append(arr[i]).append(",");
            } else if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }

        }
        return sb.toString();
    }

    //转换罗马数字
    //case1:查表法
    public static String numberToString3(int n) {
        String[] strarr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return strarr[n];
    }

    //case2:switch语句进行匹配
    public static String numberToString4(char number) {
        String str = switch (number) {
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VIII";
            case '9' -> "IX";
            default -> "";
        };
        return str;
    }

    //判断字符串是否可以旋转成另一个字符串
    /*TODO:sl1:利用substring方法进行分割拼接*/
    public static boolean isRotateString(String stra, String strb) {

        //1.将字符串A旋转多次，判断是否能变成字符串B
        for (int i = 0; i < stra.length(); i++) {
            String str = stra.substring(i + 1) + stra.substring(0, i + 1);
            if (str.equals(strb)) {
                return true;
            }
        }

        return false;
    }

    //TODO:sl2:将字符串转换为字符数组进行交换，再转回字符串
    public static boolean isRotateString2(String stra, String strb) {
        boolean isequals = false;
        for (int j = 0; j < stra.length(); j++) {
            //1.TODO:将字符串A转换为字符数组:str.toCharArray()
            char[] chararr = stra.toCharArray();
            //2.取出字符数组的第一个字符
            char first = chararr[0];
            //3.将除了第一个字符以外的其他字符都向左移动一位
            for (int i = 1; i < chararr.length; i++) {
                chararr[i-1] = chararr[i];
            }
            //4.将取出的第一个字符放到字符数组的最后面
            chararr[chararr.length-1] = first;
            //5.将字符数组转换为字符串
            String str = new String(chararr);
            if (str.equals(strb)) {
                isequals = true;
            }
        }
        return isequals;
    }

    //判断字符串是否对称
    public static boolean isSymmetric(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }

    public static boolean isLegalIdCard(String str) {
        //1.判断字符串长度是否为18位
        if(str.length() != 18){
            return false;
        }
        //2.判断字符串是否以数字0开头
        if(str.charAt(0) == '0'){
            return false;
        }
        //3.判断字符串前17位是否为数字
        for (int i = 0; i < 17; i++) {
            if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
                return false;
            }
        }
        //4.判断字符串最后一位是否为数字或者大写字母X
        if(!(str.charAt(17)>='0' && str.charAt(17)<='9' || str.charAt(17) == 'X')){
            return false;
        }
        return true;
    }

    //数组中的字符串按照指定格式拼接返回
        public static String arrayToString(char[] arr) {
            if(arr.length==0){
                return "[]";
            }
            StringJoiner sj = new StringJoiner(",","[","]");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ' '){
                    sj.add("null");
                }else{
                    sj.add(arr[i]+"");
                }
            }
            return sj.toString();
        }

        public static int changeToInt(String str) {
                int num = 0;
            for (int i = 0; i < str.length(); i++) {
                num = num * 10 + (str.charAt(i) - '0');
            }
            return num;
        }

        public static int countLastWord(String s) {
            //1.判断字符串是否为空
            if(s.length() == 0){
                return 0;
            }
            //2.灵活->倒过来数，遇到第一个空格，就可以停止了
            int len = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if(s.charAt(i) == ' '){
                    break;
                }
                len++;
            }
            return len;
        }

}
