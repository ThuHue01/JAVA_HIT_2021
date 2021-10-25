import java.util.Scanner;
import java.lang.Math;

public class Bai2 {
    static int n;
    static int[] a = new int[1003];
    static int[] b = new int[1003];//mảng thêm
    static int[] c = new int[1003];//mảng xóa
    static int[] d = new int[1003];//mảng đảo ngược
    public static void chen(int[] a, int x, int k)
    {
        n++;
        for(int i = n; i >= k; i--)
            a[i] = a[i-1];
        a[k] = x;
    }
    public static void xoa(int[] a, int k)
    {
        if (k < 1) k = 1;
        else if(k > n) k = n;
        for (int i = k; i < n; i++)
            a[i] = a[i + 1];
        n --;
    }
    public static int snt(int x)
    {
        if (x < 2) return 0;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) return 0;
            return 1;
    }
    public static void xuat(int[] a, int n)
    {
        for (int i = 1; i <= n; i++)
            System.out.println(a[i]);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scan.nextInt();
        System.out.println("1. Nhap mang: ");
        for (int i = 1; i <= n; i++)
        {
            a[i] = scan.nextInt();
            b[i] = a[i];
            c[i] = a[i];
            d[i] = a[i];
        }

        System.out.println("2. Hien thi mang vua tao: ");
        xuat(a, n);

        System.out.println("3. Them 1 phan tu vao vi tri k bat ky");
        System.out.println("Them so x: ");
        int x = scan.nextInt();
        System.out.println("vao vi tri k:");
        int kt = scan.nextInt();
        chen(b, x, kt);
        System.out.println("Mang A sau khi chen them so x vao vi tri k bat ky: ");
        xuat(b, n);
        n --;//trả về giá trị n ban đầu

        System.out.println("4. Xóa 1 phần tử tại vị trí k bất kỳ");
        System.out.println("Nhap vao vi tri k can xoa: ");
        int kx = scan.nextInt();
        xoa(c, kx);
        System.out.println("Mang A sau khi xoa 1 phan tu tai vi tri k: ");
        xuat(c, n);
        n ++;

        System.out.println("5. Đảo ngược mảng");
        int i = 1, j = n;
        while (i < j)
        {
            int tg = d[i];
            d[i] = d[j];
            d[j] = tg;
            i ++; j --;
        }
        xuat(d, n);

        System.out.println("6. Hiển thị phần tử a[1] la: " + a[1]);
        System.out.println("Và các số chia hết cho a[1] là: ");
        for (int k = 2; k <= n; k++)
            if (a[k] % a[1] == 0)
                System.out.println(a[k]);

        System.out.println("7. Tổng các số nguyên tố có trong mảng");
        int s = 0;
        for (int t = 1; t <= n; t++)
            if (snt(a[t]) == 1) s += a[t];
        System.out.println(s);
    }
}
