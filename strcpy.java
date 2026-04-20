import java.util.*;
public class strcpy {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] src=s.toCharArray();
        char[] dest=new char[src.length];
        for(int i=0;i<src.length;i++) dest[i]=src[i];
        System.out.println(new String(dest));
    }
}
    
