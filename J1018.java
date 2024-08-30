import java.util.*;
public class J1018 {
    public static int check(String s){
        for( int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i+1)-s.charAt(i))!=2){
                return 0;
            }
        }
        return 1;
    }
    public static int tong(String s){
        long sum=0;
        for( char x: s.toCharArray()){
            sum += x-'0';
        }
        if( sum%10==0){
            return 1;
        }
        return 0;
    }  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(s.length()>=3&&tong(s)==1 && check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }        
    }
}
