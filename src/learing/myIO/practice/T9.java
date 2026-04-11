package learing.myIO.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T9 {
    public static void main(String[] args) throws IOException {
        //网络爬虫
        //姓氏：https://guoxue.dadaojiayuan.com/baijiaxing/
        //男名：http://www.haoming8.cn/baobao/10881.html
        //女名：https://xuminhao.com/mz/20751.html

        //1.
        String fatherNameurl = "https://www.cnblogs.com/koukoubujiajun/p/9366496.html";
        String boyNameurl = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameurl = "https://xuminhao.com/mz/20751.html";


        //2.创建一个方法将1中的网址上的数据爬取出来，存到字符串中
        String fatherNamestr = getHtml(fatherNameurl);
//        System.out.println(fatherNamestr);
        String boyNamestr = getHtml(boyNameurl);
//        System.out.println(boyNamestr);//弘雪、文逸、城德、菲柯、君信、...
        String girlNamestr = getHtml(girlNameurl);
//        System.out.println(girlNamestr);//凡涵、冰琼、初南、秀雅、瑶潭、娉玉
        //金慧、雁月、弋希、渭优、月婵、晓枫


        //3.解析字符串，提取出所有姓氏、男名、女名
        ArrayList<String> list = getinformation(fatherNamestr, "([\\u4E00-\\u9FA5]{1})(\\|)", 1);
//        System.out.println(list);
        ArrayList<String> boyList = getinformation(boyNamestr, "([\\u4E00-\\u9FA5]{2})(、)", 1);
//        System.out.println(boyList);
        ArrayList<String> girlList = getinformation(girlNamestr, "([\\u4E00-\\u9FA5]{2})(、)", 1);
//        System.out.println(girlList);


        //4.数据处理
        //姓氏
//        System.out.println(list);//没问题
        //男名
//        System.out.println(boyList);//重复
        //去重
        ArrayList<String> boyListNoDuplicate = new ArrayList<>();
        for (String s : boyList) {
            if (!boyListNoDuplicate.contains(s)) {
                boyListNoDuplicate.add(s);
            }
        }
//        System.out.println(boyListNoDuplicate);
        //女名
//        System.out.println(girlList);//没问题

        //5.拼接打印
//        ArrayList<String> nameList = new ArrayList<>();
//        Random r = new Random();
//        for (String s : list) {//遍历姓氏
//            //设男：1
//            //设女：0
//            int sex = r.nextInt(2);
//            if(sex==0){
//                int girlnameindex = r.nextInt(girlList.size());
//                nameList.add(s+girlList.get(girlnameindex));
//            }else if (sex==1){
//                int boynameindex = r.nextInt(boyListNoDuplicate.size());
//                nameList.add(s+boyListNoDuplicate.get(boynameindex));
//            }
//
//        }
//        System.out.println(nameList);

        //生成 张三-男-23 这样的格式
        ArrayList<String> nameList = getNameList(list, boyListNoDuplicate, girlList, 15, 15);
        for (String s : nameList) {
            System.out.println(s);
        }


    }

    //5.创建一个方法，将姓名、性别、年龄拼接成一个字符串
    private static ArrayList<String> getNameList(ArrayList<String> list, ArrayList<String> boyListNoDuplicate, ArrayList<String> girlList, int mancount, int womancount) {
        ArrayList<String> boynameList = new ArrayList<>();
        while (true) {
            if (boynameList.size() == mancount) {
                break;
            }
            Collections.shuffle(boyListNoDuplicate);
            Collections.shuffle(list);
            boynameList.add(list.get(0) + boyListNoDuplicate.get(0));
        }


        ArrayList<String> girlnameList = new ArrayList<>();
        while (true) {
            if (girlnameList.size() == womancount) {
                break;
            }
            Collections.shuffle(girlList);
            Collections.shuffle(list);
            girlnameList.add(list.get(0) + girlList.get(0));
        }

        Random r = new Random();
        ArrayList<String> nameList = new ArrayList<>();
        for (String bn : boynameList) {
            int age = r.nextInt(10) + 18;//18-27岁
            nameList.add(bn + "-男-" + age);
        }
        for (String gn : girlnameList) {
            int age = r.nextInt(10) + 18;//18-27岁
            nameList.add(gn + "-女-" + age);
        }
        Collections.shuffle(nameList);
        return nameList;
    }













    //2.
    public static String getHtml(String url) throws IOException {
        //0.创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //1.创建一个URL对象
        URL urlObj = new URL(url);
        //2.创建一个URLConnection对象，链接上这个网址
        URLConnection urlConn = urlObj.openConnection();
        //3.获取输入流
        //urlConn.getInputStream()：获取输入流（字节流）
        //可能会有编码问题（中文会显示为乱码）-->解决：使用InputStreamReader(转换流)
        //InputStreamReader：字节流-->字符流
        InputStreamReader isr = new InputStreamReader(urlConn.getInputStream());
        //4.读取数据
        int data;
        while ((data = isr.read()) != -1) {
            sb.append((char) data);
        }
        //5.关闭流
        isr.close();
        //6.返回字符串
        return sb.toString();
    }

    //3.创建一个方法解析字符串，提取出所有姓氏、男名、女名
    public static ArrayList<String> getinformation(String str, String regex, int groupNum) {
        //0.创建一个ArrayList对象
        ArrayList<String> list = new ArrayList<>();
        //1.解析字符串，提取出所有姓氏、男名、女名
        //1.1按照正则表达式的规则获取数据
        Pattern pattern = Pattern.compile(regex);
        //1.2创建一个Matcher对象
        Matcher matcher = pattern.matcher(str);
        //1.3使用Matcher对象去匹配字符串
        while (matcher.find()) {
            list.add(matcher.group(groupNum));
        }
        //2返回list
        return list;
    }


}
