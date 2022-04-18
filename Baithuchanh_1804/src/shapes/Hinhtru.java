package shapes;
import java.util.Scanner;

public class Hinhtru extends Hinhtron{
    public float chieuCao;

    public Hinhtru(){
        ten = "Hinh tru";
    }

    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.print("Nhap chieu cao : ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
