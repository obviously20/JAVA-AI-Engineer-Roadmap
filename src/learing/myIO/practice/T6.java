package learing.myIO.practice;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class T6 {
    public static void main(String[] args) throws IOException {
        //修改文本顺序
        //需求:把《出师表》的文章顺序进行恢复到一个新文件中。

        //纯文本：字符缓冲流

//        BufferedReader br = new BufferedReader(new FileReader("src/learing/myIO/tryland/buffered/T6csb.txt"));
//
//        ArrayList<String> list = new ArrayList<>();
//        //1.读取文件内容
//        String line;
//        while ((line = br.readLine()) != null) {
//            //将文章的顺序和内容存储到HashMap中
//            list.add(line);
//        }
//        br.close();
//
//        //2.修改文章顺序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                Integer o1Num = Integer.parseInt(o1.split("\\.")[0]);
//                Integer o2Num = Integer.parseInt(o2.split("\\.")[0]);
//                return o1Num - o2Num;
//            }
//        });
////        System.out.println(list);
//
//        //3.写入新文件
//        BufferedWriter bw = new BufferedWriter(new FileWriter("src/learing/myIO/tryland/buffered/T6csb.txt"));
//        for (int i = 0; i < list.size(); i++) {
//            bw.write(list.get(i));
//            bw.newLine();
//        }
//        bw.close();





        //f2
        BufferedReader br = new BufferedReader(new FileReader("src/learing/myIO/tryland/buffered/T6csb.txt"));
        TreeMap<Integer,String> map = new TreeMap<>();//自动排序
        String line;
        while ((line = br.readLine()) != null) {
            map.put(Integer.parseInt(line.split("\\.")[0]),line);
        }
        br.close();
        //排好序后，将文章写入新文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/learing/myIO/tryland/buffered/T6csb.txt"));
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            bw.write(map.get(key));
            bw.newLine();
        }
        bw.close();













    }
}
