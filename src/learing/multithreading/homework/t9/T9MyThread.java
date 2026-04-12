package learing.multithreading.homework.t9;

import java.util.Random;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class T9MyThread extends Thread {
    //定义一个红包
    static double redPacket = 100;

    //定义个数
    static int count = 3;

    //定义一个最小金额0.01
    static final double MIN = 0.01;

    @Override
    public void run() {
        //因为一个人只能抢一次，所以不需要循环
        synchronized (T9MyThread.class){

            //判断红包个数
            if(count==0){
                System.out.println("红包已抢完");
                return;
            }else {
                double price = 0;
                //判断是否是最后一个红包
                if(count==1){
                    price = redPacket;
                }else {
                    //随机金额
                    Random random = new Random();
                    //最大99.98 最小0.01
                    double range = redPacket - (count-1) * MIN;
                    price = random.nextDouble(range);
                    //判断随机金额是否小于最小金额
                    if(price<MIN){
                        price = MIN;
                    }

                }
                //更新红包金额
                redPacket -= price;
                //更新红包个数
                count--;
                //打印结果
                System.out.println(getName()+"抢到了"+price+"元");

            }
        }
    }

    /*//总金额
    static BigDecimal money = BigDecimal.valueOf(100.0);
    //个数
    static int count = 3;
    //最小抽奖金额
    static final BigDecimal MIN = BigDecimal.valueOf(0.01);

    @Override
    public void run() {
        synchronized (MyThread.class){
            if(count == 0){
                System.out.println(getName() + "没有抢到红包！");
            }else {
                //中奖金额
                BigDecimal prize;
                if(count == 1){
                    prize = money;
                }else {
                    //获取抽奖范围
                    double bounds = money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                    Random r = new Random();
                    //抽奖金额
                    prize = BigDecimal.valueOf(r.nextDouble(bounds));
                }
                //设置抽中红包，小数点保留两位，四舍五入
                prize = prize.setScale(2, RoundingMode.HALF_UP);
                //在总金额中去掉对应的钱
                money = money.subtract(prize);
                //红包少了一个
                count--;
                //输出红包信息
                System.out.println(getName() + "抽中了" + prize + "元");
            }
        }
    }*/















}

