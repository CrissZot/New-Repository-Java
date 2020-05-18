package ru.stqa.pft.sandbox;

public class PointZE {
    public static void main(String[] args){

        //1. Относится к функции "distance(ru.stqa.pft.sandbox.Point p1, ru.stqa.pft.sandbox.Point p2)"
       Point pp1 = new Point(10,5 );
        Point pp2 = new Point(20,11 );
        System.out.println("Расстояние между 2-мя точками = " + distance(pp1, pp2));

         //2. Относится к методу distance(ru.stqa.pft.sandbox.Point p2)
        Point ppp1 = new Point(70,1 );
        Point ppp2 = new Point(30,21 );
        System.out.println("Расстояние между 2-мя точками (при помощи метода в классе ru.stqa.pft.sandbox.Point) = " + ppp1.distance(ppp2));

    }
    public static double distance(Point p1, Point p2){
        return  Math.sqrt((Math.pow((p2.x-p1.x),2))+(Math.pow((p2.y-p1.y),2)));
    }
}
