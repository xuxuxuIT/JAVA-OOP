import java.util.*;
// TreeSet: liet ke theo thu tu tang dan, LinkedHashSet: liet ke theo thu tu xuat hien
public class Lietketutrongxau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String []a=s.trim().split("\\s+");
        TreeSet<String> ts= new TreeSet<>();
        LinkedHashSet<String> lk = new LinkedHashSet<>();
        for( String x: a){
            ts.add(x);
            lk.add(x);
        }
        for(String x:ts){
            System.out.print(x+" ");
        }
        System.out.println("");
        for( String x: lk){
            System.out.print(x+" ");
        }
    }
}
