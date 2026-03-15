package com.obviously20.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //TODO 注册界面，所有与注册相关的元素都在这个界面上
    public RegisterJFrame(){
        //设置长宽
        this.setSize(488,500);
        this.setSize(603,680);
        //设置标题
        this.setTitle("游戏注册界面");
        //设置居中
        this.setLocationRelativeTo(null);
        //设置顶置，点其他的界面不会被顶下来
        this.setAlwaysOnTop(true);
        //设置关闭操作(因为等下会对3个界面设置跳转操作，导致3个界面不会同时出现-一个出现其余两个会隐藏，所以这里设置一个退出就会退出整个程序关闭虚拟机)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置可见性
        this.setVisible(true);
    }
}
