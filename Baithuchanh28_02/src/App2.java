import java.lang.Math;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao canh a : ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao canh b : ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao canh c : ");
        double c = sc.nextDouble();

        if(a == b && a == c){
            System.out.println("Day la tam giac deu");
        }

        else if(a == b || b == c || c == a){
            System.out.println("Day la tam giac can");
        }

        else if(a == Math.sqrt((b*b)+(c*c))){
            System.out.print("Day la tam giac vuong");
        }
        else if(b == Math.sqrt((a*a)+(c*c))){
            System.out.print("Day la tam giac vuong");
        }
        else if(c == Math.sqrt((b*b)+(a*a))){
            System.out.print("Day la tam giac vuong");
        }

        else {
            System.out.println("Day la tam giac thuong");
        }
    }
}