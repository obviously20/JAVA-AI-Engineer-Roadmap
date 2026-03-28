package learing.API.search;

public class BlockSearch {
    public static void main(String[] args) {
        /*当数据表中的数据元素很多时，可以采用分块查找。
汲取了顺序查找和折半查找各自的优点，既有动态结构，又适于快速查找
分块查找适用于数据较多，但是数据不会发生变化的情况，如果需要一边添加一边查找，建议使用哈希查找
分块查找的过程：
1. 需要把数据分成N多小块，块与块之间不能有数据重复的交集。
2. 给每一块创建对象单独存储到数组当中
3. 查找数据的时候，先在数组查，当前数据属于哪一块
4. 再到这一块中顺序查找*/

        //分块查找：块内是无序的，但是块之间是有序的：每一块中的元素都要小于下一块中的每个元素
        //1.具体分成多少块，大概是sqrt(arr.length) 个 ，这里分成3/4个块
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //3.开始分块
        Block b1= new Block(21,0,5);
        Block b2= new Block(45,6,11);
        Block b3= new Block(73,12,17);
        Block[] blocks = {b1,b2,b3};

        //4.查找数据
        int target = 34;

        //5.调用分块查找方法
        int index = blockSearch(arr, blocks, target);
        System.out.println(index);


    }

    private static int blockSearch(int[] arr, Block[] blocks, int target) {
        //1.先在数组查，当前数据属于哪一块
        int blockIndex = searchIndexForBlock(blocks, target);
        if(blockIndex == -1){
            return -1;
        }
        //2.再到这一块中顺序查找
        Block kuai = blocks[blockIndex];
        for(int i = kuai.getStartIndex();i<= kuai.getEndIndex();i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    private static int searchIndexForBlock(Block[] blocks, int target) {
        //在块中去比较，如果目标值比块的最大值要小，那目标值就有可能在改块中，那就返回该块所在块数组的下标（即第几块）
        for (int i = 0; i < blocks.length; i++) {
            if(target<blocks[i].getMax()){
                return i;
            }
        }
        //如果目标值大于等于所有块的最大值，那目标值就不存在于数组中
        return -1;
    }


}
//2.先创建一个块类，用来存储每个块的起始索引和结束索引和块内的最大值
class Block{
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
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
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
