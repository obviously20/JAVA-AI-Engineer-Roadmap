package learing.API.sort;

public class SelectionSort {
    public static void main(String[] args) {
        /*
            选择排序：
                1，从0索引开始，跟后面的元素一一比较。01 02 03 04 ...
                2，小的放前面，大的放后面。
                3，第一次循环结束后，最小的数据已经确定。
                4，第二次循环从1索引开始以此类推。

         */


        //1.定义数组
        int[] arr = {2, 4, 5, 3, 1};

        //2.选择排序的代码

        //外层的i拿到内层去比较：即从0索引开始，跟后面的元素一一比较。01 02 03 04 ...--->第一轮完成，最小值已经确定
        //后面又拿索引1的数据，跟后面的元素一一比较，12 13 14 ...--->第二轮完成，次小值已经确定....
        //一共n个元素，n-1轮，最后一轮不需要比较，已经确定了最大值了
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                //如果当前元素大于下一个元素，交换它们的位置
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //排序完成，打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
