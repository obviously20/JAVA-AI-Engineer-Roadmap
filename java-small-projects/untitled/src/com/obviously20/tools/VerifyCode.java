package com.obviously20.tools;

import java.util.Random;

public class VerifyCode {
    //TODO 验证码工具类，用于生成随机验证码
    //私有化构造方法，防止外部实例化
    private VerifyCode() {
    }

    public static String comeOutVeriftyCode() {
        //1、定义一个库，用于存储验证码所需的字母
        String enze = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //2、标记现在还没有添加数字
        boolean haveNum = false;
        //3、定义一个容器，用于存储验证码
        StringBuilder builder = new StringBuilder();
        //限定界限生成一串5位验证码：4个字母+1个数字且随机顺序
        Random random = new Random();
        int numindex = random.nextInt(5);//0-4
        while (builder.length() < 5) {//当长度为4的时候，进去再添加一个就满足5位，所以<5
            if (!haveNum && builder.length() == numindex) {
                builder.append(random.nextInt(10));
            } else {
                int index = random.nextInt(enze.length());//0-51
                builder.append(enze.charAt(index));//将随机索引对应的字符添加到验证码容器中
            }
        }

        return builder.toString();
    }
}
