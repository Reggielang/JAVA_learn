public class Exceptiondemo4 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = null;
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        if (arr ==null){
            throw new NullPointerException();// 当参数为null的时候，手动创建了一个异常对象给调用者
        }else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
        }
        }
    }
}
