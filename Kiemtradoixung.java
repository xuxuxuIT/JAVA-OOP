import java.util.*;
public class Kiemtradoixung {
    public static boolean  doiXung (ArrayList<Integer>a){
        int l=0,r=a.size()-1;
        while (l<=r){
            if(a.get(l) != a.get(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>a= new ArrayList<>();
        for( int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        if(doiXung(a)) System.out.println("YES");
        else System.out.println("NO");
    }
    
}
