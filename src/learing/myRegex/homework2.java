package learing.myRegex;

public class homework2 {
    public static void main(String[] args) {
        /*需求
	请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位
	请编写正则表达式验证身份证号码是否满足要求。
	简单要求:
    		18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
	复杂要求:
    		按照身份证号码的格式严格要求。

    	身份证号码:
    		41080119930228457x
    		510801197609022309
    		15040119810705387X
    		130133197204039024
    		430102197606046442*/

//        //用户名要求：
//        //大小写字母，数字，下划线一共4-16位
//        String Regex1 = "\\w{4,16}";
//        System.out.println("obviously20".matches(Regex1));//true
//        System.out.println("obviously_20".matches(Regex1));//true
//        System.out.println("-----------------------------------------");
//
//        //身份证简单要求:
//        //18位，前17位任意数字(第一位不能为0)，最后一位可以是数字可以是大写或小写的x
////        String Regex2 = "[1-9]\\d{16}(\\d|x|X)";
////        String Regex3 = "[1-9]\\d{16}[\\dXx]";
//        //TODO (?i)表示不区分大小写
//        String Regex5 = "(?i)abc";//不区分大小写，匹配abc或ABC
//        System.out.println("abc".matches(Regex5));//true
//        System.out.println("ABC".matches(Regex5));//true
//        System.out.println("----------------------------------------");
//        String Regex6 = "a(?i)bc";//不区分大小写，匹配a后跟bc或BC
//        System.out.println("abc".matches(Regex6));//true
//        System.out.println("aBC".matches(Regex6));//true
//        System.out.println("ABC".matches(Regex6));//false
//        System.out.println("----------------------------------------");
//        String Regex7 = "a((?i)b)c";//不区分大小写，匹配a后跟b或B后跟c
//        System.out.println("abc".matches(Regex7));//true
//        System.out.println("aBC".matches(Regex7));//false
//        System.out.println("ABC".matches(Regex7));//false
//        System.out.println("aBc".matches(Regex7));//true
//        System.out.println("-----------------------------------------");
//        String Regex4 = "[1-9]\\d{16}(\\d|(?i)x)";
//        System.out.println("41080119930228457x".matches(Regex4));//true
//        System.out.println("510801197609022309".matches(Regex4));//true
//        System.out.println("15040119810705387X".matches(Regex4));//true
//        System.out.println("130133197204039024".matches(Regex4));//true
//        System.out.println("430102197606046442".matches(Regex4));//true
//        System.out.println("-----------------------------------------");

        //身份证复杂要求:
        //按照身份证号码的格式严格要求。
        //前6位：省份 城市区县 派出所的代码  -------------------------------->"[1-9][0-9]{5}"
        //年：4位 前2位：18、19 20        -------------------------------->"(1[89]|20)"
        //      后2位： 任意数字          -------------------------------->"[0-9]{2}"
        //月：01-09、10、11、12          -------------------------------->"(0[1-9]|1[0-2])"
        //日：01-31-->(01-09、10-19、20-29、30-31)----------------------->"(0[1-9]|[12][0-9]|3[01])"
        //后面4位：前三位任意数字，最后一位可以是数字可以是大写或小写的x----------->"[0-9]{3}[\\dXx]"
        String Regex8 = "[1-9][0-9]{5}(1[89]|20)[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[0-9]{3}[\\dXx]";
        System.out.println("41080119930028457x".matches(Regex8));//false-->没有00月
        System.out.println("510801197609022309".matches(Regex8));//true
        System.out.println("15040119810705387X".matches(Regex8));//true
        System.out.println("130133197204039024".matches(Regex8));//true
        System.out.println("430102197606046442".matches(Regex8));//true







    }
}
