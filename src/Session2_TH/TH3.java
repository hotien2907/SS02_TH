package Session2_TH;

import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap vao nam : ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("la nam nhuan", year);
        } else {
            System.out.printf("la nam ko nhuan", year);
        }
    }
}
