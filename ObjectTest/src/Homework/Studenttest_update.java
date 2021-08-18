package Homework;
//定义学生类，存在三个属性，学号，年级，成绩。
//创建20个对象，学号为1到20，年级和成绩由随机数决定。
//对student类的改进
public class Studenttest_update {
    public static void main(String[] args) {
//        声明一个student类型的数组
        student1[] stus = new student1[20];
        for (int i =0;i<stus.length;i++){
            //给数组元素赋值
            stus[i] = new student1();
            //给student对象的属性赋值
            stus[i].number = i+1;
            //年级为[1，6]
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random()*(100-0+1));
        }

        //在main方法中调用写好的方法
        Studenttest_update test = new Studenttest_update();
        test.print(stus);
        System.out.println("************************");
        test.searchState(stus,3);
        System.out.println("************************");
        test.sort(stus);

        test.print(stus);

    }
    //遍历student1[]数组
    public void print(student1[] stus){
        //打印全部学生信息
        for (int i = 0;i<stus.length;i++){
            System.out.println(stus[i].info());
        }
    }
    /**
     *
     * @param stus -- 对象
     * @param state -- 指定的年级
     */
    //查找指定年级的学生
    public void searchState(student1[] stus, int state){
        for (int i = 0;i<stus.length;i++) {
            if (stus[i].state == state) {
                System.out.println(stus[i].info());
            }
        }
    }
    /**
     * 给student1数组根据成绩进行排序
     * @param stus
     */
    public void sort(student1[] stus){
        //使用冒泡排序按照学生成绩排序
        for (int i =0;i<stus.length-1;i++){
            for (int j=0;j<stus.length-1-i;j++){
                if (stus[j].score>stus[j+1].score){
                    //如果需要交换顺序，交换的是数组的元素，在这里是student对象！！！不是交换他们的成绩！
                    student1 temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
    }
}

class student1{
    int number;
    int state;
    int score;

    //显示学生信息的方法
    public String info(){
        return "学号："+number+", 年级："+state+", 成绩："+score;
    }
}