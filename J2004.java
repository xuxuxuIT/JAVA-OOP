import java.util.Scanner;
// ktra mang doi xung
public class J2004 {
    public static boolean check( int[] a){
        int n=a.length;
        for( int i=0;i<n/2;i++){
            if(a[i] !=a[n-i-1]){
                return false;
            }
        }
        return true;
    }  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];
            for( int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }  
}
