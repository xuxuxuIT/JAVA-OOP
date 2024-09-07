import java.util.*;
// tim xau con co dd max, co cung dd thi in ki tu lon nhat
public class Xaucon_dainhat {
    public static String find(String s) {
        Scanner sc= new Scanner(System.in);
        int maxlen=1;
        int currentlen=1;
        String a=s.substring(0,1);
        for( int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentlen++;
            }else{
                if(currentlen>maxlen){
                    maxlen=currentlen;
                    a=s.substring(i-currentlen,i);
                }
                currentlen=1;
            }
        }  
        if(currentlen>maxlen){
            a=s.substring(s.length()-currentlen);
        }
        return a;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(find(s));
    }
}
