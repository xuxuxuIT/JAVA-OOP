import java.util.Scanner;
// ki tu thu k trong xau x[n]
public class J1022 {
    public static long[] f= new long[100];
    public static char find( int n, long k){
        if( n==1){
            return '0';
        }
        if( n==2){
            return '1';
        }
        if( k<=f[n-2]){
            return find(n-2,k);
        }else{
            return find(n-1,k-f[n-2]);
        }
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            f[1]=1;
            f[2]=1;
            for( int i=2;i<=92;i++){
                f[i]=f[i-1]+f[i-2];
            }
            System.out.println(find(n,k));
        }
    }
}
