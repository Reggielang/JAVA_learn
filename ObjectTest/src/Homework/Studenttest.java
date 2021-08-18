package Homework;
//定义学生类，存在三个属性，学号，年级，成绩。
//创建20个对象，学号为1到20，年级和成绩由随机数决定。

public class Studenttest {
    public static void main(String[] args) {
//        声明一个student类型的数组
        student[] stus = new student[20];
        for (int i =0;i<stus.length;i++){
            //给数组元素赋值
            stus[i] = new student();
            //给student对象的属性赋值
            stus[i].number = i+1;
            //年级为[1，6]
            stus[i].state = (int)(Math.random()*(6-1+1)+1);
            //成绩[0,100]
            stus[i].score = (int)(Math.random()*(100-0+1));
        }

        //打印全部学生信息
        for (int i = 0;i<stus.length;i++){
            System.out.println(stus[i].info());
        }
        System.out.println("************************");
        //打印3年级学生
        for (int i = 0;i<stus.length;i++) {
            if (stus[i].state == 3) {
                System.out.println(stus[i].info());
            }
        }

        System.out.println("************************");
        //使用冒泡排序按照学生成绩排序
        for (int i =0;i<stus.length-1;i++){
            for (int j=0;j<stus.length-1-i;j++){
                if (stus[j].score>stus[j+1].score){
                    //如果需要交换顺序，交换的是数组的元素，在这里是student对象！！！不是交换他们的成绩！
                    student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
        //打印全部学生信息
        for (int i = 0;i<stus.length;i++){
            System.out.println(stus[i].info());
        }
        System.out.println("************************");



    }
}

class student{
    int number;
    int state;
    int score;

    //显示学生信息的方法
    public String info(){
        return "学号："+number+", 年级："+state+", 成绩："+score;
    }





}