package learing.API.search;

public class HomeworkFBlockS {
    public static void main(String[] args) {
        /*扩展的分块查找(无规律的数据)*/

        //因为数据中7的尴尬位置，所以要特殊处理，不能直接用分块查找方法-->拓展分块查找方法
        //1.分4组,todo 且每组的元素不能有交集
        int[] arr = {27,22,30,40,36,
                13,19,16,20,
                7,10,
                43,50,48};
//        System.out.println(arr.length);


        Block1 block1 = new Block1(36,40,0,4);
        Block1 block2 = new Block1(13,20,5,8);
        Block1 block3 = new Block1(7,10,9,10);
        Block1 block4 = new Block1(43,50,11,13);
        Block1[] blocks = {block1,block2,block3,block4};

        int target = 7;
        int index = block1Search(arr,blocks,target);
        System.out.println(index);//9


    }

    private static int block1Search(int[] arr, Block1[] blocks, int target) {
        //判断target在哪个块内
        int blockIndex =whereBlock1(blocks,target);
        //如果target不在任何块内，那么返回-1
        if(blockIndex==-1){
            return -1;
        }
        //如果target在块内，那么在块内进行线性查找
        Block1 block = blocks[blockIndex];
        int startIndex = block.getStartIndex();
        int endIndex = block.getEndIndex();
        for(int i=startIndex;i<=endIndex;i++){
            if(arr[i]==target){
                return i;
            }
        }

        //如果target不在块内，那么返回-1
        return -1;
    }

    private static int whereBlock1(Block1[] blocks, int target) {
        //判断target在哪个块内
        //如果target的值大于块内的min，小于等于块内的max，那么target可能在该块内
        for (int i = 0; i < blocks.length; i++) {
            if(target>=blocks[i].getMin()&&target<=blocks[i].getMax()){
                return i;
            }
        }
        return -1;
    }


}
class Block1{
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;


    public Block1() {
    }

    public Block1(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block1{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
