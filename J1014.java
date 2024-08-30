import java.util.Scanner;
//uoc so nguyen to lon nhat cua n
public class J1014 {
    public static long uoc(long n){
        long res=0;
        for( int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                res=i;
                while(n%i==0){
                    n/=i;
                }
            }  
        }
        if(n!=1) res=n;
        return res;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            System.out.println(uoc(n));
        }
    }
}
