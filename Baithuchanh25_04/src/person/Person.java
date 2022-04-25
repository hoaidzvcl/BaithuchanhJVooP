package person;
import java.util.Scanner;

public class Person {
    public String name;
    public int age;

    public void nhapTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten : ");
        name = sc.next();
    }

    public void nhapTuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tuoi : ");
        age = sc.nextInt();
    }

    public void inThongTinNguoi(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
    }

}