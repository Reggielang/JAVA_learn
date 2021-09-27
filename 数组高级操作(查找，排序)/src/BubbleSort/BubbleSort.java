package BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        //第一轮
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        print(arr);
        //第二轮
        for (int i = 0; i < arr.length - 1-1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        print(arr);
        //第三轮
        for (int i = 0; i < arr.length - 1-2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        print(arr);
        //第四轮
        //第三轮
        for (int i = 0; i < arr.length - 1-3; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
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
