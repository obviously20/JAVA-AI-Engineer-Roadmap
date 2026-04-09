package learing.myIO.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class T4 {
    public static void main(String[] args) throws IOException {
        /*
            文本文件中有以下的数据：
                2-1-9-4-7-8
            将文件中的数据进行排序，变成以下的数据：
                1-2-4-7-8-9
        */

        //f1
        //1.先将文件中的数据读取出来
        FileInputStream fis = new FileInputStream("src/learing/myIO/tryland/T4.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        byte[] buf = new byte[1024];
        while((len=fis.read(buf))!=-1){
            sb.append(new String(buf, 0, len));
        }
        fis.close();
//        System.out.println(sb.toString());

        //2.排序
        Integer[] integers = Stream.of(sb.toString().split("-"))
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                }).sorted().toArray(Integer[]::new);

        //3.将排序后的数据写入文件
        String str = Arrays.toString(integers);
        str = str.replace("[","").replace("]","").replace(", ","-");
        FileOutputStream fos = new FileOutputStream("src/learing/myIO/tryland/T4.txt",true);
        fos.write("\r\n".getBytes());
        fos.write(str.getBytes());
        fos.close();


    }
}
