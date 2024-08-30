import java.util.Scanner;
// tim boi so nho nhat cua hai so nguyen duong dau
public class J2008 {
    public static long gcd( long a , long b){
        while(b!=0){
            long r=a%b;
            a=b;
            b=r;
        }
        return a;
    }  
    public static long lcm( long a , long b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long res=1;
            for( int i=2;i<=n;i++){
                res=lcm(res,i);
            }
            System.out.println(res);
        }
    }
}
