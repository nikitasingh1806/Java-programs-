import java.util.*;
public class funcnumber {

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++) if(n%i==0) return false;
        return true;
    }
    static boolean isArmstrong(int n){
        int sum=0,temp=n;
        while(n>0){
            int d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        return sum==temp;
    }
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++) if(n%i==0) sum+=i;
        return sum==n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));
        System.out.println(isPerfect(n));
    }
}
    
