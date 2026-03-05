package learing.mystatic;

import java.util.ArrayList;

public class Student2Util {
    private Student2Util() {
        // 私有构造方法，防止外部创建对象
    }

    public static int getMaxAge(ArrayList<Student2> students){
        int maxAge=students.get(0).getAge();
        for(int i=1;i<students.size();i++){
            int age=students.get(i).getAge();
            if(age>maxAge){
                maxAge=age;
            }
        }
        return maxAge;
    }
}
