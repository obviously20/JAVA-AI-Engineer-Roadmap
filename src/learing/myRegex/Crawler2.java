package learing.myRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler2 {
    public static void main(String[] args) {
//        //TODO 条件爬取  ?i  ?= ?: ?!
//        /*
//            有如下文本，按要求爬取数据。
//                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
//                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
//
//
//            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
//            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
//            需求3:爬取除了版本号为8，11.17的Java文本，
//        */
//
//        String text = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，\n" +
//                "                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
//
//        //需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
//        //?i:忽略大小写
//        //?=8|11|17:后面跟着8，11，17
//        String regex1 = "((?i)Java)(?=8|11|17)";
//        //需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
//        String regex2 = "((?i)java)(8|11|17)";
//        String regex3 = "((?i)java)(?:8|11|17)";//与上面相同作用
//        //需求3:爬取除了版本号为8，11.17的Java文本
//        String regex4 = "((?i)java)(?!8|11|17)";
//
//        Pattern p = Pattern.compile(regex4);
//        Matcher m = p.matcher(text);
//        while (m.find()) {
//            System.out.println(m.group());
//        }
//

//        //TODO 贪婪爬取 非贪婪爬取
//        /*
//            只写+和*表示贪婪匹配
//
//            +? 非贪婪匹配
//            *? 非贪婪匹配
//
//            贪婪爬取:在爬取数据的时候尽可能的多获取数据
//            非贪婪爬取:在爬取数据的时候尽可能的少获取数据
//
//            ab+:
//            贪婪爬取:abbbbbbbbbbbb
//            非贪婪爬取:ab
//        */
//
//        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
//                "经历了很多版木，目前企业中用的最多的是]ava8和]ava11，因为这两个是长期支持版木。" +
//                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
//        //需求1:爬取abbbbbbbbbbbb(贪婪爬取)
////        Pattern p = Pattern.compile("ab+");
//        //需求2:爬取ab(非贪婪爬取)
//        Pattern p = Pattern.compile("ab+?");
//        Matcher m = p.matcher(s);
//        while (m.find()) {
//            System.out.println(m.group());
//        }


        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来*/
        //public String replaceAll(String regex,String newStr)
        //参数regex表示一个正则表达式。可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。
        //public String[] split(String regex)
        ////参数regex表示正则表达式。可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。


//        //需求1:把字符串中三个姓名之间的字母替换为vs
//        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
//        s = s.replaceAll("[\\w&&[^_]]+", "vs");
//        System.out.println(s);

        //需求2:把字符串中的三个姓名切割出来
        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String[] names = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }






    }
}
