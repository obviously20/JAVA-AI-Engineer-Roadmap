package learing.InnerClass.practice.p1;

public class Test {
    public static void main(String[] args) {
        /*## 第一题：

        ### 需求：

        分析以下需求用代码实现:

        1. 定义形状类:

        功能：求面积，求周长

        2. 定义圆形类Round:

        属性：半径，圆周率

        功能：求面积，求周长

        3. 定义长方形类Rectangle:

        属性：长和宽

        功能：求面积，求周长

        4. 定义测试类:

   	    分别创建圆形和长方形对象，为相应的属性赋值

        分别调用求面积和求周长的方法*/

        Shape circle = new Circle(5);
        System.out.println("圆形的面积为：" + circle.getArea());
        System.out.println("圆形的周长为：" + circle.getPerimeter());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("长方形的面积为：" + rectangle.getArea());
        System.out.println("长方形的周长为：" + rectangle.getPerimeter());




    }
}
