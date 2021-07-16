//JAVA中定义的数据类型
// 变量按照数据类型来分：
// 基本数据类型：整型（byte、short、int、long），浮点型（float、double），字符型（char），布尔型（Boolean）
// 引用数据类型：类（class），接口（interface），数组（array）

//变量在类中的声明中的位置：
//成员变量、局部变量

//byte(1字节=8bit), short(2字节), int(4字节), long(8字节)
public class VariableTest2 {
    public static void main(String[] args) {
        //byte 范围-128~127
        byte b1 = 12;
        byte b2 = -128;
        System.out.println(b1);
        System.out.println(b2);

        short s1 = 128;
        int i1 = 1234;
        long l1 = 341515151L;
        System.out.println(l1);


        //通常定义浮点型变量时，一般使用double
        //浮点型 float(4字节),  double(8字节)  注意：float表示数值范围比long还大
        double d1 = 123.3;
        System.out.println(d1+1);
        //float变量结尾必须以F或者f结尾
        float f1 = 12.3f;
        System.out.println(f1);

        //字符型 char（1字符=2字节）
        //定义char类型 通常使用单引号 只能写一个字符
        char c1 ='a';
        //c1 = 'ab'
        System.out.println(c1);
        //表示方式 1.声明一个字符 2.转义字符 3. 直接使用Unicode值来表示字符型常量
        char c5='\n';
        System.out.println("Hello");
        System.out.println("world");

        //boolean 布尔型
        //只能取两个值之一  True\False
        boolean bl = true;
        System.out.println(bl);

        boolean isMarried = true;
        if(isMarried) {
            System.out.println("你不能参加单身派对了！\n很遗憾");
        }else{
                System.out.println("你可以多谈谈女朋友");
            }

    }
}
