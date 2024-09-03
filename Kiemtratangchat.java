import java.util.*;
public class Kiemtratangchat {
    public static boolean tang(ArrayList<Integer>a){
        for( int i=1;i<a.size()-1;i++){
            if(a.get(i+1)<=a.get(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        for( int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        if(tang(a)) System.out.println("YES");
        else System.out.println("NO");
    }    
}
