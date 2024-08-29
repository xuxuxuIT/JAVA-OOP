import java.util.Scanner;
// tinh tong giai thua
public class J1009 {
    public static long gt( int n){
        long res=1;
        for( int i=1;i<=n;i++){
            res *=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long s=0;
        for( int i=1;i<=n;i++){
            s += gt(i);
        }
        System.out.println(s);
    }
}
