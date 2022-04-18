package shapes;
import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat{
    public float canh;
    
    public Hinhvuong(){
        ten = "Hinh Vuong";
    }

    public void nhapCanh(){
        System.out.print("Nhap canh : ");
        Scanner sc = new Scanner(System.in);
        canh = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = canh * 4;
    }
    public void tinhDienTich(){
        dienTich = canh * canh;
    }
}
