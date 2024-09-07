import java.util.*;
import java.math.BigInteger;
public class Tongcacso_trongxau {
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
        BigInteger sum = new BigInteger("0");
        String []a= res.trim().split("\\s+");
        for( String x: a){
            BigInteger num= new BigInteger(x);
            sum=sum.add(num);
        }
        System.out.println(sum);
    } 
}
