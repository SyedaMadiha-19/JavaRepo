// package Practice;

class PointType {
    private double x;
    private double y;

    public PointType(){
        this.x = 0;
        this.y = 0;
    }

    public PointType(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double distance(PointType point){
        System.out.println("Calculating distance between 2 PointType objects");
        return Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2));
    }

    public double distance(double x,double y){
        System.out.print("Calculating distance between PointType object & point with specified coordinates");
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }

    public void show(){
        System.out.printf("(%.1g,%.1g)\n",x,y);
    }
    
}
public class Overloading {
    public static void main(String[] args) {
        PointType p1 = new PointType(1,1);
        System.out.print("Point 1 coordinates: ");
        p1.show();
        PointType p2 = new PointType(7,9);
        System.out.print("Point 2 coordinates: ");
        p2.show();
        double d = p2.distance(p1);
        System.out.println("The distance between point 1 and 2: "+d);
        PointType p3 = new PointType();
        System.out.print("Point 3 coordinates: ");
        p3.show();
        d = p3.distance(3,4);
        System.out.println("The distance between point 3 and (3,4): "+d);
    }
}
