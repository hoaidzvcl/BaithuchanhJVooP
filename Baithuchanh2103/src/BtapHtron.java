import java.util.Scanner;

public class BtapHtron {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        ht.Nhapvaor();
        ht.tinhChuvi();
        ht.tinhDientich();
        ht.inChuvi();
        System.out.println();
        ht.inDientich();
    }

    
}
class HinhTron {
    final float PI = 3.14f;
    float BanKinh;
    float Chuvi;
    float Dientich;

    void Nhapvaor(){
        System.out.print("Nhap vao ban kinh : ");
        Scanner sc = new Scanner(System.in);
        BanKinh = sc.nextInt();
    }
    void tinhChuvi(){
        Chuvi = 2*BanKinh*PI;
    }
    void tinhDientich(){
        Dientich = PI * BanKinh * BanKinh;
    }
    void inChuvi(){
        System.out.print("Chu vi cua hinh tron la : " + Chuvi);
    }
    void inDientich(){
        System.out.print("Dien tich cua hinh tron la : " + Dientich);
    }
}