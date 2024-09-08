import java.util.*;
//kiem tra loai ki tu lop Character
// isDigit,isLowerCase,isUpperCase,isAlphabetic,toLowerCase,toUpperCase
public class inthuongxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String res=" ";
        String s=sc.nextLine();
        for( int i=0;i<s.length();i++){
            res += Character.toLowerCase(s.charAt(i));
        }
        System.out.println(res);
    }  
}
