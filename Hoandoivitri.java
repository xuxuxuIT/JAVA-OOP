import java.util.*;
public class Hoandoivitri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a= new int[n][n];
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                if(i==j){ // duong cheo chinh
                    System.out.print(a[i][n-1-j]+" ");
                }else if( i==n-1-j){ // duong cheo phu
                    System.out.print(a[i][i]+" ");
                }else{
                    System.out.print(a[i][j]+ " ");
                }
            }
            System.out.println("");
        }     
    }  
}
