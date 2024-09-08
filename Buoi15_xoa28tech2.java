import java.util.*;
public class Buoi15_xoa28tech2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String res=" ";
        for( char x : s.toCharArray()){
            if(!((x=='2') ||(x=='8') || (x=='t')||(x=='e')||(x=='c')||(x=='h'))){
                res += x;
            }
        }
        if(res.length()==0){
            System.out.println("EMPTY");
        }else{
            System.out.println(res);
        }     
    }
}
