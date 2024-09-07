import java.util.*;
// kiem tra mot so rat lon co chia het cho k
public class mod_string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int mod=0;
        for( int i=0;i<s.length();i++){
            mod=(mod*10)%k + (s.charAt(i)-'0')%k;
            mod %=k; 
        }
        System.out.println(mod);
    }   
}
