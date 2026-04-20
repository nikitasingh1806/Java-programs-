import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int key=sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==key){ System.out.println(m); return; }
            else if(a[m]<key) l=m+1;
            else r=m-1;
        }
        System.out.println(-1);
    }
}
    