import java.util.*;
//4321006710=>0001123467=>1123467
public class Buoi15_xulyso0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        char[] a= s.toCharArray();
        Arrays.sort(a);
        int idx=0;
        while(idx<a.length && a[idx]=='0'){
            idx++;
        }
        for( int i=idx;i<a.length;i++){
            System.out.print(a[i]);
        }
    }   
}
