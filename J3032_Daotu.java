
import java.util.*;
public class J3032_Daotu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] a= sc.nextLine().trim().split("\\s+");
            for( String x:a){
                StringBuilder b= new StringBuilder(x);
                System.out.print(b.reverse().toString()+" ");
            }
            System.out.println("");
        }
    }
}
