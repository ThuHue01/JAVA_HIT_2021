import java.util.Scanner;

public class Bai1 {
    public static int findMax(int a, int b, int c)
    {
        int fmax = a;
        if (b > fmax) return b;
        if (c > fmax) return c;
        return a;
    }
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        System.out.println("So lon nhat trong 3 so la: " + findMax(a, b, c) );
    }
}
