package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[32m Nhập vào số VNĐ bạn có");
        double vnd = sc.nextDouble();
        double result = vnd/23000;
        System.out.println("\u001B[35msố USD bạn có: " + result + "\u001B[31m USD");
    }
}
