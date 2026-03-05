package learing;
// 1.先导包
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        //单行注释
        /*多行注释*/
        /*另外，多行注释太杂乱，想要标记突出注释重点：TODO:*/
        /*TODO:nihaoya
          uuu*/
        System.out.println("Hello World!");


        /*TODO:ctrl+D 复制当前行
        *  ctrl+H/R 要改多个相同的字段时（全局替换）*/
        System.out.println("Hello zmh!");
        System.out.println("Hello zmh!");
        System.out.println("Hello zmh!");


        /*TODO:变量
          使用前要初始化 */
        String name="zmh";
        System.out.println(name);

        /*TODO:标识符（变量名）
          命名：英文,$,_,数字(数字不能作为开头)，且采用小驼峰命名法：eg:userName
          类名（大驼峰命名法）:GoodStudent*/


        //TODO: 数据类型（浮点型：默认是double ;要想用float,在数值后面加f/F）
        //TODO: Long 的数值后面要加L(eg:long length = 19999999L)
        //TODO: 数据类型的转换 范围小的数据——>范围大的数据 可以的； 要是大转小-->强转 eg:int score = (int)score;
        //TODO: 隐式转换（范围小的数据——>范围大的数据）且byte,short,char 在计算时直接转换为int
        //TODO: 强制转换（范围大的数据——>范围小的数据）



        /*TODO：运算符...*/

        // 二元运算符：
        // 那个范围大取那个范围，最小的范围取int
        System.out.println(1/2);//(int,int)=>int
        System.out.println(1.0/2);//(double,int)=>double

        // 符合赋值运算符
        //使用符合赋值运算符的话，它的数据类型不会发生变化（隐藏了一个强制类型转换）
//        byte b=10;
//        //b = b + 20;//byte=>int
//        b +=20;//byte=>byte，b=(byte)(b+20)

        //逻辑运算符
        //&：两边同时为true才为true
        //|：只要有一个是true，拿结果就是true
        //^：相同为false，不同为true
        //！：非，true变false，false变true
        // &&：短路与，左边为false，右边不执行
        // ||：短路或，左边为true，右边不执行  提高效率

        //位运算符
        //<<：左移运算符，相当于乘以2，向左移动，右边空出的位用0补齐
        //>>：右移运算符，相当于除以2，向右移动，左边空出的位用符号位补齐（如果是正数，左边空出的位用0补齐，负数左边空出的位用1补齐）
        //>>>：无符号右移运算符，相当于除以2，但是忽略了符号位，空位都以0补齐

        //三元运算符
        int i = 10;
        int k= (i>5? 1+1 : 2+2 );
        //前面true，则执行第一个表达式；false则执行第二个表达式
        System.out.println(k);

        //TODO:键盘的输入
        //2.创建对象
        Scanner sc = new Scanner(System.in);
        //3.接受数据
        int number = sc.nextInt();

        System.out.println(number);



    }
}

