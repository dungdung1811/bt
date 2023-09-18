package ra.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[42m Nhập vào điểm toán");
        double toan = sc.nextDouble();
        System.out.println("\u001B[44m Nhập vào điểm lý");
        double ly = sc.nextDouble();
        System.out.println("\u001B[41m Nhập vào điểm hóa");
        double hoa = sc.nextDouble();
        System.out.println("\u001B[45m Nhập vào điểm văn");
        double van = sc.nextDouble();
        System.out.println("\u001B[46m Nhập vào điểm tiếng anh");
        double english = sc.nextDouble();
        double sum = toan + ly + hoa + van + english;
        double dtb = sum/5;
        if (dtb >= 5 && dtb < 6.5){
            System.out.println("\u001B[47m Xếp loại trung bình");
        } else if (dtb >= 6.5 && dtb < 8) {
            System.out.println("\u001B[47m Xếp loại Khá");
        } else if (dtb >= 8 && dtb < 9) {
            System.out.println("\u001B[47m Xếp loại Giỏi");
        } else if (dtb >= 9) {
            System.out.println("\u001B[47m Xếp loại Suất Sắc");
        } else {
            System.out.println("\u001B[47m Xếp loại Yếu");
        }

    }
}
