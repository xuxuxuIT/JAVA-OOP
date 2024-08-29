import java.util.Scanner;
// tinh so fibanacci thu n
public class J1006 {
    public static long[] f= new long[93];
    public static void check(int n){
        f[0]=1;
        f[1]=1;
        for( int i=2;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println(f[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            check(n);
        }    
    }
}
