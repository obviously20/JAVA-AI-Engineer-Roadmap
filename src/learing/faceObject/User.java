package learing.faceObject;

public class User {
    private String userName;
    private String password;
    private String email;
    private String gender;
    private int age;

    public User() {
    }

    public User(String userName, String password, String email, String gender, int age) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

//    public String toString() {
//        return "User{userName = " + userName + ", password = " + password + ", email = " + email + ", gender = " + gender + ", age = " + age + "}";
//    }

    //Alt+Insert(ins) 补全getter和setter方法



//    //TODO:构造方法
//    //无参构造方法
//    public User() {
//    }
//    //TODO:有参构造方法
//    public User(String userName, String password, String email, String gender, int age) {
//        this.userName = userName;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.age = age;
//    }
//
//    //TODO:成员方法
//    public String getUserName() {
//        return userName;
//    }
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }
//    public String getGender() {
//        return gender;
//    }
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }

    //TODO:快捷键
//    //Alt+Insert constructor +Ctrl+A->OK补全有参构造方法
//    public User(String userName, String password, String email, String gender, int age) {
//        this.userName = userName;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.age = age;
//    }

//    //Alt+Insert constructor ->select None->补全无参构造方法
//    public User() {
//    }


//    //Alt+Insert getter and setter ->Ctrl+A->补全所有getter和setter方法
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    //ptg 1秒生成setter方法和getter方法--鼠标右键选中ptg to javabean即可

}
