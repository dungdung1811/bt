package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[34m Nhập vào 1 số nguyên từ 0-9");
        int input = sc.nextInt();
        sc.nextLine();

        if (input >= 0 && input < 10) {
            String result = convertToWords(input);
            System.out.println(result);
        } else {
            System.out.println("Số vượt quá khả năng của chương trình.");
        }
    }
    public static String convertToWords(int number) {
        switch (number) {
            case 0: return "không";
            case 1: return "một";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bốn";
            case 5: return "năm";
            case 6: return "sáu";
            case 7: return "bảy";
            case 8: return "tám";
            case 9: return "chín";
            default: return " ";
        }
    }

}
