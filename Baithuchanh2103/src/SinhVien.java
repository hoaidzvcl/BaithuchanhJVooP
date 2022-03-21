import java.util.Scanner;

public class SinhVien {
    String hoTen, gioiTinh, diaChi;
    int msv, ngaySinh;

    void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho va ten sinh vien : ");
        hoTen = sc.nextLine();
        System.out.print("Nhap vao ma sinh vien : ");
        msv = sc.nextInt();
        System.out.print("Nhap vao gioi tinh cua sinh vien : ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap vao dia chi : ");
        diaChi = sc.nextLine();
        System.out.print("Nhap vao ngay sinh : ");
        ngaySinh = sc.nextInt();
    }

    void inthongtin(){
        System.out.println("Ho va ten : " + hoTen);
        System.out.println("Ma sinh vien : " + msv);
        System.out.println("Gioi tinh : " + gioiTinh);
        System.out.println("Dia chi : "+ diaChi);
        System.out.println("Ngay sinh : " + ngaySinh);
    }
}
