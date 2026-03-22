package learing.myRegex;

public class Grouping {
    public static void main(String[] args) {
        /*todo ##  正则表达式-分组括号( )
            细节：如何识别组号？
            只看左括号，不看有括号，按照左括号的顺序，从左往右，依次为第一组，第二组，第三组等等*/

        //todo 捕获组( )
        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)
        // \\组号:表示把第X组的内容再出来用一次
        //(.):表示任意字符
        //+表示1个或多个
        //\\1表示引用第一组的内容
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));//true
        System.out.println("b456b".matches(regex1));//true
        System.out.println("17891".matches(regex1));//true
        System.out.println("&abc&".matches(regex1));//true
        System.out.println("a123b".matches(regex1));//false
        System.out.println("------------------------------");

        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));//true
        System.out.println("b456b".matches(regex2));//true
        System.out.println("123789123".matches(regex2));//true
        System.out.println("&!@abc&!@".matches(regex2));//true
        System.out.println("abc123abd".matches(regex2));//false
        System.out.println("------------------------------");

        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&& &&abc&&(false)
        //开头和结尾中的那一串字符中的每个字符都需要一致
        //\\2*表示引用第二组的内容，0个或多个
        //\\1表示引用第一组的内容
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));//true
        System.out.println("bbb456bbb".matches(regex3));//true
        System.out.println("111789111".matches(regex3));//true
        System.out.println("&&abc&&".matches(regex3));//true
        System.out.println("aaa777aab".matches(regex3));//false
        System.out.println("------------------------------");


        //Todo 捕获分组：后续还要用到组内的内容
        //组内：\\组号
        //组外：$组号

        //需求:
        //将字符串：我要学学编编编编程程程程程程。
        //替换为：我要学编程
        String text = "我要学学编编编编程程程程程程。";
        // (.):表示第一个任意字符
        // \\1+表示引用第一组的内容，至少出现一次或多次
        // $1表示在组外引用第一组的内容
        String regex4 = "(.)\\1+";
        String result = text.replaceAll(regex4, "$1");
        System.out.println(result);
        System.out.println("------------------------------");

        //todo 非捕获分组：分组之后不需要再用本组数据，仅仅是把数据括起来,不占用组号
        //(?:) (?!) (?=)都是非捕获分组//更多的使用第一个

        //(?:\\d|x|x):表示非捕获分组，不占用组号，故\\1在后面会报错，因为没有组号可以引用
        //String regex1 ="[1-9]\\d{16}(?:\\d|x|x)\\1";

        //(\\d|X|x):表示捕获分组，占用组号，故\\1可以在后面引用
        String regex5 ="[1-9]\\d{16}(\\d|X|x)\\1";
        System.out.println("41080119930228457xx".matches(regex5));//捕获的第一组是x,那\\1引用的是x,x与x所以匹配成功
        System.out.println("41080119930228457xX".matches(regex5));//捕获的第一组是x,那\\1引用的是x,x与X不一致所以匹配失败








    }
}
