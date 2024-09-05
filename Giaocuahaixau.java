import java.util.*;
// in ra giao cua hai xau theo thu tu tang dan
public class Giaocuahaixau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int []d1= new int[256];
        int []d2= new int[256];
        for( int i=0;i<s1.length();i++){
            d1[s1.charAt(i)]++;
        }
        for( int i=0;i<s2.length();i++){
            d2[s2.charAt(i)]++;          
        }
        ArrayList<Character> a= new ArrayList<>();
        for( char c=0;c<256;c++){
            if(d1[c]>0 && d2[c]>0){
                a.add(c);             
            }
        }
        for( char x:a){
            System.out.print(x+" ");
        }
    }   
}
