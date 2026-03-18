package learing.API.mySystem;

import learing.polymorphism.demo1.Person;

import java.util.Scanner;

public class SystemLearning {
    public static void main(String[] args) {
//        //public static final long currentTimeMillis()//获取当前对应时间的毫秒值（当前时间位0时区所对应的时间即就是英国格林拟治天文台旧址所在的位置：1970年1月1日0时0分0秒）
//        System.out.println(System.currentTimeMillis());
//        //具体应用：可以用来测试程序的效率
//        //eg:测试在一个范围内的素数有多少个
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数");
//        int a = sc.nextInt();
//        long start = System.currentTimeMillis();
//        for (int i = 0; i <= a; i++) {
////            test02(i);
//            test01(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("程序运行时间为："+(end-start)+"毫秒");



//        //public static void exit(int status)//退出虚拟机
//        System.exit(0);//0表示正常退出，非0表示异常退出

//        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)//数组拷贝
//        int[] src = {1,2,3,4,5,6,7,8,9,10};
//        int[] copy = new int[src.length];
////        System.arraycopy(src,0,copy,0,src.length);
//        //0 0 1 2 3 0 0 0 0 0
////        System.arraycopy(src,0,copy,2,3);
//        // 0 0 0 0 7 8 9 10 0 0
////        System.arraycopy(src,6,copy,4,4);
//        for (int i = 0; i < copy.length; i++) {
//            System.out.print(copy[i]+" ");
//        }
        //1.细节数组拷贝的时候，如果数组都是基础数据类型，那就要求数组的元素类型相同，如若不相同，就会报错
//        int[] arr = new int[10];
//        double[] arr2 = new double[10];
//        System.arraycopy(arr,0,arr2,0,arr.length);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i]+" ");
//        }

//        //2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
//        //eg:
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        int[] arr2 = new int[5];
////      System.arraycopy(arr,0,arr2,0,arr1.length);

//        3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",20);
        Student[] students = {stu1,stu2,stu3};
        Preson[] presons = new Preson[students.length];
        System.arraycopy(students,0,presons,0,students.length);
        for (int i = 0; i < presons.length; i++) {
            Preson person = presons[i];
            System.out.println(person.getName()+" "+person.getAge());
        }


    }

    public static void test01(int a){
        boolean isPrime = true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(a+"是素数");
        }else{
            System.out.println(a+"不是素数");
        }
    }

    public static void test02(int a){
        boolean isPrime = true;
        for(int i=2;i<Math.sqrt(a)+1;i++){
            if(a%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(a+"是素数");
        }else{
            System.out.println(a+"不是素数");
        }
    }
}
