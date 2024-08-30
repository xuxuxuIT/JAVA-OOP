import java.util.Scanner;
// dem so luong uoc so cua n chia het cho 2
public class J1012 {  
    public static void uocSo( int n){
        int cnt=0;
        for( int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i%2==0){
                    cnt++;
                }
                if((n/i)%2==0 && i!= Math.sqrt(n)) cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            uocSo(n);          
        }
    }
}
