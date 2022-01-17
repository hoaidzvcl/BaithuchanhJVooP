import java.util.Scanner;
import java.lang.math;

public class App2 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Giai phuong trinh bac 2 : ax2 + bx + c = 0");
       System.out.print("Nhap vao a , b , c : ");
       double a = sc.nextDouble();
       double b = sc.nextDouble();
       double c = sc.nextDouble();
       double delta = b*b - (4*a*c);
       double x1;
       double x2;
       double x;
       System.out.println("Delta = " + delta);
       if(delta > 0){
            System.out.println("Phuong trinh có 2 nghiem la x1 va x2");
            x1 =((-b + Math.sqrt(delta)) / (2*a));
            System.out.println("x1 = " + x1);
            x2 =((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("x2 = " + x2);
       }
       else if(delta < 0){
            x = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep x = " + x);
       }
       else{
           System.out.println("Phuong trinh vo nghiem");
       }
    }
}
