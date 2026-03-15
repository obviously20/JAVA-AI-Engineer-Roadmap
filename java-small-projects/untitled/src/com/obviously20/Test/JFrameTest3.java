package com.obviously20.Test;

import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class JFrameTest3 extends JFrame implements MouseListener {
    //TODO 游戏界面，所有与游戏相关的元素都在这个界面上

    JButton jb1 = new JButton("cs");

    //构造方法，初始化游戏界面窗口（大小（长宽）、可见性）
    public JFrameTest3() {
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


        //MouseListener：鼠标监听事件
        jb1.setBounds(100, 100, 100, 100);
        jb1.addMouseListener(this);

        //将按钮添加到窗口中
        this.getContentPane().add(jb1);


        //窗口在创建时会自动创建内部隐藏容器，无特殊要求其默认将所有的都居中放置-->要取消默认设置使得所有的组件都可以手动设置位置（x,y）
        this.setLayout(null);


    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("鼠标单击，按下，释放");

    }

    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("鼠标按下");

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        System.out.println("鼠标释放");

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("鼠标进入");

    }

    @Override
    public void mouseExited(MouseEvent e) {

        System.out.println("鼠标退出");


    }
}
