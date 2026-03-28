package learing.API.sort;

public class InsertionSort {
    public static void main(String[] args) {
        /*将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
        遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
        N的范围：0~最大索引*/


        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        //1.先找出无序组的开头索引
        //设置无序组的开头索引为先默认为-1
        int startIndex = -1;
        //遍历数组，找到第一个非有序的元素
        //可以把i看成44的索引，i+1看成38的索引，44>38，所以从0-1是有序的，从(i+1):2开始是无序的
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;//无序组的开头索引
                break;
            }
        }
        //2.遍历无序组，将遍历到的元素插入有序序列中适当的位置
        for (int i = startIndex; i < arr.length; i++) {

            //得到当下无序组的开头索引的元素，在后面去改变它的值的时候不会改变原来i的值
            int j = i;

            //从后往前比较，如果当前元素小于有序组的当前比较的元素，就将元素插入插入到有序组的当前比较的元素的前面（交换位置）
            //j>0 :防止越界
            while (j > 0 && arr[j] < arr[j - 1]) {//当38<44时，交换它们的位置，j指向38的索引，j-1指向44的索引，交换它们的位置
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;//j--,现在j还是指向38的索引，同时还让j-1指向38在有序组中前面的元素的索引-->让后续的比较和交换继续进行，直到不满足条件为止
            }
        }

        //排序完成，打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
