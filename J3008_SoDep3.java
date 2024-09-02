import java.util.*;
//so tn va toan cac snt
public class J3008_SoDep3 {
    public static boolean nt( int n){
        if(n<2) return false;
        for( int i=2;i<=Math.sqrt(n);i++){
            if( n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean check(String s){
        int n=s.length();
        for( int i=0;i<=n/2;i++){
            if(s.charAt(i)!= s.charAt(n-i-1)|| !nt(s.charAt(i)-'0') ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
