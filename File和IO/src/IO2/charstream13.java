package IO2;

import java.io.*;
import java.util.Arrays;

/*

 */
public class charstream13 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        //1.要把文件中的数据读取
        BufferedReader br = new BufferedReader(new FileReader("File和IO\\copy.txt"));

        String line = br.readLine();
        br.close();

        //2.排序 先切割
        String[] s = line.split(" ");
        //字符串类型的数组变为int类型
        int[] arr = new int[s.length];
        //遍历s数组 进行类型转换，存入arr
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            int num = Integer.parseInt(str);
            arr[i] = num;

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //3.排序之后的结果，写回到本地
        //输出流，一定不能写在开头，因为会清空文件！！！
        BufferedWriter bw = new BufferedWriter(new FileWriter("File和IO\\sort.txt"));

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
            bw.flush();
        }
        bw.close();
    }
}
