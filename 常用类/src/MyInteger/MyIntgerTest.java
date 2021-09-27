package MyInteger;

public class MyIntgerTest {
    public static void main(String[] args) {
        //有一个字符串“91 27 46 38 50” 把其中的每个数，存入到int类型的数组中
        String s = "91 27 46 38 50";
        //获取字符串中的每个数字
        String[] strArr = s.split(" ");

        //创建一个int类型的数组，
        int[] numArr = new int[strArr.length];

        //strArr的数据进行类型转换，存入到int类型的数组中
        for (int i = 0; i < strArr.length; i++) {
            int num = Integer.parseInt(strArr[i]);
            numArr[i] = num;
        }
        // 遍历int类型的数组
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }

    }
}
