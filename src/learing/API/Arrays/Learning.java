package learing.API.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Learning {
    public static void main(String[] args) {
        /*
        public static String toString(数组)                把数组拼接成一个字符串
        public static int binarySearch (数组，查找的元素)    二分查找法查找元素
        public static int[] copyOf(原数组，新数组长度)       拷贝数组
        public static int[] copyOfRange(原数组，起始索引，结束索引)  拷贝数组（指定范围）
        public static void fill(数组，元素)                  填充数组
        public static void sort(数组)                       按照默认方式进行数组排序
        public static void sort(数组，排序规则)              按照指定的规则排序
*/

        int[] arr1 = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        //1.把数组拼接成一个字符串
        System.out.println(Arrays.toString(arr1));
        System.out.println("-------------------");

        //2.二分查找法查找元素
        //二分查找要有序
        //如果元素在数组中，返回元素的索引
        //如果元素不在数组中，返回-插入点-1
        //插入点：元素应该插入的位置
        //这是为了避免当要查找的元素小于0时但又查找不到元素，导致返回应插入的位置-0（-0==0）而产生歧义,所以要在-插入点-1
        int index = Arrays.binarySearch(arr2, 8);
        System.out.println(index);
        System.out.println("-------------------");

        //3.拷贝数组
        //如果新数组长度小于原数组长度，拷贝时会丢失元素，部分拷贝
        //如果新数组长度大于原数组长度，拷贝时会用0填充
        //如果新数组长度等于原数组长度，完全拷贝
        System.out.println(Arrays.copyOf(arr2, 5));
        System.out.println(Arrays.copyOf(arr2, 10));
        System.out.println(Arrays.copyOf(arr2, 20));
        System.out.println("-------------------");

        //4.拷贝数组（指定范围）；包前不包后
        //如果起始索引大于结束索引，返回空数组
        int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);
        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.copyOfRange(arr2, 5, 2));
        System.out.println("-------------------");

        //5.填充数组:将数组中的所有元素都填充为指定的元素
        Arrays.fill(arr3,100);
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------------");

        //6.排序数组:按照默认方式进行数组排序：升序
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("-------------------");

        //7.排序数组:按照指定的规则排序
        //如果要按照降序排序，需要自定义排序规则
        Integer[] cparr1 = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};
        Arrays.sort(cparr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(cparr1));
        System.out.println("-------------------");




    }

}
