import java.util.*;
public class J1010 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            long n=0;
            for( int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'||s.charAt(i)=='8'|| s.charAt(i)=='9'){
                    n =n*10;
                }else if(s.charAt(i)=='1'){
                    n=n*10+1;
                }else{
                    n=-1;
                    break;
                }
            }
            if(n<=0) System.out.println("INVALID");
            else System.out.println(n);
        }
    }
    
}
