package Set;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public Student2() {
    }

    public Student2(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}'+"总分为"+getSum();
    }

    public int getSum(){
        return chinese+math+english;
    }
    @Override
    public int compareTo(Student2 o) {
        //排序的规则，按照总分排序
        //int result = this.getChinese()+this.getMath()+this.getEnglish();
        int result = this.getSum()-o.getSum();
        //次要条件，总分一样比较语文成绩
        int reuslt = result==0 ? this.getChinese()-o.getChinese():result;
        //语文成绩一样，比较数学成绩
        result= result ==0?this.getMath()-o.getMath():reuslt;
        //数学成绩一样，就比较英语成绩

        //都一样，按照姓名排序
        result=result==0 ? this.getName().compareTo(o.getName()):result;

        return result;
    }
}
