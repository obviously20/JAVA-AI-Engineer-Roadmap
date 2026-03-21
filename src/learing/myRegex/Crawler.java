package learing.myRegex;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
    public static void main(String[] args) {
        /*Pattern：表示正则表达式
          Matcher：文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。
         	        在大串中去找符合匹配规则的子串。*/


        /* 有如下文本，请按照要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */
        String test = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

//        //先创见正则表达式对象(查找规则)
//        Pattern p = Pattern.compile("Java\\d{0,2}");
//        //再创建文本匹配器对象
//        //m:文本匹配器对象
//        //p:正则表达式对象
//        //test:要匹配的字符串
//        //m:文本匹配器对象要在test字符串中匹配符合正则表达式的规则的子串
//        Matcher m = p.matcher(test);
//        //find()方法:作用是判断是否有符合正则表达式的规则的子串
//        //如果有,则返回true,并记录下子串的起始位置（下标）和结束位置（下标）+1
//        // 如果没有,则返回false
//        boolean b = m.find();
//        //有的话就打印
//        if(b){
//            //group()方法:作用是获取符合正则表达式的规则的子串
//            //如果有,则返回子串
//            //如果没有,则返回空字符串
//            String group = m.group();
//            //打印子串
//            System.out.println(group);
//        }
        //以上是查找一个符合正则表达式的规则的子串，但是你不知道文本中到底有多少个符合正则表达式的规则的子串-->while

//        Pattern p = Pattern.compile("Java\\d{0,2}");
//        Matcher m = p.matcher(test);
//        while(m.find()){
//            String s = m.group();
//            System.out.println(s);
//        }




//        /*网络爬取
//         扩展需求2:
//            把连接:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
//            中所有的身份证号码都爬取出来。
//        */
//
//         /* 扩展需求2:
//            把连接:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
//            中所有的身份证号码都爬取出来。
//        */
//
//        //创建一个URL对象
//        URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i");
//        //连接上这个网址
//        //细节:保证网络是畅通
//        URLConnection conn = url.openConnection();//创建一个对象去读取网络中的数据
//        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        String line;
//        //获取正则表达式的对象pattern
//        String regex = "[1-9]\\d{17}";
//        Pattern pattern = Pattern.compile(regex);//在读取的时候每次读一整行
//        while ((line = br.readLine()) != null) {
//            //拿着文本匹配器的对象matcher按照pattern的规则去读取当前的这一行信息
//            Matcher matcher = pattern.matcher(line);
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }
//        }
//        br.close();




         /*
            需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
            来黑马程序员学习Java，
            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，
            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，
            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090

            手机号的正则表达式:1[3-9]\\d{9}
            邮箱的正则表达式:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}
            座机电话的正则表达式:θ\d{2,3}-?[1-9]\d{4,9}
            热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}

        */

        String text = "来黑马程序员学习Java，\n" +
                "            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，\n" +
                "            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，\n" +
                "            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";

        String regex = "(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(θ\\d{2,3}-?[1-9]\\d{4,9})|(400-?[1-9]\\d{2}-?[1-9]\\d{3})";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }


















    }
}
