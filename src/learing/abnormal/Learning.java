package learing.abnormal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Learning {
    public static void main(String[] args) throws ParseException {
//        //编译时异常(在编译阶段，必须要手动处理，否则代码报错)--提醒开发人员处理异常
//        String time = "2030年1月1日";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date = sdf.parse(time);
//        System.out.println(date);

//        //运行时异常（在编译阶段是不需要处理的，是代码运行时出现的异常）
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException

        /*异常作用一:异常是用来查询bug的关键参考信息
        异常作用二:异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况*/

//        /*
//        JVM默认处理异常的方式：
//            1. 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
//            2. 程序停止执行，异常下面的代码不会再执行了
//        */
//
//        System.out.println("狂踹瘸子那条好腿");
//        System.out.println(2/0);//算术异常 ArithmeticException
//        System.out.println("是秃子终会发光");
//        System.out.println("火鸡味锅巴");


//        /*
//        格式：
//        try {
//            可能出现异常的代码;
//        } catch(异常类名 变量名) {
//            异常的处理代码;
//        }
//        好处:可以让程序继续往下执行，不会停止
//        */
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        try{
//            //可能出现异常的代码;
//            System.out.println(arr[10]);//此处出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
//            //new ArrayIndexOutOfBoundsException();
//            //拿着这个对象到catch的小括号中对比，看括号中的变量是否可以接收这个对象
//            //如果能被接收，就表示该异常就被捕获（抓住），执行catch里面对应的代码
//            //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
//        }catch(ArrayIndexOutOfBoundsException e){
//            //如果出现了ArrayIndexOutOfBoundsException异常，我该如何处理
//            System.out.println("索引越界了");
//        }
//
//        System.out.println("看看我执行了吗？");


//        /*
//        自己处理（捕获异常）灵魂四问：
//        灵魂一问：如果try中没有遇到问题，怎么执行？
//                                    会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
//        注意：
//            只有当出现了异常才会执行catch里面的代码
//        */
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        try{
//            System.out.println(arr[0]);//1
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("索引越界了");
//        }
//
//        System.out.println("看看我执行了吗？");//看看我执行了吗？



//        /*
//        自己处理（捕获异常）灵魂四问：
//        灵魂二问：如果try中可能会遇到多个问题，怎么执行？
//                                        会写多个catch与之对应
//        细节：
//            如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
//        了解性：
//            在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
//             表示如果出现了A异常或者B异常的话，采取同一种处理方案
//        */
//
//        //JDK7
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        try{
//            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
//            System.out.println(2/0);//ArithmeticException
//            String s = null;
//            System.out.println(s.equals("abc"));
//        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println("索引越界了");
//        }catch(NullPointerException e){
//            System.out.println("空指针异常");
//        }catch (Exception e){
//            System.out.println("Exception");
//        }
//
//        System.out.println("看看我执行了吗？");


//        /*
//        自己处理（捕获异常）灵魂三问：
//        如果try中遇到的问题没有被捕获，怎么执行？
//        相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理。
//        */
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        try{
//            System.out.println(arr[10]);//new ArrayIndexOutOfBoundsException();
//        }catch(NullPointerException e){                                     //
//            System.out.println("空指针异常");    //<   -      -      -        -/
//        }
//
//        System.out.println("看看我执行了吗？");


//        /*
//        自己处理（捕获异常）灵魂四问：
//        如果try中遇到了问题，那么try下面的其他代码还会执行吗？
//        下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体
//        但是如果没有对应catch与之匹配，那么还是会交给虚拟机进行处理
//        */
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        try{
//            System.out.println(arr[10]);
//            System.out.println("看看我执行了吗？ ... try");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("索引越界了");
//        }
//
//        System.out.println("看看我执行了吗？ ... 其他代码");

//
//        //  异常对象的三个常用方法
//        // ==============================================
//        /*
//        public String getMessage()    详细消息字符串
//        public String toString()      简短描述
//        public void printStackTrace() 打印完整异常堆栈（红色，最常用）在底层是利用System.err.println进行输出
//                                                                把异常的错误信息以红色字体输出在控制台
//                                                                细节：仅仅是打印信息，不会停止程序运行
//        */
//        //ctrl+Alt+T-->自动添加try...catch语句
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        try {
//            System.out.println(arr[10]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // System.out.println(e.getMessage());
//            // System.out.println(e.toString());
//            e.printStackTrace(); // 开发最常用
//        }
//
//        // ==============================================
//        // System.out 和 System.err 的区别
//        // ==============================================
//        // 黑色：正常输出
//        System.out.println("正常输出");
//        // 红色：错误输出
//        System.err.println("错误输出");



//        // ==============================================
//        //throws：写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
//        //throw：写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。
//
//        int[] arr = null;
//        int max = 0;
//        try {//throw 把异常抛给调用者处理，所以这里要捕获异常
//            max = getMax(arr);
//        } catch (NullPointerException e) {
//            System.out.println("空指针异常");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("索引越界异常");
//        }
//
//        System.out.println(max);
    }

    /**
     * 求数组的最大值
     * @param arr 传入的数组
     * @return 数组中的最大值
     * @throws NullPointerException 当数组为null时抛出
     * @throws ArrayIndexOutOfBoundsException 当数组长度为0时抛出
     */
    public static int getMax(int[] arr) /*throws NullPointerException, ArrayIndexOutOfBoundsException*/ {
        if (arr == null) {
            //手动创建一个异常对象，并把这个异常交给 方法的调用者 处理
            //此时方法就会结束，下面的代码不会再执行了
            throw new NullPointerException();
        }

        if (arr.length == 0) {
            //手动创建一个异常对象，并把这个异常交给方法的调用者处理
            //此时方法就会结束，下面的代码不会再执行了
            throw new ArrayIndexOutOfBoundsException();
        }

        //有异常 throw 抛出异常，方法就会结束，下面的代码不会再执行了
        System.out.println("看看我执行了吗？");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;


        //todo
        // try{}catch{}finally{}:异常处理机制
        // try： try 语句块中可能会抛出异常的代码
        // catch： catch 语句块中用于捕获异常的代码
        // finally： finally 语句块中用于释放资源的代码,无论是否有异常," 都会执行 ",除了System.exit(0)虚拟机退出以外

    }
}
