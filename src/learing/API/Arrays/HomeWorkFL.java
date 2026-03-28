package learing.API.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWorkFL {
    public static void main(String[] args) {
        /*定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1:属性有姓名、年龄、身高。(姓名中不要有中文或特殊字符，会涉及到后面的知识)
        要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。*/

        //数组并存储一些女朋友对象
        GirlFriend gf1 = new GirlFriend("xiaoli",19,1.6);
        GirlFriend gf2 = new GirlFriend("xiaolv",20,1.70);
        GirlFriend gf3 = new GirlFriend("xiaozhou",18,1.65);
        GirlFriend gf4 = new GirlFriend("xiaoyao",18,1.65);
        GirlFriend[] gfArray = {gf1,gf2,gf3,gf4};

//        //排序
//        Arrays.sort(gfArray,new Comparator<GirlFriend>() {
//            @Override
//            public int compare(GirlFriend o1, GirlFriend o2) {
//                //要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
//                double temp = o1.getAge() - o2.getAge();
//                temp = temp == 0?o1.getHeight() - o2.getHeight():temp;
//                temp = temp ==0?o1.getName().compareTo(o2.getName()):temp;
//
//                if(temp > 0){
//                    return 1;
//                }else if(temp < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });

        //排序
        //用Lambda表达式实现
        Arrays.sort(gfArray,(o1, o2) -> {
                //要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0?o1.getHeight() - o2.getHeight():temp;
                temp = temp ==0?o1.getName().compareTo(o2.getName()):temp;

                if(temp > 0){
                    return 1;
                }else if(temp < 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        );

        //遍历数组
        for (int i = 0; i < gfArray.length; i++) {
            System.out.print(gfArray[i]+" ");
        }





    }
}
