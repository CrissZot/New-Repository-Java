package ru.stqa.pft.sandbox;

public class Point {

        public double x;
        public double y;


        public Point (double a, double b) {
            this.x = a;
            this.y = b;
        }
    public double distance(Point ppp2){
        return  Math.sqrt((Math.pow((ppp2.x-this.x),2))+(Math.pow((ppp2.y-this.y),2)));
    }
            }













