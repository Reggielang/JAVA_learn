
/*
* 算法的考察：数组的复制，反转，查找（线性查找，二分查找）
*
*
*
*
*
* */

public class ArrayTest01 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};

        //数组的复制（区别在于数组变量的赋值 arr1=arr）
        String[] arr1 = new String[arr.length];
        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }

        //数组的反转
        for (int i=0;i<arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        //方法2
        for (int i=0,j= arr.length-1;i<j;i++,j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //查找（搜索）
        //线性查找：
        boolean isFlag = true;
        String desc = "BB";
        for (int i =0;i< arr.length;i++){
            if (desc.equals(arr[i])){
                System.out.print("找到了该元素，索引位置为"+i);
                isFlag=false;
                break;
            }
        }
        if (isFlag){
            System.out.print("对不起没找到");
        }
        //二分法查找--前提：要查找的数组必须是有序数组
        int[] arr2 = new int[]{-98,-34,2,34,45,67,89,219,313};

        int dest1 = 34;
        int head=0;//初始首索引
        int end = arr2.length-1;//初始末索引
        boolean isFlag1 = true;

        while (head<=end){
            int middle = (head+end)/2;
            if (dest1==arr2[middle]){
                System.out.print("找到了，该数在索引"+middle);
                isFlag1 =false;
                break;
            }else if(arr2[middle]>dest1){
                end = middle-1;
            }else if (arr2[middle]<dest1){
                head = middle+1;
            }
        }

        if (isFlag1==true){
            System.out.print("没找到啊");
        }



    }
}
