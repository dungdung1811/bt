package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiêu dài");
        int chieuDai = sc.nextInt();
        System.out.println("Nhập vào chiều rộng");
        int chieuRong = sc.nextInt();
        int chuvi = 2 *(chieuDai + chieuRong);
        int s = chieuDai*chieuRong;
        System.out.println("Chu vi hình chữ nhât: " + chuvi);
        System.out.println("Diện tích hình chữ nhật là: " + s);

    }
}
