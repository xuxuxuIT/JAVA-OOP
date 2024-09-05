import java.util.*;
// s.trim(): xu li dau cach o dau cau
public class Demtutrongxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String []a= s.trim().split("\\s+"); // mang cac ki tu
        System.out.println(a.length);
    }
}
