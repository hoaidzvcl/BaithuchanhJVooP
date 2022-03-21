import java.util.Scanner;

public class App2103 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tinh chu vi , dien tich HCN");
        System.out.println("2.Nhap vao va hien thi thong tin nguoi");
        System.out.println("3.Nhap vao va hien thi thong tin sinh vien");
        System.out.println("4.Giai phuong trinh bac 2");

        System.out.print("Nhap vao chuong trinh muon chay : ");
        int x = sc.nextInt();

        switch(x){
            case 1:
                HinhChuNhat hcn = new HinhChuNhat();
                hcn.nhapdairong();
                hcn.tinhchuvi();
                hcn.tinhdientich();
                hcn.inchuvidientich();
                break;
            case 2:
                Person id = new Person();
                id.nhapthongtin();
                System.out.println();
                id.inthongtin();
                break;
            case 3:
                SinhVien sv = new SinhVien();
                sv.nhapthongtin();
                System.out.println();
                sv.inthongtin();
                break;
            case 4:
                PTB2 gpt = new PTB2();
                gpt.nhap();
                System.out.println();
                gpt.tinhvainnghiem();
                break;
        }
    }
}
