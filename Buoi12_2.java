import java.util.*;
// in so+ tan suat theoo thu tu tang dan
public class Buoi12_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []a= new int[n];
        HashMap<Integer,Integer> map= new HashMap<>();
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(map.containsKey(a[i])){
                int fre=map.get(a[i]); // lay tsuat hien tai
                fre++;
                map.put(a[i],fre);
            }else{
                map.put(a[i], 1);// gap lan dau
            }
        }  
        Arrays.sort(a);
        for( int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                System.out.println(a[i]+" "+map.get(a[i]));
                map.remove(a[i]);
            }
        }
    } 
}
