
import java.util.*;
// dem so luong cac ptu khac nhau trong mang
public class Buoi12_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map= new HashMap<>();
        for( int i=0;i<n;i++){
            int tmp=sc.nextInt();
            map.put(tmp,2);
        }
        System.out.println(map.size());
    }    
}
