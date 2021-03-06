//数组的理解，是多个相同类型的数据按照一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对数据进行统一管理。
//数组名、元素、 索引、数组的长度：元素的个数
//特点：1.数组是有序排列的
//2.数组属于引用数据类型，数组的元素可以是基本数据类型或者引用数据类型
//3. 数组的长度一旦确定不可修改
//4.创建数组对象回在内存中开辟一整块连续空间

//按照维度：一维数组，二维数组，
//按照元素的：基本数据类型元素的数组，引用数据类型元素的数组

//一维数组的声明和初始化、
// 如何调用数组指定位置的元素、
// 如何去表示或者获取数组的长度、
//如何遍历数组、
//数组元素的默认初始化值
//数组的内存解析

//数据结构：
//1.数据与数据之间的逻辑关系：集合，一对一，一对多，多对多
//2.数据存储结构：
//线性表：顺序表（数组）、链表、栈、队列
//树形结构：二叉树
//图形结构：

//算法
//排序算法
//搜索算法

public class Arraytest {
    public static void main(String[] args) {
        //一维数组的声明和初始化、
//        静态初始化：数组的初始化和数组元素的赋值操作同时进行
        int[] ids = new int[]{10,11,12,13};
//        动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] name = new String[5];
//        总结：数组一旦初始化完成，其长度就确定了
//        数组的索引是从0开始的，到长度-1结束
        name[0]="奥特曼";
        name[1]="怪兽";
        name[2]="哇塞";
        name[3]="宝可梦";
        name[4]="不可能";
//        获取数组长度
        System.out.print(name.length);
//        遍历数组
        for (int i =0;i < name.length;i++){
            System.out.print(name[i]);
        }
//        数组元素的初始化值
        int[] arr = new int[4];
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
//        数组的内存解析

    }
}
