import java.util.Scanner;
import java.util.*;
// sap xep chen
public class J2012 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int[n];
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> b= new ArrayList<>();
        for( int i=0;i<n;i++){
            b.add(a[i]);
            Collections.sort(b);
            System.out.print("Buoc "+i+": ");
            for(Integer x: b){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    
}
