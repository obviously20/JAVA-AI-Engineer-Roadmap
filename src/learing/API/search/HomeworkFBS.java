package learing.API.search;

import java.util.ArrayList;

public class HomeworkFBS {
    public static void main(String[] args) {
        //课堂练习1:
        //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求:不需要考虑数组中元素是否重复
        int[] arr1={131, 127, 147, 81, 103, 23, 7, 79};
        int target1=7;
        int result1=basicSearch1(arr1,target1);
        System.out.println(result1);

        //课堂练习2:
        //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求:需要考虑数组中元素有重复的可能性
        //{131, 127, 147, 81, 103, 23, 7, 79, 81}
        //我要查找81，想要返回的是所有索引 38
        int[] arr2={131, 127, 147, 81, 103, 23, 7, 79, 81};
        int target2=81;
        ArrayList<Integer> list=basicSearch2(arr2,target2);
        System.out.println(list);
    }

    //1
    public static int basicSearch1(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //2
    public static ArrayList<Integer> basicSearch2(int[] arr,int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                list.add(i);
            }
        }
        return list;
    }

















}
