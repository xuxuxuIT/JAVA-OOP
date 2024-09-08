import java.util.*;
// aa BB cc DD EE =>3
public class Buoi15_demtuinhoa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String []a= s.split("\\s+");
        int cnt=0;
        for( String x: a){
            if(x.equals(x.toUpperCase())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
