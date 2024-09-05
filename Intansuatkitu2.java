import java.util.*;
// in theo thu tu xuat hien
public class Intansuatkitu2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int []d= new int[256];
        for( int i=0;i<s.length();i++){
            d[s.charAt(i)]++;
        }
        for( int i=0;i<s.length();i++){
            if(d[s.charAt(i)]>0){
                System.out.println(s.charAt(i)+" "+d[s.charAt(i)]);
                d[s.charAt(i)]=0;
            }
        }
    }      
}
