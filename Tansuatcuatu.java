import java.util.*;
public class Tansuatcuatu {
// tremap: liet ke theo thu tu tang dan
// linkedhashmap: liet ke theo thu tu xuat hien
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String [] a= s.trim().split("\\s+");
        TreeMap<String, Integer> tm= new TreeMap<>();
        for( String x:a){
            if(tm.containsKey(x)==false){
                tm.put(x,1);
            }else{
                int fre=tm.get(x);
                tm.put(x,fre+1);
            }
        }
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println( key+" "+value);
            
        }
    }
}