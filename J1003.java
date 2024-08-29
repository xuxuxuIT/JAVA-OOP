
import java.util.Scanner;

public class J1003 {
    public static void main(String[] args) {
    Scanner sc= new Scanner ( System.in);
        float a= sc.nextFloat(), b= sc.nextFloat();
        if ( a==0 && b==0){
            System.out.println("VSN");
        }else if ( a==0 && b!=0){
            System.out.println("VN");
        }else{
            float x= (-b/a);
            System.out.printf("%.2f",x);
        }
    } 
}
