import java.util.*;
//in theo thu tu tu be den lon
public class Intansuat1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int [n];
        int []d= new int[100005];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            d[a[i]]++;
        }
        for( int val=0;val<=100005;val++){
            if(d[val]>0){
                System.out.println(val+" "+d[val]);
                d[val]=0;
            }
        }
    }  
}
