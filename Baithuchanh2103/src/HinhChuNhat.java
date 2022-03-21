import java.util.Scanner;
public class HinhChuNhat {
    float dai, rong, chuVi , dienTich;

    void nhapdairong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai : ");
        dai = sc.nextFloat();
        System.out.print("Nhap chieu rong : ");
        rong = sc.nextFloat();
    }
    void tinhchuvi(){
        chuVi = (dai + rong)/2;
    }
    void tinhdientich(){
        dienTich = dai * rong;
    }
    void inchuvidientich(){
        System.out.println("Chu vi cua hinh chu nhat la : " + chuVi);
        System.out.println("Dien tich cua hinh chu nhat la : " + dienTich);
    }
}
