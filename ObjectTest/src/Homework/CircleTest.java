package Homework;
//计算圆面积
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.Radius = 2.2;
        double area = c1.Area();
        System.out.println(area);
    }

}


class Circle{
    //半径
    double Radius;

    //求圆面积的方法
    public double Area(){
        double area = Math.PI*Radius*Radius;
        return area;
    }



}