import java.util.Scanner;
// so tam phan la so chi co ba chu so 0,1,2
public class J1023 {
    public static boolean check(String s){
        for( char x:s.toCharArray()){
            if( x!='0' && x!='1' &&x!='2'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            if(check(s)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
