package learing.advancedSets.Set.Homework;

import org.jetbrains.annotations.NotNull;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;
    private int ChineseScore;
    private int MathScore;
    private int EnglishScore;

    public Student1() {
    }

    public Student1(String name, int age, int ChineseScore, int MathScore, int EnglishScore) {
        this.name = name;
        this.age = age;
        this.ChineseScore = ChineseScore;
        this.MathScore = MathScore;
        this.EnglishScore = EnglishScore;
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
     * @return ChineseScore
     */
    public int getChineseScore() {
        return ChineseScore;
    }

    /**
     * 设置
     * @param ChineseScore
     */
    public void setChineseScore(int ChineseScore) {
        this.ChineseScore = ChineseScore;
    }

    /**
     * 获取
     * @return MathScore
     */
    public int getMathScore() {
        return MathScore;
    }

    /**
     * 设置
     * @param MathScore
     */
    public void setMathScore(int MathScore) {
        this.MathScore = MathScore;
    }

    /**
     * 获取
     * @return EnglishScore
     */
    public int getEnglishScore() {
        return EnglishScore;
    }

    /**
     * 设置
     * @param EnglishScore
     */
    public void setEnglishScore(int EnglishScore) {
        this.EnglishScore = EnglishScore;
    }

    public String toString() {
        return "Student1{name = " + name + ", age = " + age + ", ChineseScore = " + ChineseScore + ", MathScore = " + MathScore + ", EnglishScore = " + EnglishScore + "}";
    }


    @Override
    public int compareTo(@NotNull Student1 o) {
        int sum1 = this.getChineseScore()+this.getMathScore()+this.getEnglishScore();
        int sum2 = o.getChineseScore()+o.getMathScore()+o.getEnglishScore();
        // 先按总成绩排序
        int i = sum1-sum2;
        // 如果总成绩相同，按语文成绩排序
        i=i==0?this.getChineseScore()-o.getChineseScore():i;
        // 如果语文成绩相同，按数学成绩排序
        i=i==0?this.getMathScore()-o.getMathScore():i;
        // 如果数学成绩相同，按年龄排序
        i=i==0?this.getAge()-o.getAge():i;
        // 如果年龄相同，按姓名排序
        i=i==0?this.getName().compareTo(o.getName()):i;
        // 如果姓名相同，按默认排序
        return i;
    }
}
