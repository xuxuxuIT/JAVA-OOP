import java.util.*;
//linkedhashmap: in theo thu tu xuat hien
public class Tansuat_lkhmap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String [] a= s.trim().split("\\s+");
        LinkedHashMap<String,Integer> lm= new LinkedHashMap<>();
        for( String x: a){
            if(lm.containsKey(x)==false){
                lm.put(x,1);
            }else{
                int fre= lm.get(x);
                lm.put(x,fre+1);              
            }
        }
        for (Map.Entry<String, Integer> entry : lm.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);         
        }
    }   
}
