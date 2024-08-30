import java.util.Scanner;
// Tong uoc so cua n-sang snt
public class J1013 {
    public static final int n=(int)2e6;
    public static int[] prime= new int[n+5];
    public static void sangSo(){
        for( int i=2;i*i<=n;i++){
            if(prime[i]==0){
                for(int j=i;j<=n;j+=i ){
                    if(prime[j]==0){
                        prime[j]=i;
                    }
                }
            }
        }
        for( int i=2;i<=n;i++){
            if(prime[i]==0){
                prime[i]=i;
            }
        }     
    }
    public static int tong( int n){
        if(prime[n]==0){
            return n;
        }
        int sum=0;
        while(n!=1){
            sum +=prime[n];
            n/=prime[n];       
        }
        return sum;
    }
    public static void main(String[] args) {
        sangSo();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for( int i=0;i<n;i++){
            int x=sc.nextInt();
            sum += tong(x);
        }
        System.out.println(sum);
    }
}
