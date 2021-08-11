public class Yanghuitest {
    public static void main(String[] args) {
//        1声明初始化二维数组
        int[][] yanghui = new int[10][];

//        2给数组的元素赋值
        for (int i =0;i<yanghui.length;i++){
            yanghui[i] = new int[i+1];
            //        2.1给首末元素赋值
            yanghui[i][0]=1;
            yanghui[i][i]=1;
//            2.2给每行中间的元素赋值
            if (i>1){
                for (int j = 1;j< yanghui[i].length-1;j++){
                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }
        }

//        3遍历二维数组
        for (int i=0;i<yanghui.length;i++){
            for (int j=0;j< yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
