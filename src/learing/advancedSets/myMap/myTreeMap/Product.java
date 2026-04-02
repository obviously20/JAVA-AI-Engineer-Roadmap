package learing.advancedSets.myMap.myTreeMap;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product> {
    private int id;
    private String name;


    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String toString() {
        return "Product{id = " + id + ", name = " + name + "}";
    }



    @Override
    public int compareTo(@NotNull Product o) {
        //按照id的升序排列
        return this.getId() - o.getId();
    }
}
