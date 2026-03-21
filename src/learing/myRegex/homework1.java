package learing.myRegex;

public class homework1 {
    public static void main(String[] args) {
        //      需求：
        //请编写正则表达式验证用户输入的手机号码是否满足要求。
        //请编写正则表达式验证用户输入的邮箱号是否满足要求。
        //请编写正则表达式验证用户输入的电话号码是否满足要求。
        //验证手机号码 13112345678 13712345667 13945679027 139456790271
        //验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
        //验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn

        // 验证手机号码 13112345678 13712345667 13945679027 139456790271
        //第一位必须为1，第二位必须为3-9，其他位必须为数字
        String Regex1 = "1[3-9]\\d{9}";//手机号码的正则表达式
        System.out.println("13112345678".matches(Regex1));//true
        System.out.println("13712345667".matches(Regex1));//true
        System.out.println("13945679027".matches(Regex1));//true
        System.out.println("139456790271".matches(Regex1));//false
        System.out.println("-----------------------------------------");

        // 验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
        //分成3部分：区号、-、号码
        //区号：必须以0开头，后面跟着2-3位数字--> "0\\d{2,3}"
        //-:出现一次或0次--> "-?"
        //号码:5-10位，且第一位不为0-->"[1-9]\\d{4,9}}"
        String Regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(Regex2));//true
        System.out.println("02122442".matches(Regex2));//true
        System.out.println("027-42424".matches(Regex2));//true
        System.out.println("0712-3242434".matches(Regex2));//true
        System.out.println("-----------------------------------------");


        // 验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //分成3部分：用户名、@、域名
        //用户名：大小字母&数字&下划线-->"\\w+"
        //@：必须出现一次--> "@"
        //域名： 也可以分成3部分：数字/字母+.+字母
        // 数字/字母-->"[0-9a-zA-Z]{2,6}";[0-9a-zA-Z]:数字或字母
        // .：必须出现一次--> "\\."
        // 字母：2-3位--> "[a-zA-Z]{2,3}"
        //其次可以把.和字母合并起来看成一个整体--> "\\.[a-zA-Z]{2,3}"-->这个整体必须出现1-2次
        String Regex3 = "\\w+@[0-9a-zA-Z]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(Regex3));//true
        System.out.println("zhangsan@itcast.cnn".matches(Regex3));//true
        System.out.println("dlei0009@163.com".matches(Regex3));//true
        System.out.println("dlei0009@pci.com.cn".matches(Regex3));//true
        System.out.println("-----------------------------------------");

        //any-rule:正则表达式生成工具
        //eg:24小时制时间
        // /^:表示以什么开头
        // $/:表示以什么结尾
        // 而.matches()是默认从头到尾匹配的，可以去掉^和$
        // ?: :表示非捕获组
        // | :表示或
//        String Regex4 = "/^(?:[01]\d|2[0-3]):[0-5]\d:[0-5]\d$/";
//        String Regex4 = "(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        String Regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        //简写：
        //([01]\\d|2[0-3])（:[0-5]\\d){2}
        System.out.println("12:34:56".matches(Regex4));//true
















    }
}
