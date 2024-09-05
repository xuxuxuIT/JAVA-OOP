import java.util.*;
// su dung stringbuilder
public class Xaudoixung {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s= sc.nextLine();
    StringBuilder sb= new StringBuilder(s);
    String s2=sb.reverse().toString();
    if(s.equals(s2)) System.out.println("YES");
    else System.out.println("NO");
    } 
}
