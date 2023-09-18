package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[32m Nhập vào một số nguyên");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println( number + "\u001B[34m chia hết cho cả 3, 5");

        } else if (number % 3 == 0) {
            System.out.println(number + "\u001B[34m Chỉ chia hết cho 3");
        } else if (number % 5 == 0) {
            System.out.println(number + "\u001B[34m Chỉ chia hết cho 5");
        } else {
            System.out.println(number + "\u001B[34m không chia hết cho 3,5");
        }
    }
}
