package learing.API.search;

public class BinarySearch {
    public static void main(String[] args) {
        /*## 二分查找
    	也叫做折半查找
        说明：元素必须是有序的，从小到大，或者从大到小都是可以的。
        如果是无序的，也可以先进行排序。但是排序之后，会改变原有数据的顺序，查找出来元素位置跟原来的元素可能是不一样的，所以排序之后再查找只能判断当前数据是否在容器当中，返回的索引无实际的意义。

　　      **基本思想**：也称为是折半查找，属于有序查找算法。用给定值先与中间结点比较。比较完之后有三种情况：
        * 相等
        说明找到了
        * 要查找的数据比中间节点小
        说明要查找的数字在中间节点左边
        * 要查找的数据比中间节点大
        说明要查找的数字在中间节点右边*/


        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围
        //二分查找中查找点计算如下：
        //　　mid=(low+high)/2, 即mid=low+1/2*(high-low);

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 7;
        int index = binarySearch(arr, target);
        System.out.println(index);



    }

    public static int binarySearch(int[] arr, int target) {
        //1.先设置左右边界
        int low = 0;
        int high = arr.length - 1;
        //2.循环查找
        int mid = 0;
        while(true){
            //判断，如果左边界大于右边界，说明没有找到-->返回-1
            if(low > high){
                return -1;
            }
            //3.计算中间索引
            mid = low + (high - low) / 2;
            //比对中间索引和目标值
            if(arr[mid]>target){
                //说明要查找的数字在中间节点左边,右边界指向中间节点左边
                high =mid-1;
            }else if(arr[mid]<target){
                //中间节点右边,左边界指向中间节点右边
                low =mid +1;
            }else{
                //说明找到了,返回中间索引
                return mid;
            }
        }
    }




}
