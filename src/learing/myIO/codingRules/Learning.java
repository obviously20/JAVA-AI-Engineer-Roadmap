package learing.myIO.codingRules;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Learning {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
         ==============================================
         Java中编码的方法（String → byte[]）
         ==============================================
         1. public byte[] getBytes()
            - 作用：使用【平台默认字符集】进行编码
            - 风险：不同系统/IDE默认编码不同（Windows默认GBK，IDEA默认UTF-8），移植性差
         2. public byte[] getBytes(String charsetName)
            - 作用：使用【指定字符集】进行编码（推荐写法）
            - 常用字符集：UTF-8、GBK、ISO-8859-1
         ==============================================
         Java中解码的方法（byte[] → String）
         ==============================================
         1. String(byte[] bytes)
            - 作用：使用【平台默认字符集】进行解码
            - 风险：同样依赖系统环境，易出现乱码
         2. String(byte[] bytes, String charsetName)
            - 作用：使用【指定字符集】进行解码（推荐写法）
         */

        // ================== 1. 编码演示 ==================
        // 定义待编码的字符串
        String str = "ai你哟";

        // 1.1 使用默认字符集编码（不推荐，依赖环境）
        byte[] bytes1 = str.getBytes();
        // 打印字节数组，观察不同编码下的字节差异
        System.out.println("默认编码（UTF-8）结果：" + Arrays.toString(bytes1));

        // 1.2 使用指定字符集GBK编码（推荐，显式指定）
        byte[] bytes2 = str.getBytes("GBK");
        System.out.println("指定GBK编码结果：" + Arrays.toString(bytes2));

        // ================== 2. 解码演示 ==================
        // 2.1 使用默认字符集解码bytes1（编码解码一致，正常显示）
        String str2 = new String(bytes1);
        System.out.println("默认解码bytes1结果：" + str2);

        // 2.2 使用GBK解码bytes1（编码UTF-8，解码GBK，字符集不一致，出现乱码）
        String str3 = new String(bytes1, "GBK");
        System.out.println("GBK解码UTF-8编码的bytes1结果：" + str3);

        // 2.3 使用GBK解码bytes2（编码解码一致，正常显示）
        String str4 = new String(bytes2, "GBK");
        System.out.println("GBK解码GBK编码的bytes2结果：" + str4);

//        // ================== 3. 最佳实践补充（Java 7+ 推荐写法） ==================
//        /*
//         推荐使用 java.nio.charset.StandardCharsets 中的常量，避免硬编码字符串导致的拼写错误
//         同时无需抛出 UnsupportedEncodingException，代码更健壮
//         */
//        // 编码：显式指定UTF-8
//        byte[] utf8Bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
//        // 解码：显式指定UTF-8
//        String utf8Str = new String(utf8Bytes, java.nio.charset.StandardCharsets.UTF_8);
//        System.out.println("标准UTF-8编码解码结果：" + utf8Str);

    }
}

