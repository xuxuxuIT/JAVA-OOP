
import java.util.*;
// ghep hai xau lai voi nhau tao thanh xau lon nhat
public class Ghepxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []a= new String [n];
        for( int i=0;i<n;i++){
            a[i]=sc.next();           
        }
        Arrays.sort(a, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String res1= o1+o2;
                String res2= o2+o1;
                if(res1.compareTo(res2)>0) return -1;
                else return 1;
            }      
        });
        for(String x:a){
            System.out.print(x);
        }
    }  
}
