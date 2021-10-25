import groovy.typecheckers.RegexChecker;

import java.util.Scanner;
import java.lang.String;

public class Bai4 {
    static String s;
    public static String removeCharAt(int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        s = scan.nextLine();
        //xóa khoảng trống
        s = s.replaceAll("\\s\\s+", " ").trim();
        //xóa ký tự số
        for (int i = 0; i < s.length(); i ++)
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                s = removeCharAt(i);
                i--;
            }
            //viết hoa ký tự đầu của mỗi từ
        char[] charArray = s.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++)
        {
            if(Character.isLetter(charArray[i]))
            {
                if(foundSpace)
                {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else
            {
                foundSpace = true;
            }
        }
        s = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + s);
    }
}
