package learing.API.search;

public class InterpolationSearch {
    public static void main(String[] args) {
        /*## 插值查找
        在介绍插值查找之前，先考虑一个问题：
        为什么二分查找算法一定要是折半，而不是折四分之一或者折更多呢？
        因为方便，简单，但是如果我能在二分查找的基础上，让中间的mid点，尽可能靠近想要查找的元素，那不就能提高查找的效率了吗？
        二分查找中查找点计算如下：

        　　mid=(low+high)/2, 即mid=low+1/2*(high-low);

        我们可以将查找的点改进为如下：

        　　mid=low+(key-a[low])/(a[high]-a[low])*(high-low)，

        这样，让mid值的变化更靠近关键字key，这样也就间接地减少了比较次数。
        **基本思想**：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找。
        **细节：
        **对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多。反之，数组中如果分布非常不均匀，那么插值查找未必是很合适的选择。
        代码跟二分查找类似，只要修改一下mid的计算方式即可。*/

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int target = 103;
        int index = interpolationSearch(arr, target);
        System.out.println(index);


    }

    public static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (target - arr[low]) / (arr[high] - arr[low]) * (high - low);
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
