import java.util.*;
import java.util.Comparator;
public class Sapxepchanle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for( int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        Collections.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                if(a%2==1 && b%2==0 ) return -1;
                if( a%2==0 && b%2==1) return 1;
                if(a%2==1 && b%2==1) return b-a;
                else return a-b;
                
            }          
        });
        for( int x: a){
            System.out.print(x+ " ");
        }
    }
}
