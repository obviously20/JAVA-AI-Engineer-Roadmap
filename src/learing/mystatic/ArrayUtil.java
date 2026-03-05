package learing.mystatic;

public class ArrayUtil {
    // 数组工具类
    private ArrayUtil() {
        // 私有构造方法，防止外部实例化
    }

     //TODO：数组工具类的静态方法
    public static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //TODO: 数组工具类的静态方法
     public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
     }


}
