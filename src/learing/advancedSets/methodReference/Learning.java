package learing.advancedSets.methodReference;

import java.util.Arrays;
import java.util.Comparator;

public class Learning {
    public static void main(String[] args) {
        //### 体验方法引用【理解】
        //
        //- 方法引用的出现原因
        //
        //  在使用Lambda表达式的时候，我们实际上传递进去的代码就是一种解决方案：拿参数做操作
        //
        //  那么考虑一种情况：如果我们在Lambda中所指定的操作方案，已经有地方存在相同方案，那是否还有必要再写重复逻辑呢？答案肯定是没有必要
        //
        //  那我们又是如何使用已经存在的方案的呢？
        //
        //  这就是我们要讲解的方法引用，我们是通过方法引用来使用已经存在的方案

        // 1. 初始化待排序数组（注意：必须使用包装类Integer，因为Comparator针对对象比较）
        Integer[] arr = {3, 5, 4, 1, 6, 2};

        // ---------------------- 方式1：匿名内部类实现 Comparator 接口 ----------------------
        // Arrays.sort 第二个参数需要 Comparator 函数式接口，重写 compare 方法实现降序逻辑
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 降序核心逻辑：o2 - o1（若o2>o1，返回正数，交换位置）
                return o2 - o1;
            }
        });
        // 打印排序结果（排序后：[6, 5, 4, 3, 2, 1]）
        System.out.println("匿名内部类排序结果：" + Arrays.toString(arr));

        // 重新初始化数组，用于后续Lambda演示（避免数组已排序影响后续演示）
        arr = new Integer[]{3, 5, 4, 1, 6, 2};

        // ---------------------- 方式2：Lambda表达式（完整格式） ----------------------
        // 原理：Comparator 是函数式接口（仅含一个抽象方法 compare），可用Lambda简化匿名内部类
        /*
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            // Lambda 体：重写 compare 方法的降序逻辑
            return o2 - o1;
        });
        */

        // 重新初始化数组，用于简化Lambda演示
        arr = new Integer[]{3, 5, 4, 1, 6, 2};

        // ---------------------- 方式3：Lambda表达式（简化格式） ----------------------
        // 简化规则：1. 参数类型可省略；2. 单条语句可省略大括号和return
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        // 打印排序结果
        System.out.println("Lambda简化格式排序结果：" + Arrays.toString(arr));

        // 重新初始化数组，用于方法引用演示
        arr = new Integer[]{3, 5, 4, 1, 6, 2};

        // ---------------------- 方式4：方法引用 ----------------------
        // 方法引用核心规则（必须满足）：
        // 1. 引用处必须是函数式接口（此处Comparator是函数式接口）
        // 2. 被引用的方法必须已存在（本类的subtraction静态方法）
        // 3. 被引用方法的形参/返回值 需与抽象方法 compare 形参/返回值一致
        // 4. 被引用方法的功能需匹配当前需求（降序）
        // 语法：类名::方法名 （静态方法） / 对象::方法名（实例方法）
        Arrays.sort(arr, Learning::subtraction);

        // 打印最终排序结果
        System.out.println("方法引用排序结果：" + Arrays.toString(arr));
    }

    /**
     * 自定义减法方法（用于方法引用）
     * 形参：两个Integer类型参数（与Comparator compare方法形参一致）
     * 返回值：int类型（与Comparator compare方法返回值一致）
     * 功能：num2 - num1 （实现降序逻辑，与Lambda逻辑一致）
     */
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
