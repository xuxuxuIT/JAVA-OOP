import java.util.*;
// ky thuat hai con tro
public class Tronhaimang {public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int []a= new int[n];
        int []b=new int[m];
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for( int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int i=0,j=0;
        while( i< n && j<m){
            if(a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<n){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<m){
            System.out.print(b[j]+" ");
            j++;
        }
    }
    
}
