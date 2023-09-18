package Session2_TH;

import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        // Viết mã của bạn ở đây
        Scanner scanner = new Scanner(System.in);
        double canNang, chieuCao, bmi;
        System.out.print("Cân nặng của bạn (kilogram):");
        canNang = scanner.nextDouble();

        System.out.print("Chiều cao của bạn (meter):");
        chieuCao = scanner.nextDouble();
        bmi = canNang / Math.pow(chieuCao, 2);
        System.out.printf("%-20s%s", "Chỉ số BMI", "Diễn giải\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì");
    }
}