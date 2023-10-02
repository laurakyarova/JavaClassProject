package class18;

public class Shape {

    double radius=10;

    }

class Circle extends Shape{
    void area(){
        double area=radius*radius*Math.PI;
        System.out.println("Area of circle: "+area);
    }
}
class Test{
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.area();
    }
}
