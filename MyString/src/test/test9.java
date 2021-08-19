package test;

public class test9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        String result = arrayToString(arr);
        System.out.println(result);

    }

    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }
}
