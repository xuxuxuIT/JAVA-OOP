
import java.util.Scanner;

public class J2034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]a= new int[n];
        int[]b= new int [205];
        int res=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            res=Math.max(res,a[i]);
            b[a[i]]++;        
        }
        int ok=0;
        for( int i=1;i<res;i++){
            if(b[i]==0){
                System.out.println(i);
                ok=1;
            }
        }
        if(ok==0) System.out.println("Excellent!");
    }
}
