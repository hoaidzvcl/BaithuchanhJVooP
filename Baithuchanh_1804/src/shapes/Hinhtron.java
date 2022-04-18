package shapes;
import java.util.Scanner;

public class Hinhtron extends Hinhhoc{
    public float bk;

    public Hinhtron(){
        ten = "Hinh Tron";
    }

    public void nhapBanKinh(){
        System.out.print("Nhap ban kinh : ");
        Scanner sc = new Scanner(System.in);
        bk = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = 2 * PI * bk;
    }
    public void tinhDienTich(){
        dienTich = PI * bk * bk;
    }
}
