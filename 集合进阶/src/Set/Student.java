package Set;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
/*
自然排序原理
1.如果返回值为负数，表示当前存入的元素是较小值，存左边
2.如果返回值为0，表示当前存入的元素重复了，不存
3.如果返回值为正数，表示当前存入的元素是较大值，存右边

 */
    @Override
    public int compareTo(Student o) {
        //按照对象的年龄进行排序
        //主要判断条件
        int result = this.age-o.age;
        //次要判断条件
        result = result == 0 ? this.name.compareTo(o.getName()):result;
        return result;
    }

    //重写过后比较了内部的属性值，就不会出现重复的元素了。
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }
    //可以对Object类中的hashCode方法进行重写，在重写后就一般是根据对象的属性值来计算哈希值。
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
