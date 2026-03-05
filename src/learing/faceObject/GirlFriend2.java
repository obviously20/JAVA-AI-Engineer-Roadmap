package learing.faceObject;

public class GirlFriend2 {
    //女朋友的属性:姓名、年龄、性别、爱好a
    private String name;
    private int age;
    private String gander;
    private String hobby;


    public GirlFriend2() {
    }

    public GirlFriend2(String name, int age, String gander, String hobby) {
        this.name = name;
        this.age = age;
        this.gander = gander;
        this.hobby = hobby;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 获取
     * @return gander
     */
    public String getGander() {
        return gander;
    }

    /**
     * 设置
     * @param gander
     */
    public void setGander(String gander) {
        this.gander = gander;
    }

    /**
     * 获取
     * @return hobby
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置
     * @param hobby
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String toString() {
        return "GirlFriend2{name = " + name + ", age = " + age + ", gander = " + gander + ", hobby = " + hobby + "}";
    }
}
