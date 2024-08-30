import java.util.Scanner;
// tinh a mu b ket qua chia du cho 10^9+7
public class J1021 {
    public static int MOD=(int)(1e9+7);
    public static long luyThua( int a, long b){
        if(b==0){
            return 1;
        } else if( b==1){
            return a%MOD;
        }else{
            long tmp=luyThua(a,b/2);
            if(b%2==0){
                return (tmp*tmp)%MOD;
            }else{
                return (((tmp*tmp)%MOD)*a)%MOD;              
            }           
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            if( a==0 && b==0){
                return;
            }else{
                luyThua(a,b);
            }
            System.out.println(luyThua(a,b));
        }
    }
}
