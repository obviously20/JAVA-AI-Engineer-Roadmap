package learing.advancedSets.methodReference;
import java.util.function.Consumer;
/**
 * 父类
 */
class Father {
    // 父类的方法
    public void sayHello() {
        System.out.println("我是父类的方法");
    }
}

/**
 * 子类
 */
class Son extends Father {

    // 子类自己的方法
    public void test() {
        // ====================== 关键：方法引用父类方法 ======================
        // 语法：super::父类方法名
        Runnable runnable = super::sayHello;

        // 执行
        runnable.run();
    }

    public static void main(String[] args) {
        new Son().test(); // 输出：我是父类的方法
    }
}