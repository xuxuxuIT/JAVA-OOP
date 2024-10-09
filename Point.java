import java.util.*;
public class Point {
    private double x;
    private double y;
    public Point( double x, double y){
        this.x=x;
        this.y=y;
    }
    public double Distance ( Point other ){
        return Math.sqrt((other.x-this.x)*(other.x-this.x)+(other.y-this.y)*(other.y-this.y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Point a= new Point( sc.nextDouble(),sc.nextDouble());
            Point b= new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",a.Distance(b));
        }
    }   
}
