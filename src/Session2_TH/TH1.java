package Session2_TH;

import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao so a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao so b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap vao so c: ");
        double c = scanner.nextDouble();
        if(a!=0){
            double x = (c-b)/a;
            System.out.println("Phuong trinh vo so nghiem x = "+x);
        } else {
            if(b==c){
                System.out.println("Phuong trinh vo so nghiem x!");
            } else {
                System.out.println("Phuong trinh Vo nghiem ");
            }
        }
    }
}
