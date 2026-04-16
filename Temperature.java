import java.util.*;
public class Temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        double c2 = (f - 32) * 5 / 9;
        System.out.println(f);
        System.out.println(c2);
    }
}