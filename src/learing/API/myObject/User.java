package learing.API.myObject;

import java.util.StringJoiner;

//Cloneable接口：用于实现浅拷贝和深拷贝
//TODO 其中Cloneable接口中是没有任何的方法的，它只是一个标记接口
//TODO 有了实现Cloneable接口，该类的对象才能调用clone方法

public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;


    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " + dataToString() + "}";
    }

    public String dataToString(){
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + " ");
        }
        return sj.toString();
    }

//    //重写clone方法（浅拷贝）
//    @Override
//    public User clone() throws CloneNotSupportedException {
//        return (User) super.clone();
//    }

    //重写clone方法（深拷贝）
    @Override
    //CloneNotSupportedException：如果在clone方法中调用了super.clone()方法，但是该方法抛出了CloneNotSupportedException异常，
    // 那么当前方法也需要抛出CloneNotSupportedException异常
    public User clone() throws CloneNotSupportedException {
        //1.创建一个新的数组对象，把user1.data中的元素复制到新创建的数组中，把新创建的数组的地址值赋值给user2的user2.data
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        //2.调用super.clone()方法，把user1的属性值复制到user2的属性中
        User u = (User) super.clone();

        //3.把user2的user2.data指向新创建的数组对象
        u.data = newData;

        //4.返回user2
        return u;
    }

}
