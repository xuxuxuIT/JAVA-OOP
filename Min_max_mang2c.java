import java.util.*;
public class Min_max_mang2c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int [][]a= new int[n+1][m+1];
        int min_val=a[1][1],max_val=a[1][1];
        for( int i=1;i<=n;i++){
            for( int j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
                min_val=Math.min(min_val,a[i][j]);
                max_val=Math.max(max_val,a[i][j]);
            }
        }
        System.out.println(min_val);
        for( int i=1;i<=n;i++){
            for( int j=1;j<=m;j++){
                if(a[i][j]==min_val){
                    System.out.println(i+" "+j);
                }
            }
        }
        System.out.println(max_val);
        for( int i=1;i<=n;i++){
            for( int j=1;j<=m;j++){
                if(a[i][j]==max_val){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
