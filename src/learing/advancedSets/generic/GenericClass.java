package learing.advancedSets.generic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericClass<T>  {
    Object[] objects = new Object[10];
    int size = 0;


    public boolean add(T e) {
        objects[size] = e;
        size++;
        return true;
    }

    //泛型方法:在方法返回值中使用泛型类型
    public T get(int index) {
        return (T) objects[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
