package person;
import java.util.Scanner;

public class Employee extends Person {
    public int mnv;
    public String cty;
    public float soNgayLam;

    public void nhapmnv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma nhan vien : ");
        mnv = sc.nextInt();
    }

    public void nhapTenCty(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten cong ty : ");
        cty = sc.nextLine();
    }

    public void nhapNgayLam(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so ngay lam : ");
        soNgayLam = sc.nextFloat();
    }

    public void inThongTinNv(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Mnv : " + mnv);
        System.out.println("Ten cong ty : " +  cty);
        System.out.println("So ngay lam : " + soNgayLam);
    }
}
