import java.util.*;
public class Tichhaisolonnhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> a= new ArrayList<>();
        int n=sc.nextInt();
        for( int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a);
        long t1=(long)a.get(0) * a.get(1);//xu li tran so
        long t2=(long)a.get(n-1) *a.get(n-2);   
        System.out.println(Math.max(t1,t2));
    }      
}
