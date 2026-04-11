package learing.myIO.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class T10 {
    public static void main(String[] args) throws IOException {
        //随机点名器
        //TxT文件中事先准备好一些学生信息，每个学生的信息独占一行。
        // 要求1:每次被点到的学生，再次被点到的概率在原先的基础上降低一半举例:80个学生，点名5次，每次都点到小A，概率变化情况如下:第一次每人概率:1.25%。
        //第二次小A概率:0.625%。
        //第三次小A概率:0.3125%。
        //第四次小A概率:0.15625%。
        //第五次小A概率:0.078125%。
        //其他学生概率:1.2579%
        //其他学生概率:1.261867%其他学生概率:1.2638449%
        //其他学生概率:1.26483386%
        //提示:本题的核心就是带权重的随机

        //1.读取TxT文件中的学生信息
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/learing/myIO/tryland/T10.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] stu = line.split("-");
            list.add(new Student(stu[0], stu[1], Integer.parseInt(stu[2]), Double.parseDouble(stu[3])));
        }
        br.close();
//        System.out.println(list);

        //2.计算权重和
        double totalWeight = 0;
        for (Student student : list) {
            totalWeight += student.getWeight();
        }
//        System.out.println("权重和为:" + totalWeight);


        //3.计算每一个人的实际占比
        double[] ratioList = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ratioList[i] = list.get(i).getWeight() / totalWeight;
        }
//        System.out.println(Arrays.toString(ratioList));

        //4.划定每一个学生的随机数范围
        for (int i = 1; i < ratioList.length; i++) {
            ratioList[i] = ratioList[i-1]+ratioList[i];
        }
//        System.out.println(Arrays.toString(ratioList));

        //5.Math.random():生成一个随机数，范围是[0,1)
        double choose = Math.random();
        //二分查找随机数所属的学生
        int index = -Arrays.binarySearch(ratioList, choose)-1;//返回：-应插入的位置-1 = index//有：选中的学生= -index-1
//        System.out.println(choose);
//        System.out.println(index);
        Student chosen = list.get(index);
        System.out.println(chosen);
        chosen.setWeight(chosen.getWeight()/2);

        //6.更新权重和
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/learing/myIO/tryland/T10.txt"));
        for (Student stu : list) {
            bw.write(stu.toString() + "\n");
        }
        bw.close();



        //

    }
}
