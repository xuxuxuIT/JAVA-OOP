import java.util.Scanner;
// chu so 4 va chu so 7
public class J1016 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int cnt1=0, cnt2=0;
        for( int i=0;i<s.length();i++){
            if(s.charAt(i)=='4'){
                cnt1++;
            }else if( s.charAt(i)=='7'){
                cnt2++;
            }
        }
        if(cnt1+cnt2==4 || cnt1+cnt2==7) System.out.println("YES");
        else System.out.println("NO");
    }
    
}
