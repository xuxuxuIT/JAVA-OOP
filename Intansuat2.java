import java.util.*;
// in theo thu tu xuat hien
public class Intansuat2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int [n];
        int []d= new int[100005];
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
            d[a[i]]++;
        }   
        for( int i=0;i<n;i++){
            if(d[a[i]]>0){
                System.out.println(a[i]+" "+d[a[i]]);
                d[a[i]]=0;
            }
        }
    }  
}
