package learing.advancedSets.methodReference;
import java.util.function.Consumer;


/**
 * 本类（当前类）
 */
public class F22 {

    // 本类自己的方法
    public void myMethod() {
        System.out.println("我是本类的方法");
    }

    public void test() {
        // ====================== 关键：方法引用本类方法 ======================
        // 语法：this::本类方法名
        Runnable runnable = this::myMethod;

        // 执行
        runnable.run();
    }

    public static void main(String[] args) {
        new F22().test(); // 输出：我是本类的方法
    }
}
