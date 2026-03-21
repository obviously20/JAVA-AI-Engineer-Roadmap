package learing.myRegex;

public class Learning {
    public static void main(String[] args) {
        //TODO 正则表达式：用于匹配字符串的模式
        //TODO 字符类：[ ]  表示匹配方括号中的任意一个字符
        System.out.println("a".matches("[abc]"));//表示字符串的第一个字符必须是a/b/c中的任意一个-->true
        System.out.println("d".matches("[abc]"));//表示字符串的第一个字符必须是a/b/c中的任意一个-->false

        System.out.println("b".matches("[^abc]"));//表示字符串的第一个字符必须不是a/b/c中的任意一个-->false
        System.out.println("z".matches("[^abc]"));//表示字符串的第一个字符必须不是a/b/c中的任意一个-->true

        System.out.println("你".matches("[a-zA-Z]"));//表示字符串的第一个字符必须是a-zA-Z中的任意一个-->false
        System.out.println("ai".matches("[a-zA-Z]"));//表示字符串的第一个字符必须是a-zA-Z中的任意一个-->false(因为ai不是a-zA-Z中的任意一个)
        System.out.println("ai".matches("[a-zA-Z][a-zA-Z]"));//一个字符对应一个正则表达式，所以ai符合正则表达式，返回true
        System.out.println("a".matches("[a-zA-Z]"));//表示字符串的第一个字符必须是a-zA-Z中的任意一个-->true

        //TODO 并集[[]]
        System.out.println("a".matches("[a-d[m-p]]"));//表示第一个字符必须是a-d或者m-p中的任意一个-->true
        System.out.println("e".matches("[a-d[m-p]]"));//表示第一个字符必须是a-d或者m-p中的任意一个-->false
        System.out.println("ae".matches("[a-d[m-p]][a-d[m-p]]"));
        //表示第一个字符必须是a-d或者m-p中的任意一个,第二个字符必须是a-d或者m-p中的任意一个-->false

        //TODO 交集[&&]
        System.out.println("a".matches("[a-zA-Z&&[def]]"));//-->def-->false
        System.out.println("d".matches("[a-zA-Z&&[def]]"));//-->def-->true
        System.out.println("b".matches("[[b-d[m-p]]&&[a-z]]"));//-->字符在b-d/m-p中的任意一个,且是小写字母-->true

        //TODO 减去
        System.out.println("m".matches("[a-zA-Z&&[^m]]"));//除了m,其他任意一个字符-->false
        System.out.println("D".matches("[a-zA-Z&&[^m]]"));//除了m,其他任意一个字符-->true
        System.out.println("A".matches("[a-zA-Z&&[^m-p]]"));//除了m-p,其他任意一个字符-->true
        System.out.println("d".matches("[a-zA-Z&&[^cd]]"));//除了cd,其他任意一个字符-->false

        //TODO 预定义字符类
        // . 任何字符（与结束符"\n"可能匹配也可能不匹配）
        // 。 前面有接东西的话"\\.",前面没有接东西的话"."
        System.out.println("a".matches("."));//第一个字符可以是任意字符-->true
        System.out.println("F".matches("."));//第一个字符可以是任意字符-->true
        System.out.println("$".matches("."));//第一个字符可以是任意字符-->true
        System.out.println("\\n".matches("."));//第一个字符可以是任意字符-->false
        System.out.println("#$".matches(".."));//第一个字符可以是任意字符-->true
        System.out.println("99".matches(".."));//第一个字符可以是任意字符-->true

        // TODO 数字：[0-9]-->"\d"
        System.out.println("1".matches("[0-9]"));//表示字符串的第一个字符必须是0-9中的任意一个-->true
        System.out.println("1".matches("\\d"));//表示字符串的第一个字符必须是0-9中的任意一个-->true
        System.out.println("8".matches("[0-9]"));//表示字符串的第一个字符必须是0-9中的任意一个-->true
        System.out.println("18".matches("[0-9][0-9]"));//表示字符串的第一个字符必须是0-9中的任意一个,第二个字符必须是0-9中的任意一个-->true
        System.out.println("182".matches("[0-9][0-9]"));//false

        //TODO 非数字：[^0-9]-->"\D"
        System.out.println("1".matches("[^0-9]"));//表示字符串的第一个字符必须不是0-9中的任意一个-->false
        System.out.println("1".matches("\\D"));//表示字符串的第一个字符必须不是0-9中的任意一个-->false
        System.out.println("你".matches("\\D"));//表示字符串的第一个字符必须不是0-9中的任意一个-->true

        //TODO 空白字符：[\t\n\x0B\f\r]-->"\s"
        System.out.println(" ".matches("\\s"));//表示字符串的第一个字符必须是空白字符-->true
        System.out.println("l".matches("\\s"));//表示字符串的第一个字符必须是空白字符-->false

        //TODO 非空白字符：[^\s]-->"\S"
        System.out.println("l".matches("\\S"));//表示字符串的第一个字符必须不是空白字符-->true
        System.out.println("$".matches("\\S"));//表示字符串的第一个字符必须不是空白字符-->true
        System.out.println(" ".matches("\\S"));//表示字符串的第一个字符必须不是空白字符-->false

        //TODO 单词字符：[a-zA-Z0-9_]-->"\w"-->大小写字母和下划线和数字
        System.out.println("a".matches("\\w"));//表示字符串的第一个字符必须是a-zA-Z0-9_中的任意一个-->true
        System.out.println("_".matches("\\w"));//表示字符串的第一个字符必须是a-zA-Z0-9_中的任意一个-->true
        System.out.println("9".matches("\\w"));//表示字符串的第一个字符必须是a-zA-Z0-9_中的任意一个-->true
        System.out.println("(".matches("\\w"));//表示字符串的第一个字符必须是a-zA-Z0-9_中的任意一个-->false

        //TODO 非单词字符：[^\w]-->"\W"
        System.out.println("(".matches("\\W"));//表示字符串的第一个字符必须不是a-zA-Z0-9_中的任意一个-->true
        System.out.println("你".matches("\\W"));//表示字符串的第一个字符必须不是a-zA-Z0-9_中的任意一个-->true
        System.out.println("_".matches("\\W"));//表示字符串的第一个字符必须不是a-zA-Z0-9_中的任意一个-->true



        //Greedy 数量词
        /*语法示例：
        1. X? : 0次或1次
        2. X* : 0次到多次
        3. X+ : 1次或多次
        4. X{n} : 恰好n次
        5. X{n,} : 至少n次
        6. X{n,m}: n到m次(n和m都是包含的)*/

        //TODO X? : 0次或1次
        System.out.println("a".matches("a?"));//-->true
        System.out.println("".matches("a?"));//-->true
        System.out.println("aaa".matches("a?"));//-->false

        //TODO X* : 0次到多次
        System.out.println("a".matches("a*"));//-->true
        System.out.println("".matches("a*"));//-->true
        System.out.println("aaa".matches("a*"));//-->true

        //TODO X+ : 1次或多次
        System.out.println("a".matches("a+"));//-->true
        System.out.println("".matches("a+"));//-->false
        System.out.println("aaa".matches("a+"));//-->true

        //TODO X{n} : 恰好n次
        System.out.println("a".matches("a{2}"));//-->false
        System.out.println("aaa".matches("a{2}"));//-->false
        System.out.println("aa".matches("a{2}"));//-->true

        //TODO X{n,} : 至少n次
        System.out.println("aaa".matches("a{2,}"));//-->true
        System.out.println("aa".matches("a{2,}"));//-->true
        System.out.println("a".matches("a{2,}"));//-->false

        //TODO X{n,m} : n到m次(n和m都是包含的)
        System.out.println("aaa".matches("a{2,3}"));//-->true
        System.out.println("aa".matches("a{2,3}"));//-->true
        System.out.println("a".matches("a{2,3}"));//-->false


        //示例：必须是数字字母和下划线
        System.out.println("Wjm_zmh99".matches("\\w{2,}"));//-->true
        System.out.println("_zmh".matches("\\w{5,}"));//-->false
        System.out.println("a_zmh".matches("\\w{5,}"));//-->true


    }
}
