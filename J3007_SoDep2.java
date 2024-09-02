import java.util.*;
// so tn,bdau,kthuc la so 8 va tong chia het cho 10
public class J3007_SoDep2 {
    public static boolean check( String s){
        if(s.charAt(0) !='8' || s.charAt(s.length()-1) !='8'){
            return false;
        }
        int sum=0;
        int n=s.length();
        for( int i=0;i<n;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
            sum += s.charAt(i) -'0';
        }
        if( sum %10 != 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
