import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        System.err.println("Dây là lỗi");
//        System.out.println("\u001B[32m hello");
//        System.out.println("\u001B[32m" + "\u001B[31m Chó minh");
        // biến và kiểu dữ liệu
//        kiêu nguyên thủy
//        int number = 10;
//        float fl = 5.9f;
//        double db = 10.0;
//        char ch = 'a';
//        boolean check = true;
////         neu gia tri la chuoi thi dung %s, so nguyen %d
////        so thuc dung %f, cac kieu so khac thi mac dinh %s
//        System.out.printf("\u001B[32m number= %-5d| fl= %5.2f|db = %5.2f| ch = %s| check = %-10s\n",number,fl,db,ch,check);
//        String name = "nguyen van dung";
//        String str = name;
//        name = "nam";
//        Date date = new Date();
//        System.out.println(str);
//        System.out.println("ngay thang hien tai la " + date);
//        System.out.println("họ và tên: " +name);
//        Scanner sc = new Scanner(System.in);// day là may quet dung de nhap du lieu tu man hinh console;
//        // cach dung, nhap chuoi,so, boolean, byte,....
//        System.out.println("hay nhap vao dia chi");
//        String adress = sc.nextLine();
//        System.out.println("dia chi: " + adress);
//        System.out.println("hay nhap vao 1 so");
//        int a = Integer.parseInt(sc.nextLine());// ep kieu
//        System.out.println("so ban vua nhap vao la: " + a);
//        // luu y: khi vua nhap so ma chuyen qua nhap chuoi thi sex bi nuot dong
//        System.out.println("hay nhap vao 1 chuoi");
////        String string = sc.nextLine();
//        // khai bao bien hang
//        final  float PI = 3.14F;

            // biểu thúc điều kiện:
//         toán tử 3 ngôi;
//        (biểu thức logic) ? (nếu đúng) : (nếu sai)
        //kiểm tả 1 số ng dùng nhập vào là chẵn hay lẻ
//        Scanner sc = new Scanner(System.in);
//        System.out.println("hãy nhập vào 1 số");
//        int number = sc.nextInt();
//        String rs = (number%2==0) ? "Số chẵn" : "so lẻ";
//        System.out.println(rs);

//        if(false) {
//            System.out.println("thuc hien if");
//        }
//        // if...else
//        if ()


//        Bặc thang
        float dtb  =7.0f;
        if (dtb<5.0 ){
            System.out.println("yeeu");
        } else  if( dtb< 6.5){
            System.out.println("tb");
        } else  if( dtb < 7.5){
            System.out.println("kha");
        } else {
            System.out.println("gioi");
        }

//       Swich case:

        // hien thi so du chia het cho 5;
        int number = 1977;
        int mod = number%5;
        switch (mod){
            case 0:
                System.out.println("chia het");
                break;
            case 1:
                System.out.println("dư 1");
                break;
            case 2:
                System.out.println("du 2");
                break;
            case 3:
                System.out.println("du3");
                break;
            case 4:
                System.out.println("du 4");
                break;
            default:

        }
    }
}