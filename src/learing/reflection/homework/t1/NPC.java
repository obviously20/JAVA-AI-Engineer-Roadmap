package learing.reflection.homework.t1;

public class NPC {
    private String name;
    private int age;
    private String skill;
    private String job;//职业


    public NPC() {
    }

    public NPC(String name, int age, String skill, String job) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.job = job;
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
     * @return skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 设置
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * 获取
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return "NPC{name = " + name + ", age = " + age + ", skill = " + skill + ", job = " + job + "}";
    }
}
