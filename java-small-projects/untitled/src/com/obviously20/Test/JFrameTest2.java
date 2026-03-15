package com.obviously20.Test;

import javax.swing.*;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class JFrameTest2 extends JFrame implements KeyListener {
    //TODO 游戏界面，所有与游戏相关的元素都在这个界面上


    JButton jb1 = new JButton("测试按钮");


    //构造方法，初始化游戏界面窗口（大小（长宽）、可见性）
    public JFrameTest2() {
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


        //KeyListener接口：用于处理键盘事件（按键按下、按键松开、按键敲击）
//        //法1：匿名内部类
//        //设置按钮
//        JButton jb1 = new JButton("测试按钮");
//        //设置按钮的位置（x,y）
//        jb1.setBounds(0, 0, 100, 50);
//        jb1.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                System.out.println("按钮被按下了");
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                System.out.println("按钮被松开了");
//            }
//
//            @Override
//            public void keyTyped(KeyEvent e) {
//                System.out.println("按钮被敲击了");
//            }
//        });

        jb1.addKeyListener(this);
        jb1.setBounds(0, 0, 100, 50);


        //在窗口中添加按钮
        this.getContentPane().add(jb1);


        //窗口在创建时会自动创建内部隐藏容器，无特殊要求其默认将所有的都居中放置-->要取消默认设置使得所有的组件都可以手动设置位置（x,y）
        this.setLayout(null);
    }

    //KeyListener接口的方法
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按钮被按下了");
    }

    //细节：
    // 1. 每个键都有一个唯一的键码（keyCode），可以通过 e.getKeyCode() 方法获取--这么多按键整么进行区分
    //2. 一直按着一个键，会触发多个事件（按下、松开、敲击）重复执行
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode == 65){
            System.out.println("A键被松开了");

        }else if(keyCode == 66){
            System.out.println("B键被松开了");
        }
    }

    //没啥用
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("按钮被敲击了");
    }

}
