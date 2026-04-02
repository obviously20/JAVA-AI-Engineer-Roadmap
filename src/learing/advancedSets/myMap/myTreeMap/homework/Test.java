package learing.advancedSets.myMap.myTreeMap.homework;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        //需求:
        //字符串“aababcabcdabcde”
        //请统计字符串中每一个字符出现的次数，并按照以下格式输出
        //输出结果:
        //a(5)b(4)c(3)d(2)e(1)


        String str = "aababcabcdabcde";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            //+"":将字符转换为字符串
            String s = str.charAt(i)+"";
            list.add(s);
        }
                //统计每个字符出现的次数
        TreeMap<String,Integer> tm = new TreeMap<>();
        for (String s : list) {
            if(tm.containsKey(s)){
                int count = tm.get(s);
                tm.put(s,count+1);
            }else{
                tm.put(s,1);
            }
        }
        //输出结果
        tm.forEach((key,value)->{
            System.out.print(key+"("+value+")"+" ");
        });

//        tm.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.print(s+"("+integer+")"+" ");
//            }
//        });


    }
}
