package learing.AbstractClassesAndInterfaces.MyInterfaces.demo1;

public interface Swim {
      /*注意1:接口和类的实现关系，可以单实现，也可以多实现。
      public class 类名 implements 接口名1,接口名2 {...}
      注意2:实现类还可以在继承一个类的同时实现多个接口。
      public class类名extends 父类implements接口名1，接口名2{...}*/

      public abstract void swim();
}
