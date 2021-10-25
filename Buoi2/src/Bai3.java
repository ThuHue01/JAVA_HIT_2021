import java.util.Scanner;

public class Bai3 {
    public static boolean kyTuSo(String s)
    {
        for (int i = 0; i < s.length(); i ++)
            if (s.charAt(i) < '0' && s.charAt(i) > '9')
                return false;
            return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String s = scan.nextLine();
        char kyTu;
        int sum = 0, d = 0;
        if (kyTuSo(s)) System.out.println("True");
        else System.out.println("False");
        for (int i = 0; i < s.length(); i ++)
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                d++;
            }
        System.out.println("Trung bình cộng các chữ số có trong chuỗi là: " + (float)sum/d);

    }
}
