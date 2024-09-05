import java.util.*;
// xau co day du 26 ki tu tu a->z
public class Xau_Pangram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        s=s.toUpperCase();
        HashSet<Character> se= new HashSet<>(); // luu cac ki tu khac nhau
        for( int i=0;i<s.length();i++){
            se.add(s.charAt(i));            
        }     
        if(se.size()==26) System.out.println("YES");
        else System.out.println("NO");
    }  
}
