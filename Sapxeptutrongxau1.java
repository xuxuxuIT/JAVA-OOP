import java.util.*;
// sxep tu co chieu dai tang dan
// co cung cd roi thi tu nao xuat hien truoc in truoc(Collection.sort)
public class Sapxeptutrongxau1 {
    public static boolean tn(String s){
        StringBuilder sb= new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String []a= s.trim().split("\\s+");
        ArrayList<String>b= new ArrayList<>();
        HashSet<String> se= new HashSet<>();
        for(String x: a){
            if(tn(x) && !se.contains(x)){
                b.add(x);
                se.add(x);
            }
        }
        Collections.sort(b,new Comparator<String>(){
            @Override
            public int compare(String t, String t1) {
                return t.length()-t1.length();  
            }           
        });
        for( String x: b){
            System.out.print(x+" ");
        }
    }
}
