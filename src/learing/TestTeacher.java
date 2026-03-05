package learing;

public class TestTeacher {
    private String name;
    private String major;

    public TestTeacher() {
    }

    public TestTeacher(String name, String major) {
        this.name = name;
        this.major = major;
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
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return "TestTeacher{name = " + name + ", major = " + major + "}";
    }
}
