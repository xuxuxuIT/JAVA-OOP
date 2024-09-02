import java.util.*;
// la so thuan ngich va toan la cac so chan
public class J3006_SoDep1 {
    public static boolean check(String s){
        int n=s.length();
        for( int i=0;i<n;i++){
            if(s.charAt(i) !=s.charAt(n-i-1)||(s.charAt(i)-'0')%2==1){
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
