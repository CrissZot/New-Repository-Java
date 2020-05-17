public class Point {

        public double x;
        public double y;


        public Point (double a, double b) {
            this.x = a;
            this.y = b;
        }
    public double distance(Point p2){
        return  Math.sqrt((Math.pow((p2.x-this.x),2))+(Math.pow((p2.y-this.y),2)));
    }
            }



