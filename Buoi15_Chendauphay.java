import java.util.*;
//12345678=>12,345,678
public class Buoi15_Chendauphay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder("");
        int cnt=0;
        for( int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            cnt++;
            if( cnt %3==0 && i!=0){
                sb.append(",");
            }      
        }  
        System.out.println(sb.reverse().toString());
    }
}
