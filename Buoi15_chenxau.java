import java.util.*;
// chen xau a vao vi tri k cua xau s
public class Buoi15_chenxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String a=sc.nextLine();
        int k=sc.nextInt();
        StringBuilder sb= new StringBuilder(s);
        sb.insert(k,a);
        System.out.println(sb.toString());
        
    }  
}
