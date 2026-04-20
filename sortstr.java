import java.util.*;
public class sortstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        for(int i=0;i<n;i++) s[i]=sc.nextLine();
        Arrays.sort(s);
        for(String str:s) System.out.println(str);
    }
}
    

