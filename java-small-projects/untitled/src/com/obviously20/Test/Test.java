package com.obviously20.Test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        /*打乱一维数组中的数据
int[] tempArr = (0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
要求:打乱一维数组中的数据，并按照4个一组的方式添加到二维数组中。*/
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        //打乱一维数组
        for (int i = 0; i < tempArr.length; i++) {
            int randomIndex = random.nextInt(tempArr.length);//随机生成一个索引值（0~15）
            //交换tempArr[i]和tempArr[randomIndex]
            int temp = tempArr[i];
            tempArr[i] = tempArr[randomIndex];
            tempArr[randomIndex] = temp;
        }

        //将tempArr中的数据添加到imagearr中
        //fa1:
        int[][] imagearr = new int[4][4];
        for (int i = 0; i < imagearr.length; i++) {
            for (int j = 0; j < imagearr[i].length; j++) {
                //点睛：i*4+j 表示第i行第j列的元素在tempArr中的索引值
                imagearr[i][j] = tempArr[i * 4 + j];
            }
        }

        //fa2:
//        for (int i = 0; i < tempArr.length; i++) {
//            imagearr[i / 4][i % 4] = tempArr[i];
//        }

        //打印二维数组
        System.out.println("{");
        for (int i = 0; i < imagearr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < imagearr[i].length; j++) {
                System.out.print(imagearr[i][j] + " ");
            }
            System.out.println("},");
        }
        System.out.println("}");
    }
}
