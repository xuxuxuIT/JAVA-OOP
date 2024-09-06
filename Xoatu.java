import java.util.*;
// xoa cac tu de tao thanh tu yeu cau
public class Xoatu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a="PYTHON";
        int idx=0;
        String s=sc.nextLine();
        for( int i=0;i<s.length() && idx <a.length();i++){
            if(s.charAt(i)==a.charAt(idx)){
                idx++;
            }
        } 
        if(idx==a.length()) System.out.println("YES");
        else System.out.println("NO");
    }   
}
