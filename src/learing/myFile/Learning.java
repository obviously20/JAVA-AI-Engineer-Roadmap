package learing.myFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Learning {
    public static void main(String[] args) throws IOException {
        //1.File表示什么?
        //File对象表示路径，可以是文件、也可以是文件夹。
        //这个路径可以是存在的，也可以是不存在的

        //2.绝对路径和相对路径是什么意思?
        //绝对路径是带盘符的。
        //相对路径是不带盘符的，默认到当前项目下去找。

        //## 构造方法
        //- `public File(String pathname) ` ：通过将给定的**路径名字符串**转换为抽象路径名来创建新的 File实例。
        //- `public File(String parent, String child) ` ：从**父路径名字符串和子路径名字符串**创建新的 File实例。
        //- `public File(File parent, String child)` ：从**父抽象路径名和子路径名字符串**创建新的 File实例。

//        //eg: D:/JAVA_learning/Java-top-speed/src/learing/myFile/Learning.java
//
//        //1.通过路径名字符串创建 File 对象
//        String str ="D:/JAVA_learning/Java-top-speed/src/learing/myFile/Learning.java";
//        File file = new File(str);
//        System.out.println(file);
//
//        //2.通过父路径名字符串和子路径名字符串创建 File 对象(Java会自动拼接路径)
//        String father ="D:/JAVA_learning/Java-top-speed/src/learing/myFile";
//        String child ="Learning.java";
//        File file2 = new File(father, child);
//        System.out.println(file2);
//
//        //3.通过父抽象路径名和子路径名字符串创建 File 对象
//        File file3 = new File("D:/JAVA_learning/Java-top-speed/src/learing/myFile");
//        String child2 ="Learning.java";
//        File file4 = new File(file3, child2);
//        System.out.println(file4);

//        // 1. 创建文件对象（指向 D盘aaa目录下的a.txt文件）
//        File f1 = new File("D:\\aaa\\a.txt");
//        // 2. 判断是否是文件夹
//        System.out.println(f1.isDirectory()); // false
//        // 3. 判断是否是文件
//        System.out.println(f1.isFile());      // true
//        // 4. 判断路径是否存在
//        System.out.println(f1.exists());     // true
//        // 5. 获取文件名称（带后缀）
//        System.out.println(f1.getName());    // a.txt
//        // 6. 获取文件大小（字节）
//        System.out.println(f1.length());     // 12
//
//        System.out.println("-----------------------------");
//
//        // 1. 创建目录对象（指向 D盘aaa目录下的bbb文件夹）
//        File f2 = new File("D:\\aaa\\bbb");
//        // 2. 判断是否是文件夹
//        System.out.println(f2.isDirectory()); // true
//        // 3. 判断是否是文件
//        System.out.println(f2.isFile());      // false
//        // 4. 判断路径是否存在
//        System.out.println(f2.exists());     // true
//        // 5. 获取文件夹名称
//        System.out.println(f2.getName());    // bbb
//        // 6. 获取文件夹大小（文件夹length返回0）:length不能获取文件夹的大小，只能获取文件的大小
//        System.out.println(f2.length());     // 0
//
//        System.out.println("-----------------------------");
//
//        // 1. 创建不存在的文件对象
//        File f3 = new File("D:\\aaa\\c.txt");
//        // 2. 判断是否是文件夹
//        System.out.println(f3.isDirectory()); // false
//        // 3. 判断是否是文件
//        System.out.println(f3.isFile());      // false
//        // 4. 判断路径是否存在
//        System.out.println(f3.exists());     // false
//
//        System.out.println("-----------------------------");
//
//        // 获取路径：绝对路径
//        System.out.println(f1.getPath());
//        System.out.println(f1.getAbsolutePath());
//
//        System.out.println("-----------------------------");
//
//        // 获取文件最后修改时间（返回毫秒时间戳）
//        long time = f1.lastModified();
//        // 输出时间戳
//        System.out.println(time);
//        // 将时间戳转换为可读的日期格式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        // 格式化输出
//        System.out.println(sdf.format(new Date(time)));

        /*
public boolean createNewFile()    创建一个新的空的文件
public boolean mkdir()           创建单级文件夹
public boolean mkdirs()          创建多级文件夹
public boolean delete()          删除文件、空文件夹
*/
        //1.createNewFile 创建一个新的空的文件
        //细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        //      如果当前路径表示的文件是存在的，则创建失败，方法返回false
        //细节2：如果父级路径是不存在的，那么方法会有异常IOException
        //细节3：createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
//        File f1 = new File("D:\\aaa\\ddd");
//        boolean b = f1.createNewFile();
//        System.out.println(b);//true


//        //2.mkdir  make Directory，文件夹（目录）
//        //细节1：windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
//        //细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。
//        /* File f2 = new File("D:\\aaa\\aaa\\bbb\\ccc");
//        boolean b = f2.mkdir();
//        System.out.println(b);*/
//
//        //3.mkdirs  创建多级文件夹
//        //细节：既可以创建单级的，又可以创建多级的文件夹
//        File f3 = new File("D:\\aaa\\ggg");
//        boolean b = f3.mkdirs();
//        System.out.println(b);//true
//
//
//        /*
//        public boolean delete()          删除文件、空文件夹
//        细节：
//            如果删除的是文件，则直接删除，不走回收站。
//            如果删除的是空文件夹，则直接删除，不走回收站
//            如果删除的是有内容的文件夹，则删除失败
//        */
//
//        //1.创建File对象
//        File f1 = new File("D:\\aaa\\eee");
//        //2.删除
//        boolean b1 = f1.delete();
//        System.out.println(b1);

//        //## 目录的遍历
//        //
//        //- `public String[] list()` ：返回一个String数组，表示该File目录中的所有子文件或目录。
//        //- `public File[] listFiles()` ：返回一个File数组，表示该File目录中的所有的子文件或目录。
//
//        File dir = new File("d:\\java_code");
//
//        //获取当前目录下的文件以及文件夹的名称。
//        String[] names = dir.list();
//        for(String name : names){
//            System.out.println(name);
//        }
//        //常用方法：
//        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获取更多信息
//
//        //当调用者File表示的路径不存在时，返回null
//        //当调用者File表示的路径是文件时，返回null
//        //当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
//        //当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
//        //当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
//        //当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
//
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            System.out.println(file);
//        }

//        ///*
//        //public static File[] listRoots()        列出可用的文件系统根（如 Windows 的盘符、Linux 的根目录）
//        //public String[] list()                  获取当前该路径下所有内容的名称数组（字符串）
//        //public String[] list(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容的名称数组
//        //todo public File[] listFiles()               获取当前该路径下所有内容的File数组（推荐使用，携带更多文件信息）
//        //public File[] listFiles(FileFilter filter)   利用文件过滤器获取当前该路径下所有内容的File数组
//        //public File[] listFiles(FilenameFilter filter)利用文件名过滤器获取当前该路径下所有内容的File数组
//        //*/
//
//        //将指定路径下的内容提取（其中只提取。txt文件）
//        File dir = new File("d:\\java_code");
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            if (file.getName().endsWith(".txt") && file.isFile()) {
//                System.out.println(file);
//            }
//        }






    }
}