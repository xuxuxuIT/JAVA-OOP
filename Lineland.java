import java.util.*;
public class Lineland {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for( int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.print(a.get(1)-a.get(0)+" ");
        System.out.println(a.get(n-1)-a.get(0));
        for( int i=1;i<n-1;i++){
            int max= Math.max(a.get(i)-a.get(0),a.get(n-1)-a.get(i));
            int min=Math.min(a.get(i)-a.get(i-1),a.get(i+1)-a.get(i));
            System.out.println(min);
            System.out.println(max);
        }
        System.out.print(a.get(n-1)-a.get(n-2)+" ");
        System.out.println(a.get(n-1)-a.get(0));
    }   
}
