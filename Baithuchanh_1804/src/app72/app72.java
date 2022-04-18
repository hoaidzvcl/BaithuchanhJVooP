package app72;

public class app72 {
    public static void main(String[] args){
        sinhvien sv1 = new sinhvien();
        sinhvien sv2 = new sinhvien();

        sv1.setTen("");
        sv1.setTuoi(23);

        sv2.setTen("Peter");
        sv2.setTuoi(17);

        System.out.println("Sinh vien 1 co ten: " + sv1.getTen() + ", tuoi: " + sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten: " + sv2.getTen() + ", tuoi: " + sv2.getTuoi());
    }
}