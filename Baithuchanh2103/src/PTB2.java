import java.util.Scanner;
import java.lang.Math;

public class PTB2 {
    double a, b, c, delta, x1, x2;

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao a : ");
        a = sc.nextDouble();
        System.out.print("Nhap vao b : ");
        b = sc.nextDouble();
        System.out.print("Nhap vao c : ");
        c = sc.nextDouble();
        delta = (b * b) - (4 * a * c);
    }

    void tinhvainnghiem(){
        if(delta > 0){
            x1 = ((-b + Math.sqrt(delta)) / (2*a));
            System.out.println("x1 = " + x1);
            x2 = ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("x2 = " + x2);
        }
        else if(delta < 0){
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep x = " + x1);
        }
        else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }

}
