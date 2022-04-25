package person;
import java.util.Scanner;

public class Student extends Person{
    public int msv;
    public String khoa;
    public float tienTro;

    public void nhapMsv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma sinh vien : ");
        msv = sc.nextInt();
    }

    public void nhapTenKhoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao khoa đang hoc : ");
        khoa = sc.nextLine();
    }

    public void nhapTienTro(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tien tro : ");
        tienTro = sc.nextFloat();
    }

    public void inThongTinSv(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Msv : " + msv);
        System.out.println("Khoa : " + khoa);
        System.out.println("Tien tro : " + tienTro);
    }
}
