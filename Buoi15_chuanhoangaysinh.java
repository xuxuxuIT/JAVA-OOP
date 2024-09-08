import java.util.*;
// 2/5/2004=> 02/05/2004
public class Buoi15_chuanhoangaysinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert( 0,"0");
        if(sb.charAt(4)=='/')  sb.insert(3,"0");
        System.out.println(sb.toString());
    }
}
