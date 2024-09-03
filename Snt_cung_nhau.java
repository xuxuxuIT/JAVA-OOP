import java.util.*;
public class Snt_cung_nhau {
    public static int gcd( int a, int b){
        while(b>0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer>a= new ArrayList<>();
        int n=sc.nextInt();
        for( int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int cnt=0;
        for( int i=0;i<n;i++){
            for( int j=i+1;j<n;j++){
                if(gcd(a.get(i),a.get(j))==1){
                    System.out.println(a.get(i)+" "+a.get(j));
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }  
}
