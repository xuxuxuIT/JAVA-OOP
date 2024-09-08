import java.util.*;
// xoa ki tu trong xau => stringbuider =>delete
public class Buoi15_xoa_28tech {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for( int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(c=='2'|| c=='8'||c=='t'||c=='e'||c=='c'||c=='h'){
                sb.deleteCharAt(i);
                i--;
            }          
        } 
        if(sb.length()==0){
            System.out.println("EMPTY");
        }else{
            System.out.println(sb.toString());
        }
    }
}
