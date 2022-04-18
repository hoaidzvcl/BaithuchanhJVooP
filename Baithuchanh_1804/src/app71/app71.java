package app71;

public class app71 {
    public static void main(String[] args){
        Htron htron = new Htron();

        htron.setBanKinh(5);
        
        float chuVi = htron.tinhChuVi();
        float dienTich = htron.tinhDienTich();

        System.out.println("Chu vi : " + chuVi);
        System.out.println("Dien tich : " + dienTich);
    }
}
