package learing;

public class DataStructure {
    public static void main(String[] args) {
        //TODO: 数组
        //TODO: 数组的定义
        //TODO: 数组的初始化（静态初始化）
//        //完整格式：数据类型[] 数组名 = new 数据类型[数组长度];
//        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
//        //简写
//        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//        String[] arr3 = {"aA","bB","cC","Dd","eE","Ff"};
//        double[] arr4 = {1.1,2.2,3.3,4.4,5.5,6.6};
//        //扩展:
//        //解释一下地址值的格式含义 [D@776ec8df
//        // [:表示当前是一个数组//D:表示当前数组里面的元素都是double类型的
//        // @:表示一个间隔符号。(固定格式)
//        // 776ec8df:才是数组真正的地址值，(十六进制)
//        // 平时我们习惯性的会把这个整体叫做数组的地址值:
//        System.out.println(arr4);

//        /*遍历数组并求和
//        定义一个数组存储1,2,3,4,5
//        遍历数组得到每一个元素，求数组里面所有的数据和*/
//        int[] arr={1,2,3,4,5};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            if(i==arr.length-1){
//                System.out.printf("%d",arr[i]);
//            }else{
//            System.out.printf("%d+",arr[i]);
//            }
//            sum+=arr[i];
//        }
//        System.out.printf("=%d",sum);

//        /*统计个数
//        存储12345678910
//        定义一个数组，遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%3==0){
//                count++;
//            }
//        }
//        System.out.println("数组里面一共有"+count+"个能被3整除的数字");

//        /*变化数据
//        定义一个数组，存储1,2,3,4,5,6,7,8,9,10遍历数组得到每一个元素。要求:
//        1，如果是奇数，则将当前数字扩大两倍
//        2，如果是偶数，则将当前数字变成二分之一*/
//        double[] arr={1,2,3,4,5,6,7,8,9,10};
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]%2==0){
//                arr[i]/=2;
//            }else{
//                arr[i]*=2;
//            }
//        }
//        //打印变换后的数组
//        for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//        }

//        //动态初始化数组
//        //完整格式：数据类型[] 数组名 = new 数据类型[数组长度];
//        //自己定义数组的长度
//        int[] arr = new int[10];
//        //简写
//        int[] arr2 = new int[10];
//        //默认初始化值
//        //int:0
//        //double:0.0
//        //char:\u0000 ,空格
//        //boolean:false
//        //引用数据类型：null


//      // 求最值
//      // 需求:已知数组元素为{33,5,22,44,55}
//      // 请找出数组中最大值并打印在控制台
//        //TODO： 擂台算法
//        int[] arr={33,5,22,44,55};
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("数组中的最大值为："+max);

//        /*遍历数组求和
//        需求:生成10个1~100之间的随机数存入数组
//        1)求出所有数据的和
//        2)求所有数据的平均数
//        3)统计有多少个数据比平均值小*/
//        int[] arr=new int[10];
//        int sum=0;
//        int count=0;
//        Random rand=new Random();
//        for(int i=0;i<arr.length;i++){
//            arr[i]=rand.nextInt(100-1+1)+1;
//        }
//        System.out.println("数组中的数据为：");
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("%d\t",arr[i]);
//            sum+=arr[i];
//        }
//        System.out.println();
//        double avg=sum/arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<avg){
//                count++;
//            }
//        }
//        System.out.println("数组中比平均值小的数字有"+count+"个");
//        System.out.println("数组的平均数为："+avg);
//        System.out.println("数组的和为："+sum);


//        /*交换数组中的数据
//        需求:定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。交换前:1,2,3,4,5交换后:5,2,3,4,1*/
//        int[] arr={1,2,3,4,5};
//        int left=0;
//        int right=arr.length-1;
//        System.out.println("交换前");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d\t",arr[i]);
//        }
//        System.out.println();
//        while(left<right){
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }
//        System.out.println("交换后");
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("%d\t",arr[i]);
//        }

//        //法2：
//        for(int i=0, j=arr.length-1;i<j;i++,j--){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }


//        //TODO: 随机打乱数组
//        //需求:定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
//        int[] arr={1,2,3,4,5};
//        System.out.println("打乱前");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d\t",arr[i]);
//        }
//        System.out.println();
//        Random r=new Random();
//        for(int i=0;i<arr.length;i++){
//            int j=r.nextInt(arr.length);
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        }
//        System.out.println("打乱后");
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("%d\t",arr[i]);
//        }

//        //TODO；二维数组
//        //二维数组的静态初始化
//        //完整格式：数据类型[][] 数组名 = new 数据类型[数组长度][数组长度];
//        //自己定义数组的长度
//        int[][] arr1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        //简写
//        int[][] arr2={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        // 建议写成这样，提高代码的可读性
//        int[][] arr3={
//            {1,2,3,4},
//            {5,6,7,8},
//            {9,10,11,12}
//        };
//        // 查询二维数组中的元素
//        System.out.println(arr3[1][2]); // 输出7
//        System.out.println(arr3[0][2]); //3
//
//        // 遍历二维数组
//        //arr3[i][j])
//        // i表示先遍历行，外循环先遍历二维数组内的一维数组
//        for(int i=0;i<arr3.length;i++){
//            // j表示遍历列，内循环遍历一维数组内的元素
//            for(int j=0;j<arr3.length;j++){
//                System.out.print(arr3[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        // 二维数组的动态初始化
//        int[][] arr4=new int[3][4];
//        // 给二维数组赋值
//        arr4[2][0]=100;
//        for(int i=0;i< arr4.length;i++){
//            for(int j=0;j< arr4.length;j++){
//                System.out.printf("%d\t",arr4[i][j]);
//            }
//            System.out.println();
//        }

        /*二维数组的练习
        某商城每个季度的营业额如下:单位(万元)第一季度:22,66,44
        第二季度:77,33,88
        第三季度:25,45,65
        第四季度:11,66,99
        要求计算出每个季度的总营业额和全年的总营业额*/
        double monthTurnover=0;
        double yearTurnover=0;
        int[][] turnover={
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        for(int i=0;i<turnover.length;i++){
            // TODO：这里i=4;j=3,所以不能用turnover.length,而要用turnover[i].length
            for(int j=0;j<turnover[i].length;j++){
                // 算一个季度的营业额
                monthTurnover+=turnover[i][j];
            }
            yearTurnover+=monthTurnover;
            System.out.printf("第%d季度的营业额为:%.2f万元\n",i+1,monthTurnover);
            monthTurnover=0;
        }
        System.out.printf("全年的营业额为:%.2f万元\n",yearTurnover);





    }
}
