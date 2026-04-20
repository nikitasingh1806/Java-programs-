import java.util.*;
public class rotatearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        k%=n;
        for(int i=0;i<k;i++){
            int t=a[0];
            for(int j=0;j<n-1;j++) a[j]=a[j+1];
            a[n-1]=t;
        }
        for(int x:a) System.out.print(x+" ");
    }
}

