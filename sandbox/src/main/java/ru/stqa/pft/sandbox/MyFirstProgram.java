package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Square l = new Square(5);
               System.out.println("Площадь квадрата со стороной " + l.g + " равна " + l.area());

        hello("world");
        hello("sdgsdfg");

        Rectangel r = new Rectangel(10,20);

        System.out.println("Площадь прямоугольника со стороной " + r.a +" и "+ r.b + " равно = "+ r.area());
    }


    public static void hello(String somebody) {
        System.out.println("Hello" + somebody + "world!");
    }



}
