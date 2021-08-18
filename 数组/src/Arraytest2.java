//二维数组--可以看成一维数组array1又作为了另一个一维数组array2的元素存在。
//从数组底层运作机制来看，并没有多维数组



public class Arraytest2 {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3};
//静态初始化
        int[][] arr1= new int[][]{{1,2,3},{4,5},{6,7,8}};
//动态初始化
        String[][] arr2 =new String[3][2];
//        调用二维数组的元素
        System.out.print(arr1[0][1]);//2

        arr2[1]=new String[4];
        System.out.print(arr2[1][0]);

//        获取数组长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[1].length);//2

//        如何遍历二维数组
        for(int i =0;i< arr1.length;i++){
            for(int j=0;j < arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
