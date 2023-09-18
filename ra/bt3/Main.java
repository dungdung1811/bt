package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập Số nguyên âm tối đa 3 chữ số");
        int number = sc.nextInt();
        if (number >= 0 && number < 1000) {
            String result = convertToWords(number);
            System.out.println(result);


        }
    };

    public static String convertToWords(int number){
        if(number == 0){
            return  "zero";
        }

        String result = "";

        if(number >= 100){
            result += convertDigit(number/100) + "hunderd ";
            number %= 100;
            if(number != 0){
                result += "and";
            }
        }
        if (number >= 20){
            result += convertTens(number/10);
            number %= 10;
            if(number != 0){
                result += " ";

            }
        }
        if (number > 0 && number < 10){
            result += convertDigit(number);
        } else if (number >= 11 && number <= 19) {
            result += convertTeens(number -10);
        }
        return result;

    }


     public static String convertDigit(int digit){
        switch (digit){
            case 1: return "one ";
            case 2: return "tow ";
            case 3: return "three ";
            case 4: return "four ";
            case 5: return "five ";
            case 6: return "six ";
            case 7: return "seven ";
            case 8: return "eight ";
            case 9: return "nice ";
            default: return " ";
        }
     }
    public static String convertTens(int tens){
        switch (tens){

            case 2: return "twenty ";
            case 3: return "thirty ";
            case 4: return "forty ";
            case 5: return "fifty ";
            case 6: return "sixty ";
            case 7: return "seventy ";
            case 8: return "eighty ";
            case 9: return "ninety ";
            default: return " ";
        }
    }
    public static String convertTeens(int teens){
        switch (teens){

            case 1: return "eleven ";
            case 2: return "twelve ";
            case 3: return "thirteen ";
            case 4: return "fourteen ";
            case 5: return "fifteen ";
            case 6: return "sixteen ";
            case 7: return "seventeen ";
            case 8: return "eighteen ";
            case 9: return "nineteen ";
            default: return " ";
        }
    }
}

