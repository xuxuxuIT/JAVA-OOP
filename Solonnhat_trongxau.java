import java.util.*;
import java.math.BigInteger;
// abc34dnfj157mdkd45 => 157
public class Solonnhat_trongxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String res=" ";
        for( int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                res += " ";
            }else{
                res += s.charAt(i);
            }
        }
        BigInteger max_val= new BigInteger("0");
        String[] a= res.trim().split("\\s+");
        for( String x: a){
            BigInteger num= new BigInteger(x);
            max_val=max_val.max(num);
        }
        System.out.println(max_val);
    }
}
