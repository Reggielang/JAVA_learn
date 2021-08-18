package Homework;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,25,5,3,54,357,-98,0,-52};
        int max = util.getMax(arr);
        System.out.println("最大值为"+max);
        util.print(arr);
        util.sort(arr);
        System.out.println();
        util.print(arr);

        int index = util.getIndex(arr,5);
        if (index>=0){
            System.out.println("找到了，索引为"+index);
        }
        else {
            System.out.print("没找到啊！");
        }

    }
}
