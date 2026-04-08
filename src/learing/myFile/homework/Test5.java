package learing.myFile.homework;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        //需求:统计一个文件夹中每种文件的个数并打印。
        //(考虑子文件夹)
        //打印格式如下:
        //txt:3个
        //doc:4个
        //jpg:6个

        File file = new File("D:\\JAVA_learning\\Java-top-speed\\src\\learing\\myFile\\homework\\testLand\\forTest5");
        HashMap<String, Integer> hm = countFiles(file);
        System.out.println(hm);


    }

    public static HashMap<String, Integer> countFiles(File file) {
        //不知道文件夹中有多少种文件，所以不能用计数器思想来统计-->so,用map来存储文件类型和个数(key,value)
        HashMap<String, Integer> hm = new HashMap<>();
        //先获取文件夹中的所有文件和文件夹
        File[] files = file.listFiles();
        //遍历文件夹中的所有文件和文件夹
        if (files != null) {
            for (File f : files) {
                //判断是否是文件
                if (f.isFile()) {
                    //获取文件名
                    String fileName = f.getName();
                    //以.为分隔符，将文件名拆分成文件名和文件类型
                    String[] fileNames = fileName.split("\\.");//.表示任意字符，\.表示点，但是\要转义，所以用\\.表示点
                    if (fileNames.length >= 2) {
                        //获取文件类型
                        String fileType = fileNames[fileNames.length - 1];
                        //判断hm中是否有该文件类型
                        if (hm.containsKey(fileType)) {
                            int count = hm.get(fileType);
                            count++;
                            hm.put(fileType, count);
                        } else {
                            hm.put(fileType, 1);
                        }
                    }
                } else if (f.isDirectory()) {
                    //如果是文件夹,递归调用方法
                    HashMap<String, Integer> hm1 = countFiles(f);//递归调用方法,得到子文件夹中的文件类型和个数
                    //遍历hm1,将子文件夹中的文件类型和个数合并到hm中
                    Set<Map.Entry<String, Integer>> entries = hm1.entrySet();//获取hm1中的所有键值对
                    for (Map.Entry<String, Integer> entry : entries) {
                        String key = entry.getKey();//获取键
                        Integer value = entry.getValue();//获取值
                        //判断hm中是否有该文件类型
                        if (hm.containsKey(key)) {
                            //有,则将子文件夹中的文件类型和个数合并到hm中
                            int count = hm.get(key);//这里的count是hm中该文件类型的个数,不是子文件夹中的文件类型个数
                            count += value;//value是子文件夹中的文件类型个数,所以要加到count中该文件类型的个数
                            hm.put(key, count);
                        } else {
                            //没有,则直接将子文件夹中的文件类型和个数添加到hm中
                            hm.put(key, value);
                        }
                    }
                }
            }
        }
        return hm;
    }



}


