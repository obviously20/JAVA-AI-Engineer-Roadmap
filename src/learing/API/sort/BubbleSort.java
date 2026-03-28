package learing.API.sort;

public class BubbleSort {
    public static void main(String[] args) {
         /*
            冒泡排序：
            核心思想：
            1，相邻的元素两两比较，大的放右边，小的放左边。
            2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
            3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
        */

        int[] arr = {1,3,4,2,5};

        //冒泡排序的代码
        //外层循环控制轮数:为了节省时间提高效率，我们只比较n-1轮，即n个数据，n-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制比较次数
            //两两相邻的比较，大的放右边，小的放左边；eg：有5个数据，01 12 23 34
            //因此这里的arr.length - 1 -i,中的-1：是为了避免越界，最后一个元素不需要比较，因为已经34 比过一次，已经确定了最大值
            //而-i:外层循环执行完一次，最大值就已经确定，第二轮可以少循环一次（-1），后面以此类推-2...-n-2
            for (int j = 0; j < arr.length - 1 -i; j++) {
                //如果当前元素大于下一个元素，交换它们的位置
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
