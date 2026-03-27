package learing.API.PackagingType;

import java.util.Scanner;

public class PackagingType {
    public static void main(String[] args) {
        //Java提供了两个类型系统，基本类型与引用类型，使用基本类型在于效率，
        // 然而很多情况，会创建对象使用，因为对象可以做更多的功能，如果想要我们的基本类型像对象一样操作，就可以使用基本类型对应的包装类
        //包装类有：Integer,Float,Double,Character,Boolean,Short,Byte,Long

        //todo Integer类
        //1.包装类Integer在JDK5之前的创建方法

        //1.1 通过构造方法创建Integer对象(new)
        Integer i1 = new Integer(10);
        System.out.println(i1);

        Integer i2 = new Integer("10");
        System.out.println(i2);


        //1.2 通过Integer.valueOf(String str(数字))方法创建Integer对象：
        //注意1：如果字符串中包含非数字字符，会抛出NumberFormatException异常
//        Integer i3 = Integer.valueOf("10a");//NumberFormatException
        Integer i3 = Integer.valueOf("10");
        System.out.println(i3);

        Integer i4 = Integer.valueOf(10);
        System.out.println(i4);


        System.out.println("-----------------");


        /*2.
            public static string tobinarystring(int i) 得到二进制
            public static string tooctalstring(int i) 得到八进制
            public static string toHexstring(int i) 得到十六进制
            public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
        */
        //2.1 得到二进制
        Integer i5 = Integer.valueOf(10);
        System.out.println(Integer.toBinaryString(i5));//1010

        //2.2 得到八进制
        Integer i6 = Integer.valueOf(10);
        System.out.println(Integer.toOctalString(i6));//12

        //2.3 得到十六进制
        Integer i7 = Integer.valueOf(10);
        System.out.println(Integer.toHexString(i7));//a

        //2.4 将字符串类型的整数转成int类型的整数
        String s = "10";
        int i9 = Integer.parseInt(s);
        System.out.println(i9);//10
        System.out.println(i9+1);//11
        //除了Character类，其他包装类都有parseXXX()方法
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
        //parseInt()方法可以将字符串类型的整数转成int类型的整数,转换时括号中必须是字符串类型的整数，如果是非数字字符，会抛出NumberFormatException异常

        System.out.println("-----------------");

        //3.基本类型与对应的包装类对象之间，来回转换的过程称为”装箱“与”拆箱“：
        //- **装箱**：从基本类型转换为对应的包装类对象。
        //- **拆箱**：从包装类对象转换为对应的基本类型。

        //在jdk5之前，装装箱拆箱操作需要手动进行
        //eg:计算10+10
        Integer i10 = Integer.valueOf(10);
        Integer i11 = Integer.valueOf(10);
        //先拆箱intValue，再计算，再装箱
        int result = i10.intValue() + i11.intValue();
        //再装箱
        Integer i12 = Integer.valueOf(result);
        System.out.println(i12);//20

        //在jdk5之后，装箱拆箱操作可以自动进行，不需要手动进行
        //##  自动装箱与自动拆箱
        //由于我们经常要做基本类型与包装类之间的转换，从Java 5（JDK 1.5）开始，基本类型与包装类的装箱、拆箱动作可以自动完成
        //自动装箱:把基本数据类型会自动的变成其对应的包装类
        //自动拆箱，把包装类会自动变成其对象的基木数据类型

        //实现自动装箱把基本数据类型转int 10换为包装类Integer
        Integer i13 = 10;
        Integer i14 = Integer.valueOf(10);
        //自动拆箱:把包装类会自动变成其对象的基木数据类型i13和i14会自动拆箱为int类型,再计算,再装箱
        Integer result1 = i13 + i14;
        System.out.println(result1);//20

        //我们以后如何获取包装类对象?
        //不需要new，不需要调用方法，直接赋值即可
        //Integer i = 10;
        //Integer i1 = 10;Integer i2 = 10;

        //## todo 底层原理
        //建议：获取Integer对象的时候不要自己new，而是采取直接赋值或者静态方法valueOf的方式
        //
        //因为在实际开发中，-128~127之间的数据，用的比较多。如果每次使用都是new对象，那么太浪费内存了。
        //
        //所以，提前把这个范围之内的每一个数据都创建好对象，如果要用到了不会创建新的，而是返回已经创建好的对象

        //-128~127之间的数据，会自动创建好对象，如果要用到了不会创建新的，而是返回已经创建好的对象
        Integer i15 = Integer.valueOf(10);
        Integer i16 = Integer.valueOf(10);
        System.out.println(i15==i16);//true，==比较的是对象的地址

        Integer i17 = Integer.valueOf(128);
        Integer i18 = Integer.valueOf(128);
        System.out.println(i17==i18);//false，==比较的是对象的地址

        //如果不用valueOf方法，而是用new方法创建对象，那么每次创建的都是新的对象，不会返回已经创建好的对象，而new的对象地址是不同的
        Integer i19 = new Integer(127);
        Integer i20 = new Integer(127);
        System.out.println(i19==i20);//false，==比较的是对象的地址,而new的对象地址是不同的


        System.out.println("-----------------");



        //拓:next() 和 nextLine() 方法--键盘录入数据
        //next() 方法：读取键盘录入的下一个字符串，不包含换行符，遇到空格或换行符，会停止读取，返回读取到的字符串
        //nextLine() 方法：读取键盘录入的下一个字符串，包含换行符，遇到换行符，会停止读取，返回读取到的字符串
        //所以以后录入数据时，建议使用nextLine()方法，而不是next()方法
        //但当nextLine()和nextInt()方法都用在一行上时，会报错，因为nextLine()方法会读取到换行符，
        // 而nextInt()方法会报错,所以要先用nextLine()方法读取到换行符，再用nextInt()方法读取到整数
        //如果要录入int类型的整数时,也可以用nextLine()方法，再用parseInt()方法将字符串类型的整数转成int类型的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String str1 = sc.nextLine();
        int i21 = Integer.parseInt(str1);
        System.out.println(i21);































    }
}
