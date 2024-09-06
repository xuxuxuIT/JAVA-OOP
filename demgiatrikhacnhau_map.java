import java.util.*;
// dem so luong  gia tri khac nhau trong mang=> size()
public class demgiatrikhacnhau_map {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for( int x:a){
            map.put(x,1);
        }
        System.out.println(map.size());
    }    
}
