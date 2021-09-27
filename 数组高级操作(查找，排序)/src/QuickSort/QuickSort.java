package QuickSort;

/*
快排核心：
每一次递归以第一个数为基准数，找到数组中所有比基准数小的。再找所有比基准数大的，小的全部放左边，大的全部放右边
确定基准数的正确位置
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        quiteSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quiteSort(int[] arr, int left, int right) {
        int left0 = left;
        int right0 = right;

        //计算基准数
        int baseNum = arr[left0];

        while (left != right) {
            //从右边开始找比基准数小的
            while (arr[right] >= baseNum && right > left) {
                right--;
            }
            //从左边开始找比基准数大的
            while (arr[left] <= baseNum && right > left) {
                left++;
            }
            //交换两个的位置
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        //基准数归位
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
    }

}
