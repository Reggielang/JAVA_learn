//java.util.Arrays--操作数组的工具类，里面定义了很多操作数组的方法
import java.util.Arrays;
public class Arraystest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
        boolean isequals = Arrays.equals(arr1,arr2);
        System.out.println(isequals);


        System.out.print(Arrays.toString(arr1));

        Arrays.fill(arr1,10);
        System.out.print(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.print(Arrays.toString(arr2));

        int[] arr3 = new int[]{-89,-32,0,2,14,15};
        Arrays.binarySearch(arr3,0);

    }
    
}
