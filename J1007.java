import java.util.Scanner;
// kiem tra so fibo thu n
public class J1007 {
    public static long[]f=new long [93];
    public static boolean check( long n){
        f[0]=0;
        f[1]=1;
        for( int i=2;i<=92;i++){
            f[i]=f[i-1]+f[i-2];
        }
        for(int i=0;i<=92;i++){
            if(f[i]==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(check(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }    
    }
}
