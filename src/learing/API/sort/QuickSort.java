package learing.API.sort;

public class QuickSort {
    public static void main(String[] args) {
        /*### 算法步骤
1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数";
2. 创建两个指针，一个从前往后走，一个从后往前走。
3. 先执行后面的指针，找出第一个比基准数小的数字
4. 再执行前面的指针，找出第一个比基准数大的数字
5. 交换两个指针指向的数字
6. 直到两个指针相遇
7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位。
8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的。
9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序
*/

        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
      */

        int[] arr = {1,1, 6, 2, 7, 9, 3, 4, 5, 1,10, 8};

        quickSort(arr, 0, arr.length - 1);

        //排序完成，打印数组
        System.out.println("排序完成的数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {

        //1.先设置好startIndex和endIndex
        int start = startIndex;
        int end = endIndex;

        //6.递归出口
        if(start>end){
            return;
        }



        //2.设置基准数为第一个元素
        int pivot = arr[start];

        //3.开始遍历数组，将比基准数小的元素放到左边，比基准数大的元素放到右边
        //start指针和end指针从两端开始遍历，直到start指针和end指针相遇为止
        while (start!=end){
            //先将end指针向前找，直到找到第一个比基准数小的数字
            while (true){
                if(arr[end] < pivot || start>=end){
                    break;
                }
                end--;
            }
            //再将start指针向后找，直到找到第一个比基准数大的数字
            while (true) {
                if(arr[start] > pivot || start>=end){
                    break;
                }
                start++;
            }
            //交换两个指针指向的数字
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //4.基准数归位
        //将被定为基准数的第一个元素，交换到start==end指针指向的位置
        int temp = arr[start];
        arr[start] = pivot;
        arr[startIndex]=temp;

        //5.递归
        //5.1 将现在归位的基准数左边的序列（看作新的一组，开始找该组的基准数，让基准数归位）按照刚刚的规则
        //startIndex~start-1(左边)
        quickSort(arr,startIndex,start-1);
        //5.2 将现在归位的基准数右边的序列（看作新的一组，开始找该组的基准数，让基准数归位）按照刚刚的规则
        //start+1~endIndex(右边)
        quickSort(arr,start+1,endIndex);


    }


}
