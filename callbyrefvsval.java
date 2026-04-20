class Test {
    int x;
}

public class Main { // '
    static void changeVal(int a) {
        a = 50; // Changes local copy only
    }

    static void changeRef(Test t) {
        t.x = 50; // Accesses the heap memory via the reference copy
    }

    public static void main(String[] args) {
        int a = 10;
        changeVal(a);
        System.out.println("Value of a: " + a);

        Test t = new Test();
        t.x = 10;
        changeRef(t);
        System.out.println("Value of t.x: " + t.x);
    }
}