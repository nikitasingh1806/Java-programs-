import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),rev=0,temp=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}