package learing;

import java.util.Random;

public class Method {
    public static void main(String[] args) {
//        //调用方法
//        sayHello();
//        double result=add(30,40);
//        System.out.println(result);
//
//        double result1=perimeter(30,40);
//        System.out.println(result1);
//
//        double result2=area(2);
//        System.out.println(result2);
//
//        double area1=compareArea(2.5,4.4);
//        double area2=compareArea(3.3,5.5);
//        if(area1>area2){
//            System.out.println("第一个长方形的面积更大");
//        }else{
//            System.out.println("第二个长方形的面积更大");
//        }

//        int[] arr={11,22,33,44,55};
//        printfArray(arr);
//
//        System.out.printf("\n数组的最大值是:");
//        int max=getMax(arr);
//        System.out.println(max);
//
//        System.out.printf("\n判断数组是否存在:");
//        boolean exist=isExist(arr,50);
//        System.out.println(exist);
//
//        System.out.printf("\n复制数组:");
//        // 其中from表示开始的索引，to表示结束的索引(不包含to)
//        int[] newArr=copyOfRange(arr,0,3);
//        printfArray(newArr);

        /*zy*/
        double min=getMin(3.14,3.12);
        System.out.println(min);

        int maxInt=getMaxInt(10,20,30);
        System.out.println(maxInt);

        print(10,20,30);

        System.out.println(getAbs(-3.14));

        System.out.println(getDigit(1234));
        System.out.println(getDigit(34567));

        int[] arr1={11,22,33,44,55};
        int[] arr2={11,22,33,44,56};
        System.out.println(equals(arr1,arr2));

        fill(arr1,100);
        printfArray(arr1);

        fill(arr1,1,3,105);
        printfArray(arr1);

        int[] newArr=copyOf(arr1,3);
        printfArray(newArr);

        int[] arr={2,588,888,1000,10000};
//        takeOut(arr);
        takeOut1(arr);



    }
    //方法的定义
     public static void sayHello(){
        System.out.println("Hello World!");

    }
    /*人肉计算器
    需求:定义一个方法，在方法内部定义两个变量。
    求出他们的和并进行打印。*/
    public static double add(double a,double b){
        double sum=a+b;
        return sum;
    }

    /*人肉计算机1
    需求:定义一个方法，求长方形的周长*/
    public static double perimeter(double a,double b){
        return 2*(a+b);
    }

    /*人肉计算机2
    需求:定义一个方法，求圆的面积*/
    public static double area(double r){
        return Math.PI*r*r;
    }

    /*比较大小
    需求:定义方法，比较两个长方形的面积*/
    public static double compareArea(double len,double width){
       return len*width;
    }

    /*TODO:方法重载
       1.方法名相同
       2.参数列表不同(参数的类型不同，参数的个数不同，参数的顺序不同)
       3.在同一个类中*/

    // 顺序不同的重载
    public static boolean compareArea(int a,double b){
        if (a>b){
            return true;
        }else{
            return false;
        }
    }
    public static boolean compareArea(double a,int b){
        if (a>b){
            return true;
        }else{
            return false;
        }
    }


    /*需求:使用方法重载的思想，设计比较两个整数是否相同的方法。兼容全整数类型(byte,short,int,long)要求:
    */
    public static boolean compareNomber(byte a,byte b){
        return a==b;
    }
    public static boolean compareNomber(short a,short b){
        return a==b;
    }
    public static boolean compareNomber(int a,int b){
        return a==b;
    }
    public static boolean compareNomber(long a,long b){
        return a==b;
    }

    /*练习*/
    /*数组遍历
     需求:设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如:[11,22,33,44,55]*/
    public static void printfArray(int[] arr){
        System.out.printf("[");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d",arr[i]);
            if(i<arr.length-1){
                System.out.printf(",");
            }
        }
        System.out.println("]");
    }

    /*数组最大值
      需求:设计一个方法求数组的最大值，并将最大值返回*/
    public static int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }



    /*判断是否存在
    定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处*/
    public static boolean isExist(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }



    /*复制数组
    需求:
    定义一个方法copyOfRange(int[] arr,int from, int to)
    功能:
    将数组arr中从索引from(包含from)开始。到索引to结束(不包含to)的元素复制到新数组中将新数组返回。*/
    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newArr= new int[to-from];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=arr[i+from];
        }
        return newArr;
    }
//    public static int[] copyOfRange(int[] arr,int from, int to){
//        int[] newArr= new int[to-from];
//        //伪造索引思想
//        int index=0;
//        for (int i = from; i < to; i++) {
//            newArr[index]=arr[i];
//            index++;
//        }
//        return newArr;
//    }

    /*作业*/
    /*定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。*/
    public static double getMin(double a,double b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }

    /*定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。*/
    public static int getMaxInt(int a,int b,int c){
        int max=(a>b?a:b);
        max=(max>c?max:c);
        return max;
    }

    /*在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：请输入第一个整数：10
    请输入第二个整数：30
    请输入第三个整数：20
    从大到小的顺序是： 30 20 10 */
    public static int getMinInt(int a,int b,int c){
        int min=(a<b?a:b);
        min=(min<c?min:c);
        return min;
    }
    public static void print(int a,int b,int c){
        int max=getMaxInt(a,b,c);
        int min=getMinInt(a,b,c);
        System.out.printf("从大到小的顺序是： %d>%d>%d\n",max,(a+b+c-max-min),min);
    }

    /*数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试*/
    public static double getAbs(double e){
        return Math.abs(e);
    }

    /*键盘录入一个正整数

定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回

在main方法中打印该数字是几位数

演示格式如下:
(1)演示一:
	请输入一个整数:1234
	控制台输出:1234是4位数字
(2)演示二:
	请输入一个整数:34567
	控制台输出:34567是5位数字*/

public static int getDigit(int num){
      int count=0;
      while(num!=0){
          num=num/10;
          count++;
      }
      return count;
    }

    /*需求：

​	定义一个方法equals(int[] arr1,int[] arr2).

功能：

​	比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）*/
    public static boolean equals(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

    /*需求：

​	定义一个方法fill(int[] arr,int value)

功能：

​	将数组arr中的所有元素的值改为value*/
    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value;
        }
    }

    /*需求：

​	定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)

功能：

​	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value*/
    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        for(int i=fromIndex;i<toIndex;i++) {
            arr[i] = value;
        }
    }

    /*需求：

​	定义一个方法copyOf(int[] arr, int newLength)

功能：

​	将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始*/

    public static int[] copyOf(int[] arr, int newLength){
        int[] newArr= new int[newLength];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    /*需求：

​	定义一个方法copyOfRange(int[] arr,int from, int to)

功能：

​	将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，

​	并将新数组返回。*/
        //打过测试


    /*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
    请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
    888元的奖金被抽出
    588元的奖金被抽出
    10000元的奖金被抽出
    1000元的奖金被抽出
    2元的奖金被抽出*/
    public static void takeOut(int[] arr){
        Random r=new Random();
        boolean flag=true;
        int count=0;
        while(flag){
            int index=r.nextInt(arr.length);
            if(arr[index]!=0){
                System.out.println(arr[index]+"元的奖金被抽出");
                arr[index]=0;
                count++;
                if(count==arr.length){
                    flag=false;
                }
            }
        }
    }

    /*优化:先打乱，后遍历*/
    public static void takeOut1(int[] arr){
        Random r=new Random();
        int index=r.nextInt(arr.length);
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"元的奖金被抽出");
        }
    }





}
