import java.util.*;
public class Hoandoihaicot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a= new int[n][n];
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int c1=sc.nextInt(),c2=sc.nextInt();
        c1--; c2--;
        for( int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                if(j==c1){
                    System.out.print(a[i][c2]+" ");
                }else if(j==c2){
                    System.out.print(a[i][c1]+" ");
                }else{
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println("");
        }
    } 
}
