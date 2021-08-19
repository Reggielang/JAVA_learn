package String;
//截取字符串对象
public class demosubString {
    public static void main(String[] args) {
        String a = "agvgc";
        String sub = a.substring(2);
        System.out.println(sub);


        String sub2 = a.substring(0,2);//包含头不包含尾的截取
        System.out.println(sub2);


    }
}
