package learing.advancedSets.myCollections.homework;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        /*需求
定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个。
添加完毕后，遍历结果格式如下:
江苏省=南京市，扬州市，苏州市，无锡市，常州市
湖北省=武汉市，孝感市，十堰市，宜昌市，鄂州市
河北省=石家庄市，唐山市，邢台市，保定市，张家口市*/


        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> citys1 = new ArrayList<>();
        Collections.addAll(citys1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> citys2 = new ArrayList<>();
        Collections.addAll(citys2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> citys3 = new ArrayList<>();
        Collections.addAll(citys3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        map.put("江苏省", citys1);
        map.put("湖北省", citys2);
        map.put("河北省", citys3);

        Set<Map.Entry<String, ArrayList<String>>> set = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> stringArrayListEntry : set) {
            String key = stringArrayListEntry.getKey();
            ArrayList<String> value = stringArrayListEntry.getValue();
            StringJoiner sj = new StringJoiner(", ", "", "");
            for (String c : value) {
                sj.add(c);
            }
            System.out.println(key + " = " + sj);
        }







    }
}
