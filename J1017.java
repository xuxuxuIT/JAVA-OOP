import java.util.*;
public class J1017 {
    public static int so( String s){
        for( int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i+1)-s.charAt(i)) !=1){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            sc.nextLine();
            String s=sc.next();
            if(so(s)==1) System.out.println("YES");  
            else System.out.println("NO");
        }
    }
}
