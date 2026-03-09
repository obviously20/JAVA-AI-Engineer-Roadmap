package learing.AbstractClassesAndInterfaces.AbstractClasses;

public abstract class AbstractClasses {
    //TODO 为什么要用抽象类？不能直接在子类中写方法？----因为在开发项目的时候，为了代码规范，我们会定义一个抽象类，强制子类按照某种格式进行重写
    /*抽象类不能实例化--不能创建对象
    抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
    可以有构造方法
    抽象类的子类
        要么重写抽象类中的所有抽象方法
        要么是抽象类
    */

    private String name;
    private int age;

    public abstract void display();


    // 抽象类的构造方法作用：当创建子类对象时，给属性进行赋值
    public AbstractClasses() {
    }

    public AbstractClasses(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


/*abstract*/ class zi extends AbstractClasses {
    @Override
    public void display() {
        System.out.println("我是子类的display重写的方法");
    }
}
