import java.util.Scanner;
import java.math.BigInteger;
public class J3011_USCLN_CuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a= new BigInteger(sc.next());
            BigInteger b= new BigInteger(sc.next());
            System.out.println(a.gcd(b));
        }
    }
}
