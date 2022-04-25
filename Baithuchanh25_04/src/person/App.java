package person;

public class App {
    public static void main(String[] args){
        Person per1 = new Person();
        Student sv1 = new Student();
        OffStudent sv2 = new OffStudent();
        OnlStudent sv3 = new OnlStudent();
        Employee nv1 = new Employee();
        PartTimeEmployee nv2 = new PartTimeEmployee();
        FullTimeEmployee nv3 = new FullTimeEmployee();
        Customer kh1 = new Customer();
        VIPCustomer kh2 = new VIPCustomer();

        System.out.println("Nhap thong tin nguoi");
        per1.nhapTen();
        per1.nhapTuoi();
        per1.inThongTinNguoi();
        System.out.println();

        System.out.println("Nhap thong tin sinh vien hoc off ");
        sv2.nhapTen();
        sv2.nhapMsv();
        sv2.nhapTenKhoa();
        sv2.nhapTienTro();
        sv2.nhapChiPhiHocOff();
        sv2.inThongTinSv();
        sv2.inChiPhiHocOff();
        System.out.println();

        System.out.println("Nhap thong tin sinh vien hoc onl");
        sv3.nhapTen();
        sv3.nhapMsv();
        sv3.nhapTenKhoa();
        sv3.nhapTienTro();
        sv3.nhapChiPhiHocOnl();
        sv3.inThongTinSv();
        sv3.inChiPhiHocOnl();
        System.out.println();

        System.out.println("Nhap thong tin nhan vien lam parttime");
        nv2.nhapTen();
        nv2.nhapTuoi();
        nv2.nhapmnv();
        nv2.nhapTenCty();
        nv2.nhapNgayLam();
        nv2.inThongTinNv();
        nv2.inLuongPartTime();
        System.out.println();

        System.out.println("Nhap thong tin nhan vien fulltime");
        nv3.nhapTen();
        nv3.nhapTuoi();
        nv3.nhapmnv();
        nv3.nhapTenCty();
        nv3.nhapNgayLam();
        nv3.inThongTinNv();
        nv3.inLuongFullTime();
        System.out.println();

        System.out.println("Nhap thong tin kh");
        kh1.nhapTen();
        kh1.nhapTuoi();
        kh1.nhapMaKH();
        kh1.inThongTinKH();
        System.out.println();

        System.out.println("Nhap thong tin kh vip");
        kh2.nhapTen();
        kh2.nhapTuoi();
        kh2.nhapMaKH();
        kh2.inThongTinKH();
        kh2.inUuDai();
        System.out.println();
    }
}
