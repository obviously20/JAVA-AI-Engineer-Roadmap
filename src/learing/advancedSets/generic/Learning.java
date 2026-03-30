package learing.advancedSets.generic;

import java.util.ArrayList;

public class Learning {
    public static void main(String[] args) {
        //结论:
        ////如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
        ////此时可以往集合添加任意的数据类型。
        ////带来一个坏处:我们在获取数据的时候，无法使用它子类的特有行为（例如:List的get方法，Map的get方法等）。-->非要用的时候只能强转
        ////此时推出了泛型，可以在添加数据的时候就把类型进行统一
        ////而且我们在获取数据的时候，也省的强转了，非常的方便。


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        java.util.Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
//            Integer i1 = list.get(i);
            System.out.println(i);
        }

        //扩展知识点:Java中的泛型是伪泛型：（门口加限定，后面既不需要修改原代码（因为如果修改源代码那jdk5以前的版本会报错的，用其写的项目也得写），又能够统一类型）
        ////因为Java中的泛型只是在编译时起作用（java文件），而在运行时，并不会存在泛型的类型信息。
        //即:在运行时，Java中的泛型会被擦除，只保留Object类型。

        /*泛型的细节
        泛型中不能写基本数据类型
        指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型
        如果不写泛型，类型默认是Object*/

        //泛型类
        GenericClass<Integer> genericClass = new GenericClass<>();
        genericClass.add(1);
        genericClass.add(2);
        genericClass.add(3);
        System.out.println(genericClass.toString());
        System.out.println(genericClass.get(0));

        //泛型方法


        //泛型接口
        //如何使用泛型接口
        //1.实现泛型接口-->Test1
        //2.实现类延续泛型，创建对象时再指定泛型类型-->Test2

        //todo 泛型的继承和通配符
        //  泛型不具备继承性，但是数据具备继承性
        //  泛型的通配符:?
        //  ? extend E：表示E及其子类
        //  ? super E：表示E及其父类

        //todo 使用场景
        //  定义类、方法、接口的时候，如果类型不确定，就可以定义泛型
        //  如果类型不确定，但是能知道是哪个继承体系中的，可以使用泛型的通配符








    }
}
