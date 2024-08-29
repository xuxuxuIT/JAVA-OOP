import java.util.Scanner;
public class J1005 {
    public static void tamGiac(int n, int h){
        for( double i=1;i<n;i++){
            double kc= h*Math.sqrt(i/n);
            System.out.printf("%.6f ",kc);
        }  
        System.out.println();
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            tamGiac(n,h);
        }
    }
}
