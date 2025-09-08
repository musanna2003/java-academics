import java.util.ArrayList;
import java.util.List;

public class shape {
    public static abstract class Shape{
        private String color;
        private int cordinate;

        public Shape(String color,int cordinate){
        this.color = color;
        this.cordinate = cordinate;
        }

        public String getColor(){
            return color;
        }

        public abstract double calculateArea();

    }


    static class Circle extends Shape{
        private int r;
        public Circle(String color,int cordinate, int r){
            super( color, cordinate);
            this.r=r;
        } 
        @Override
        public double calculateArea(){
            return 3.14*r;
        };
    }

    static class Rect extends Shape{
        private int w;
        private int l;
        public Rect(String color,int cordinate, int l, int w){
            super( color, cordinate);
            this.l = l;
            this.w = w;
        } 
        @Override
        public double calculateArea(){
            return l*w;
        };
    }

    static class Tri extends Shape{
        private int a;
        private int h;
        public Tri(String color,int cordinate, int a, int h){
            super( color, cordinate);
            this.a = a;
            this.h = h;
        } 
        @Override
        public double calculateArea(){
            return 0.5*a*h;
        };
    }

    public static void main (String[] args){
        List<Shape> shapes = new ArrayList<>();

        Circle c1 = new Circle("red", 4, 5);
        shapes.add(c1);
        Rect r1 = new Rect("green", 4, 5, 6);
        shapes.add(r1);
        Tri t1 = new Tri("blue", 5,6,8);
        shapes.add(t1);

        for (Shape shape : shapes){
            System.out.println("total Area : "+shape.calculateArea() + " " + "color : " + shape.color);
        }

    }
}
