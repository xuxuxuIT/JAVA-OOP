import java.util.Scanner;
public class Point {
    private double x;
    private double y;
    public Point( double x, double y){
        this.x=x;
        this.y=y;
    }
    public static double Distance(Point a,Point b){
        return Math.sqrt(((b.x-a.x)*(b.x-a.x))+((b.y-a.y)*(b.y-a.y)));
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Point a= new Point( sc.nextDouble(),sc.nextDouble());
            Point b= new Point( sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",Point.Distance(a,b));
        }
    }  
}
