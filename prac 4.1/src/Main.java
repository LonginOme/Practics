import java.util.Scanner;

class Shape{
    static Scanner sc = new Scanner(System.in);
    public String Type;
    public double Area;
    public double Perimeter;
    public double getArea(double area){
        return (Area);
    }
    String getType(String type){
        return (Type);
    }
    public double getPerimeter(double perimeter){
        return(Perimeter);
    }
    public String toString(){
        return ("Тип:" + Type + "Площадь:" + Area + "Периметр:" + Perimeter);
    }

}
class Circle extends Shape{
    double radius = sc.nextDouble();
    @Override public double getArea(double area){
        Area = Math.PI * (radius * radius);
        return(super.getArea(Area));
    }
    @Override public double getPerimeter(double perimeter){
        Perimeter = Math.PI * 2*radius;
        return(super.getPerimeter(Perimeter));
    }
    @Override public String getType(String type){
        Type = "Круг";
        return (super.getType(Type));
    }
    @Override public String toString(){
        return super.toString();
    }
}

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}