package com.obviously20.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener , ActionListener {
    //TODO 游戏界面，所有与游戏相关的元素都在这个界面上

    //随机数对象
    Random random = new Random();

    //统计步数
    int step = 0;

    //记录空快的位置
    int x = 0;
    int y = 0;

    //记录路径
    String path = "image\\girl\\girl8\\";

    //TODO 图片数组，用于存储图片数据--初始化数据和初始化图片和加载图片时使用
    //成员变量
    int[][] imagearr = new int[4][4];

    //TODO 胜利数组，用于存储胜利的图片数据--判断游戏是否胜利时使用
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //创建菜单的条目
    //更换图片的条目
    JMenuItem girlItem = new JMenuItem("美女");
    JMenuItem animalItem = new JMenuItem("动物");
    JMenuItem sportItem = new JMenuItem("运动");
    //功能菜单的条目
    JMenuItem againItem = new JMenuItem("重新开始");
    JMenuItem loginAgainItem = new JMenuItem("重新登录");
    JMenuItem exitItem = new JMenuItem("关闭游戏");
    //关于我们菜单的条目
    JMenuItem contactItem = new JMenuItem("联系我们");

    //TODO 构造方法，初始化游戏界面窗口
    public GameJFrame() {
        //初始化窗口
        initWindows();

        //初始化菜单
        initMenu();

        //初始化数据（打乱图片数据）
        initData();

        //初始化图片（根据数据打乱图片）
        initImage();

        //设置窗口可见性
        this.setVisible(true);

//        System.out.println("空快的位置：" + x + "," + y);
    }

    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

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

        for (int i = 0; i < imagearr.length; i++) {
            for (int j = 0; j < imagearr[i].length; j++) {
                //获取空快的位置
                if (tempArr[i * 4 + j] == 0) {
                    x = i;//记录空快的行号
                    y = j;//记录空快的列号
                }
                //点睛：i*4+j 表示第i行第j列的元素在tempArr中的索引值
                imagearr[i][j] = tempArr[i * 4 + j];
            }
        }

        //fa2:
//        for (int i = 0; i < tempArr.length; i++) {
//            imagearr[i / 4][i % 4] = tempArr[i];
//        }
    }

    //初始化图片
    private void initImage() {

        //1、清空窗口中原本已经出现的所有组件（图片、文字）
        this.getContentPane().removeAll();

        //判断游戏是否胜利，胜利就弹出提示
        if(isWin()){
            JLabel winLable = new JLabel(new ImageIcon("image\\win.png"));
            //设置JLabel对象的位置（x,y）
            winLable.setBounds(203,283,197,73);
            //将JLabel对象添加到窗口中
            this.getContentPane().add(winLable);
        }

        //添加步数标签
        JLabel stepLabel = new JLabel("步数：" + step);
        stepLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepLabel);

        //2、添加新的组件（图片、文字）
        for (int i = 0; i < imagearr.length; i++) {
            for (int j = 0; j < imagearr[i].length; j++) {
                int number = imagearr[i][j];
                //创建image对象
                ImageIcon imageIcon = new ImageIcon(path + number + ".jpg");

                //创建JLabel对象（管理容器，管理图片、文字）,并将图片设置到JLabel对象中
                JLabel imageLabel = new JLabel(imageIcon);

                //设置JLabel对象的位置（x,y）
                //105*j 表示第j列的x坐标（第0列x坐标为0，第1列x坐标为105，第2列x坐标为210，第3列x坐标为315）
                //105*i 表示第i行的y坐标（第0行y坐标为0，第1行y坐标为105，第2行y坐标为210，第3行y坐标为315）
                //1、83表示图片的x轴偏移量，134表示图片的y轴偏移量（因为图片的大小是105*105，而图片的位置是从(83,134)开始的）-->能使得图片居中显示
                imageLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //3、为图片设置边框
                //调用方法setBorder()为图片设置边框,参数BevelBorder对象（BevelBorder.LOWERED表示下凹边框）1，
                // -->也可以使用BevelBorder.RAISED表示上凹边框0
                imageLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));

                //将JLabel对象添加到窗口中
                //getContentPane()方法获取到窗口的内容面板（默认是null），并将JLabel对象添加到内容面板中
                this.getContentPane().add(imageLabel);
            }
        }

        //2、设置背景图片：（细节）在显示图片时，一般先加载的会显示在顶层，后加载的会显示在底层
        //4、文件路径分为两种：
        //1、绝对路径：从盘符开始的路径（如：D:\JAVA_learning\\untitled\image\background.png）
        //2、相对路径：（在当前项目的根目录下）从当前项目的根目录开始的路径（如：image\background.png），项目根目录为untitled，所以不用写项目根目录
        // -->推荐相对路径：在不同电脑下运行时，不需要修改路径（因为不同电脑的文件路径表示方式不同）
        //TODO 图片加载不出来就是路径问题（检查路径是否正确）
        ImageIcon bg = new ImageIcon("image\\background.png");
        //创建JLabel对象（管理容器，管理图片、文字）,并将图片设置到JLabel对象中
        JLabel backgroundLabel = new JLabel(bg);

        //设置JLabel对象的位置（x,y）
        backgroundLabel.setBounds(40, 40, 508, 560);

        //将JLabel对象添加到窗口中
        this.getContentPane().add(backgroundLabel);

        //3、刷新窗口（显示新添加的组件）
        this.getContentPane().repaint();
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

        //窗口在创建时会自动创建内部隐藏容器，无特殊要求其默认将所有的都居中放置-->要取消默认设置使得所有的组件都可以手动设置位置（x,y）
        this.setLayout(null);

        //添加键盘监听事件
        this.addKeyListener(this);
    }

    //初始化菜单
    private void initMenu() {
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单
        JMenu changeMenu = new JMenu("更换图片");
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");



        //将条目添加到菜单中
        //功能菜单
        //将更换图片添加到功能菜单中
        functionMenu.add(changeMenu);
        functionMenu.add(againItem);
        functionMenu.add(loginAgainItem);
        functionMenu.add(exitItem);
        //关于我们菜单
        aboutMenu.add(contactItem);
        //更换图片菜单
        changeMenu.add(girlItem);
        changeMenu.add(animalItem);
        changeMenu.add(sportItem);


        //添加事件监听
        againItem.addActionListener(this);
        loginAgainItem.addActionListener(this);
        exitItem.addActionListener(this);

        contactItem.addActionListener(this);

        girlItem.addActionListener(this);
        animalItem.addActionListener(this);
        sportItem.addActionListener(this);



        //将菜单添加到菜单对象中
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);
//        jMenuBar.add(changeMenu);

        //设置菜单对象到窗口中
        this.setJMenuBar(jMenuBar);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    ////TODO 2、keyPressed事件：当用户按下一个键时，会触发keyPressed事件（可以识别字符键和功能键）
    //      -->这个方法会在用户按下键时一直被调用（可以用来搞一个查看完整图片的快捷键功能）
    @Override
    public void keyPressed(KeyEvent e) {
        //快捷键a：查看完整图片
        //a键的键码为65
        if (e.getKeyCode() == 65) {
            //1、将先前所有组件都删除
            this.getContentPane().removeAll();

            //2、加载完整图片
            ImageIcon allImage = new ImageIcon(path + "all.jpg");
            //创建JLabel对象（管理容器，管理图片、文字）,并将图片设置到JLabel对象中
            JLabel allImageLabel = new JLabel(allImage);
            //设置JLabel对象的位置（x,y）
            allImageLabel.setBounds(83, 134, 402, 402);
            //将JLabel对象添加到窗口中
            this.getContentPane().add(allImageLabel);


            //3、设置背景
            ImageIcon bg = new ImageIcon("image\\background.png");
            //创建JLabel对象（管理容器，管理图片、文字）,并将图片设置到JLabel对象中
            JLabel backgroundLabel = new JLabel(bg);
            //设置JLabel对象的位置（x,y）
            backgroundLabel.setBounds(40, 40, 508, 560);
            //将JLabel对象添加到窗口中
            this.getContentPane().add(backgroundLabel);


            //4、刷新窗口（显示新添加的组件）
            this.getContentPane().repaint();
        }
    }

    //TODO 键盘事件：当用户按下或释放键盘上的键时，会触发键盘事件
    //1、keyTyped事件：当用户按下并释放一个键时，会触发keyTyped事件（只能识别字符键，不能识别功能键）

    //TODO 3、keyReleased事件：当用户释放一个键时，会触发keyReleased事件（可以识别字符键和功能键）-->这个方法会在用户释放键时被调用（所以写在里面）

    //TODO 核心逻辑：当用户释放方向键时，将空块的对应方向的图片移动到空块的位置
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利,如果胜利则直接返回,不会执行后续代码，就不会出bug
        if(isWin()){
            return;
        }


        //获取用户释放的键的键码
//        int cord = e.getKeyCode();
//        System.out.println(cord);
        //得到上方向键的键码：38，下方向键的键码：40，左方向键的键码：37，右方向键的键码：39
        //判断用户是否释放了上方向键
        if (e.getKeyCode() == 38) {
            System.out.println("上键");
            //核心逻辑：当用户释放上方向键时，将空块的下面一张图片上移
            //已知空块坐标[x,y];空块下面的图片坐标[x+1,y]

            //bug:判断是否越界（数组访问越界）,不能拉边界外没有的图片
            if (x == 3) {
                return;
            }

            //交换空块和下面的图片
            imagearr[x][y] = imagearr[x + 1][y];
            imagearr[x + 1][y] = 0;

            //更新空块的坐标
            x++;
            //更新步数
            step++;

            //更新图片
            initImage();

        } else if (e.getKeyCode() == 40) {
            System.out.println("下键");
            //核心逻辑：当用户释放下方向键时，将空块的上面一张图片下移
            //已知空块坐标[x,y];空块上面的图片坐标[x-1,y]

            //bug:判断是否越界（数组访问越界）,不能拉边界外没有的图片
            if (x == 0) {
                return;
            }

            //交换空块和下面的图片
            imagearr[x][y] = imagearr[x - 1][y];
            imagearr[x - 1][y] = 0;

            //更新空块的坐标
            x--;

            //更新步数
            step++;

            //更新图片
            initImage();
        } else if (e.getKeyCode() == 37) {
            System.out.println("左键");
            //核心逻辑：当用户释放左方向键时，将空块的右边一张图片左移
            //已知空块坐标[x,y];空块右边的图片坐标[x,y+1]

            //bug:判断是否越界（数组访问越界）,不能拉边界外没有的图片
            if (y == 3) {
                return;
            }

            //交换空块和下面的图片
            imagearr[x][y] = imagearr[x][y + 1];
            imagearr[x][y + 1] = 0;

            //更新空块的坐标
            y++;
            //更新步数
            step++;

            //更新图片
            initImage();

        } else if (e.getKeyCode() == 39) {
            System.out.println("右键");
            //核心逻辑：当用户释放右方向键时，将空块的左边一张图片右移
            //已知空块坐标[x,y];空块左边的图片坐标[x,y-1]

            //bug:判断是否越界（数组访问越界）,不能拉边界外没有的图片
            if (y == 0) {
                return;
            }

            //交换空块和下面的图片
            imagearr[x][y] = imagearr[x][y - 1];
            imagearr[x][y - 1] = 0;

            //更新空块的坐标
            y--;
            //更新步数
            step++;

            //更新图片
            initImage();
        } else if (e.getKeyCode() == 65) {
            initImage();
        } else if (e.getKeyCode() == 87) {
            //游戏直接通关
            imagearr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            //更新图片
            initImage();
        }


    }

    public boolean isWin(){
        //判断游戏是否胜利
        for (int i = 0; i < imagearr.length; i++) {
            for (int j = 0; j < imagearr[i].length; j++) {
                if(imagearr[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == againItem){
            //重新开始游戏
            System.out.println("重新开始游戏");
            //重置步数
            step = 0;
            //重新打乱数组
            initData();
            //更新图片
            initImage();
        } else if (e.getSource() == loginAgainItem) {
            //重新登录游戏
            System.out.println("重新登录游戏");
            //隐藏当前窗口
            this.setVisible(false);
            //创建登录界面对象
            new LoginJFrame();
        }else if(e.getSource() == exitItem){
            //关闭游戏
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        } else if (e.getSource() == contactItem) {
            //联系我们
            System.out.println("联系我们");
            //创建弹窗对象
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            //设置弹窗大小
            jDialog.setSize(258,258);
            //设置弹窗居中
            jDialog.setLocationRelativeTo(null);
            //设置弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //不关闭弹窗，就不能点击其他地方
            jDialog.setModal(true);
            //设置弹窗可见性
            jDialog.setVisible(true);
        } else if (e.getSource() == girlItem) {
            //随机更换女孩图片
            //1、改girl的随机路径
            int randomIndex = random.nextInt(13)+1;//girl有13张图片：0~12->1~13
            path = "image\\girl\\girl"+randomIndex+"\\";
            //重置步数
            step = 0;
            //2、打乱数组
            initData();
            //3、更新图片
            initImage();
        } else if (e.getSource() == animalItem) {
            int randomIndex = random.nextInt(8)+1;
            path = "image\\animal\\animal"+randomIndex+"\\";
            //重置步数
            step = 0;
            //2、打乱数组
            initData();
            //3、更新图片
            initImage();
        }else if(e.getSource() == sportItem){
            int randomIndex = random.nextInt(10)+1;
            path = "image\\sport\\sport"+randomIndex+"\\";
            //重置步数
            step = 0;
            //2、打乱数组
            initData();
            //3、更新图片
            initImage();
        }
    }
}
