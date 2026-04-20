import java.util.*;
public class strcat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        char[] c=new char[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++) c[k++]=a[i];
        for(int i=0;i<b.length;i++) c[k++]=b[i];
        System.out.println(new String(c));
    }
}
    
