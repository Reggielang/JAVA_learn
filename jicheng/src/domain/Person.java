package domain;
/*
继承：
1.提高了代码的复用性
2.提高了代码的维护性
3.类和类之间产生了关系，是多态的前提

继承导致子类，必须拥有父类的非私有属性和关系

单继承，不支持多继承，支持多层继承
 */
public class Person {
    private  String id;
    private String name;
    private int age;
    private String birthday;


    public Person() {
    }

    public Person(String id, String name, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void show(){
        System.out.println(name+"--"+age);
    }

}
