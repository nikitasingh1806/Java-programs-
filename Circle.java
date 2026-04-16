import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double circum = 2 * Math.PI * r;
        System.out.println(area);
        System.out.println(circum);
    }
}
    

