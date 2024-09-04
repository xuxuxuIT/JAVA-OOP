import java.util.*;
// tam giac duoi j<=i
public class So_tn_duoitamgiac {
    public static boolean tn( int n){
        int s=0,m=n;
        while(n>0){
            s= s*10 +n%10;
            n/=10;          
        }
        return s==m;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a= new int [n][n];
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int cnt=0;
        for( int i=0;i<n;i++){
            for( int j=0;j<=i;j++){
                if(tn(a[i][j])) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
