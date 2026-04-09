package learing.myIO.myobjectstream;

import java.io.*;

public class Learning {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //需求:
        //利用序列化流/对象操作输出流，把一个对象写到本地文件中
        //构造方法:
        //public ObjectoutputStream(OutputStream out)
        //把基本流变成高级流
        //成员方法:
        //public final void writeObject(Object obj)
        //把对象序列化(写出)到文件中去


//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\learing\\myIO\\tryland\\objectstream\\Student.txt"));
//        oos.writeObject(new Student("张三",18));
//        oos.close();



        //需求:
        //利用反序列化流/对象操作输入流，把文件中中的对象读到程序当中
        //构造方法:
        //public ObjectInputStream(InputStream out)
        //把基本流变成高级流
        //成员方法:
        //public Object readobject()
        //把序列化到本地文件中的对象，读取到程序中来


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\learing\\myIO\\tryland\\objectstream\\Student.txt"));
        //还是object类型，需要强制类型转换
        Student student = (Student) ois.readObject();
        System.out.println(student);
        ois.close();


        //序列化流/反序列化流的细节汇总

        //使用序列化流将对象写到文件时，需要让Javabean类实现Serializable接口。
        //否则,会出现NotSerializableException异常

        //序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了
        //会出问题，会抛出InvalidclassException异常

        //序列化对象后，修改了Javabean类，再次反序列化，会不会有问题?
        //解决方案:给avabean类添加serialVersionUID(序列号、版本号)

        //如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢?
        //解决方案:给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程






    }
}
