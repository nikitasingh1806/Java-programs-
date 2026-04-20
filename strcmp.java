import java.util.*;
public class strcmp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean eq=true;
        if(s1.length()!=s2.length()) eq=false;
        else{
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    eq=false;
                    break;
                }
            }
        }
        if(eq) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}
    
