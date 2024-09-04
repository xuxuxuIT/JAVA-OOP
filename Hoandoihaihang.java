import java.util.*;
// hoan doi cac ptu o hai hang
public class Hoandoihaihang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][]a= new int[n][n];
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int h1=sc.nextInt(),h2=sc.nextInt();
        h1--;h2--;
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                if(i==h1){
                    System.out.print(a[h2][j]+" ");
                }else if( i==h2){
                    System.out.print(a[h1][j]+" ");
                }else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }
    
}
