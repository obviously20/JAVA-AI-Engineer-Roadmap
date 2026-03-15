package com.obviously20.ui;

import com.obviously20.domain.User;
import com.obviously20.tools.VerifyCode;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    //JFrame 是一个窗口的标准JavaBean类，他作为LoginJFame的父类，提供了窗口的基本功能
    //TODO 登录界面，所有与登录相关的元素都在这个界面上

    //用静态代码块准备一些初始的用户信息
    //创建一个集合存储正确的用户名和密码
    static ArrayList<User> list = new ArrayList<>();

    static {
        list.add(new User("zhangsan", "123"));
        list.add(new User("lisi", "1234"));
    }

    JButton loginJButton = new JButton();//登录按钮


    JTextField userNameJTextField = new JTextField();//用户名文本框
    JPasswordField passWordJPassword = new JPasswordField();//密码文本框
    JTextField verifyCodeJTextField = new JTextField();//验证码文本框
    JLabel stringVerifyCodeJLabel = new JLabel(VerifyCode.comeOutVeriftyCode());//验证码图片



    public LoginJFrame() {
        //初始化登录窗口
        initLoginJFrame();

        //创建登录界面的所有组件
        initLoginingComponents();


        //设置可见性
        this.setVisible(true);
    }

    private void initLoginingComponents() {
        //创建登录界面的所有组件

        //1、添加用户名图片
        JLabel userNameJLabel = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        userNameJLabel.setBounds(116, 135, 51, 19);
        this.getContentPane().add(userNameJLabel);

        //2、添加用户名文本框
        //JTextField 是一个文本框组件，用于用户输入文本（明文显示）
//        JTextField userNameJTextField = new JTextField();
        userNameJTextField.setBounds(195, 134, 200, 30);
        this.getContentPane().add(userNameJTextField);

        //3、添加密码图片
        JLabel passWordJLabel = new JLabel(new ImageIcon("image\\login\\密码.png"));
        passWordJLabel.setBounds(130, 195, 35, 18);
        this.getContentPane().add(passWordJLabel);

        //4、添加密码文本框
//        JPasswordField passWordJPassword = new JPasswordField();
        passWordJPassword.setBounds(195, 195, 200, 30);
        this.getContentPane().add(passWordJPassword);

        //5、添加验证码图片
        JLabel verifyCodeJLabel = new JLabel(new ImageIcon("image\\login\\验证码.png"));
        verifyCodeJLabel.setBounds(116, 255, 51, 19);
        this.getContentPane().add(verifyCodeJLabel);

        //6、添加验证码文本框+随机验证码
//        JTextField verifyCodeJTextField = new JTextField();
        verifyCodeJTextField.setBounds(195, 255, 100, 30);
        this.getContentPane().add(verifyCodeJTextField);
        //添加随机验证码
//        JLabel stringVerifyCodeJLabel = new JLabel(VerifyCode.comeOutVeriftyCode());
        stringVerifyCodeJLabel.setBounds(310, 255, 100, 30);
        //添加验证码标签的鼠标监听事件-->点击验证码标签，生成新的验证码
        stringVerifyCodeJLabel.addMouseListener(this);
        this.getContentPane().add(stringVerifyCodeJLabel);

        //7、添加登录按钮
//        JButton loginJButton = new JButton();
        //添加登录按钮的图标(背景色)
        loginJButton.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        loginJButton.setBounds(130, 300, 125, 46);
        //取消登录按钮的边框
        loginJButton.setBorderPainted(false);
        //取消登录按钮的焦点边框
//        loginJButton.setFocusPainted(false);
        //取消登录按钮的内容区域填充(背景色)
        loginJButton.setContentAreaFilled(false);
        //添加登录按钮的鼠标监听事件
        loginJButton.addMouseListener(this);
        this.getContentPane().add(loginJButton);

        //8、添加注册按钮
        JButton registerJButton = new JButton();
        registerJButton.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        registerJButton.setBounds(270, 300, 128, 47);
        //取消注册按钮的边框
        registerJButton.setBorderPainted(false);
        //取消注册按钮的焦点边框
        registerJButton.setContentAreaFilled(false);
        this.getContentPane().add(registerJButton);

        //9、添加背景图片
        JLabel backgroundJLabel = new JLabel(new ImageIcon("image\\login\\background.png"));
        backgroundJLabel.setBounds(0, 0, 470, 390);
        this.getContentPane().add(backgroundJLabel);


    }

    private void initLoginJFrame() {
        //设置长宽
        this.setSize(488, 430);
        //设置标题
        this.setTitle("拼图游戏v1.0 登录界面");
        //设置居中
        this.setLocationRelativeTo(null);
        //设置顶置，点其他的界面不会被顶下来
        this.setAlwaysOnTop(true);
        //设置关闭操作(因为等下会对3个界面设置跳转操作，导致3个界面不会同时出现-一个出现其余两个会隐藏，所以这里设置一个退出就会退出整个程序关闭虚拟机)
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消内部布局
        this.setLayout(null);
    }

    //鼠标点击事件
    @Override
    public void mouseClicked(MouseEvent e) {
        //点击登录按钮
        if (e.getSource() == loginJButton) {
            //获取用户输入的用户名、密码和验证码
            String userName = userNameJTextField.getText();
            String password = String.valueOf(passWordJPassword.getPassword());
            String verifyCode = verifyCodeJTextField.getText();
            //先校验验证码是否正确
            if(!verifyCode.equalsIgnoreCase(stringVerifyCodeJLabel.getText())){
                //验证码错误
                JOptionPane.showMessageDialog(this,"验证码错误");
                //提示验证码错误，并清空验证码文本框，并生成新的验证码
                verifyCodeJTextField.setText("");
                //生成新的验证码,并添加到验证码标签中
                stringVerifyCodeJLabel.setText(VerifyCode.comeOutVeriftyCode());

                return;
            }
            //判断用户名和密码是否为空:细节如果没有输入用户名或密码，在代码中是一个空字符串，不是null
            if(userName.equals("") || password.equals("")){
                //JOptionPane是一个弹窗类，用于弹出提示框
                JOptionPane.showMessageDialog(this,"用户名或密码不能为空");
                return;
            }
            //校验用户名和密码是否正确
            //遍历用户列表，校验用户名和密码是否正确
            for (int i = 0; i < list.size(); i++) {
                User user = list.get(i);
                if(user.getUsername().equals(userName) && user.getPassword().equals(password)){
                    //核心：跳转游戏界面
                    //隐藏登录界面
                    this.setVisible(false);
                    //创建主界面对象
                    new GameJFrame();
                    //登录成功,退出函数，结束当前登录函数的执行-->防止登陆成功后还会继续执行其他代码
                    return;
                } else if (!user.getPassword().equals(password) && user.getUsername().equals(userName)) {
                    //密码错误
                    JOptionPane.showMessageDialog(this,"密码错误");
                    //清空密码文本框
                    passWordJPassword.setText("");
                    //清空验证码文本框
                    verifyCodeJTextField.setText("");
                    stringVerifyCodeJLabel.setText(VerifyCode.comeOutVeriftyCode());
                    return;
                }
            }
            //如果遍历完用户列表都没有找到匹配的用户名和密码，提示登录失败
            JOptionPane.showMessageDialog(this,"登录失败");
        }

        //点击验证码标签，生成新的验证码
        if(e.getSource() == stringVerifyCodeJLabel){
            stringVerifyCodeJLabel.setText(VerifyCode.comeOutVeriftyCode());
        }


    }

    //鼠标按下事件
    @Override
    public void mousePressed(MouseEvent e) {
        //按下不松，按钮变深
        if(e.getSource()==loginJButton){
            //设置登录按钮的图标(深颜色)
            loginJButton.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        }

    }

    //鼠标松开事件
    @Override
    public void mouseReleased(MouseEvent e) {
        //松开，按钮恢复正常
        if(e.getSource()==loginJButton){
            //设置登录按钮的图标(背景色)
            loginJButton.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
