import java.util.*;
public class J2013_Sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int [n];
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int lan=1;
        for(int i=0;i<n-1;i++){
            boolean sorted= true;
            for( int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    sorted= false;
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
            if(sorted){
                return;
            }
            System.out.print("Buoc "+lan+": ");
            for( int k=0;k<n;k++){
                System.out.print(a[k]+" ");
            }
            lan++;
            System.out.println();
        }
    }   
}
