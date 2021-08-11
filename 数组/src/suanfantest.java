//求数值类数值元素中的最大、最小、平均数、总和等

public class suanfantest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i=0;i< arr.length;i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        //求数组对最大值
        int maxnum =arr[0];
        for(int i=0;i<arr.length;i++){
            if (maxnum<arr[i]){
                maxnum=arr[i];
            }
        }
        //求数组对最小值
        int minmun = arr[0];
        for(int i=0;i<arr.length;i++){
            if (minmun>arr[i]){
                minmun=arr[i];
            }
        }
//        求数组元素总和
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            }
        //求数组元素平均值
        double avgnum = sum/ arr.length;
        System.out.println(maxnum);
        System.out.println(minmun);
        System.out.println(sum);
        System.out.println(avgnum);
        }
    }
