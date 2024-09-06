import java.util.*;
public class max_min_fre_cuatu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String[] a= s.trim().split("\\s+");
        TreeMap<String,Integer>b= new TreeMap<>();
        for( String x: a){
            if(b.containsKey(x)==false){
                b.put(x, 1);
            }else{
                b.put(x,b.get(x)+1);
            }
        } 
        int max_fre=0, min_fre=(int)1e9;
        String max_val="a", min_val="a";
        for (Map.Entry<String, Integer> entry : b.entrySet()) {
            String key = entry.getKey();
            Integer fre = entry.getValue();
            if(fre>max_fre){
                max_val=key;
                max_fre=fre;
            }
            if(fre<=min_fre){
                min_val=key;
                min_fre=fre;
            }          
        }
        System.out.println(min_val+" "+min_fre);
        System.out.println(max_val+" "+max_fre);
    } 
}
