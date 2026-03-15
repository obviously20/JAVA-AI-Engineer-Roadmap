package com.obviously20.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameTest1 extends JFrame implements ActionListener {
    //TODO 游戏界面，所有与游戏相关的元素都在这个界面上

    JButton jb1 = new JButton("同意");
    JButton jb2 = new JButton("拒绝");

    //构造方法，初始化游戏界面窗口（大小（长宽）、可见性）
    public JFrameTest1() {
        //初始化窗口
        initWindows();

        //设置窗口可见性
        this.setVisible(true);
    }


    //TODO ctrl+Alt+L 格式化代码 、 ctrl+Alt+m 提取方法(像下面那样)

    //初始化窗口
    private void initWindows() {
        //设置长宽
        this.setSize(603, 680);

        //设置标题
        this.setTitle("拼图小游戏");

        //设置居中
        this.setLocationRelativeTo(null);

        //设置顶置，点其他的界面不会被顶下来
        this.setAlwaysOnTop(true);

        //设置关闭操作(因为等下会对3个界面设置跳转操作，导致3个界面不会同时出现-一个出现其余两个会隐藏，所以这里设置一个退出就会退出整个程序关闭虚拟机)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        //TODO：ActionListener接口：用于处理组件事件（按钮点击、空格）
        //法1：匿名内部类
//        //设置按钮
//        JButton jb1 = new JButton("点我");
//        //设置按钮的位置（x,y）
//        jb1.setBounds(0,0,100,50);
//        //添加按钮的点击事件
//        jb1.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("点我按钮被点击了");
//            }
//        });
//        //将按钮添加到窗口中
//        this.getContentPane().add(jb1);

        //法2：实现ActionListener接口
        //设置同意按钮的位置（x,y）
        jb1.setBounds(0,0,100,50);
        jb1.addActionListener(this);

        //设置拒绝按钮的位置（x,y）
        jb2.setBounds(150,150,100,50);
        jb2.addActionListener(this);



        //将同意按钮添加到窗口中
        this.getContentPane().add(jb1);
        this.getContentPane().add(jb2);





        //窗口在创建时会自动创建内部隐藏容器，无特殊要求其默认将所有的都居中放置-->要取消默认设置使得所有的组件都可以手动设置位置（x,y）
        this.setLayout(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb1){
            System.out.println("太高兴了");
        }else if(e.getSource() == jb2){
            System.out.println("5555555555555555");
        }
    }

}
