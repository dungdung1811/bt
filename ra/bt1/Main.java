package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String name = sc.nextLine();
        System.out.println("\u001B[32m Hello " + name);
    }
}
