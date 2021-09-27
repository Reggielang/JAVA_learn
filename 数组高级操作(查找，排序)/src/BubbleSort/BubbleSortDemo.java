package BubbleSort;

public class BubbleSortDemo {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 4};

         BubbleSort(arr);
    }

    //外层循环控制次数，数组的长度少一次 -1是为了不让数组越界
    //内层循环才是实际元素的比较 -1是为了每一轮比较后，不去比较上一轮确定的最大值
    private static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
