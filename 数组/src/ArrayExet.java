//array1和array2的地址值相同，都指向了堆空间的唯一一个数组实体

public class ArrayExet {
    public static void main(String[] args) {
        int array1[],array2[];
        array1=new int[]{2,3,5,7,11,17,19};

        for (int i=1;i< array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

        //赋值array2变量等于array1
        array2=array1;

        //修改array2中的偶索引变量，使其等于索引值
        for (int i=0;i< array2.length;i++){
            if (i%2==0){
                array2[i] =i;
            }
        }
        System.out.println();

        //打印array1
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }

    }
}
