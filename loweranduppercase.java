import java.util.*;
public class loweranduppercase {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String lower="",upper="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z') lower+=(char)(ch+32);
            else lower+=ch;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') upper+=(char)(ch-32);
            else upper+=ch;
        }
        System.out.println(lower);
        System.out.println(upper);
    }
}
    
