import java.util.*;
public class Demxaucon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int []d= new int[256];
        for( int i=0;i<s.length();i++){
            d[s.charAt(i)]++;
        }
        int res=s.length();
        for( int c=0;c<256;c++){
            if(d[c]>0){
                res += (long)(d[c]*(d[c]-1)/2);
            }
        }
        System.out.println(res);
    }
    
}
