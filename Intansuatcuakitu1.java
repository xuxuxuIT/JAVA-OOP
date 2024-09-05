import java.util.*;
// in theo thu tu tang dan
public class Intansuatcuakitu1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int []d= new int[256];
        for( int i=0;i<s.length();i++){
            d[s.charAt(i)]++;
        }
        for( char c=0;c<256;c++){
            if(d[c]>0) System.out.println(c+" "+d[c]);
        }
    }    
}
