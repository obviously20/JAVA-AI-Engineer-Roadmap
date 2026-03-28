package learing.API.search;

public class BasicSearch {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心：
        //从0索引开始挨个往后查找

        int[] arr={131, 127, 147, 81, 103, 23, 7, 79};
        int target=103;
        boolean result=basicSearch(arr,target);
        System.out.println(result);

    }
    public static  boolean basicSearch(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
