package person;

public class FullTimeEmployee extends Employee{
    public float luongFullTime;
    public float luong1h = 100;

    public void inLuongFullTime(){
        System.out.print("Luong nhan vien trong " + soNgayLam  + " ngay lam la : " + (soNgayLam * luong1h * 24));
    }
}
