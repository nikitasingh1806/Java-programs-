import java.util.*;
public class removechar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)) res+=ch;
        }
        System.out.println(res);
    }
}
    
