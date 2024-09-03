import java.util.*;
// in theo gia tri tang dan
public class Hopcuahaimang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int []a = new int [n];
        int []b= new int[m];
        int []d1= new int[1005];
        int []d2= new int[1005];
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
            d1[a[i]]++;
        }
        for( int i=0;i<m;i++){
            b[i]=sc.nextInt();
            d2[b[i]]++;
        }
        ArrayList<Integer> hop= new ArrayList<>();
        for( int val=0;val<1005;val++){
            if(d1[val]>0 || d2[val]>0) hop.add(val);
        }
        for( int x: hop){
            System.out.print(x+" ");
        }
    } 
}
