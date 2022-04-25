package person;

public class PartTimeEmployee extends Employee{
    public float luongPartTime;
    public float luong1h = 50;

    public void inLuongPartTime(){
        System.out.print("Luong nhan vien trong " + soNgayLam  + " ngay lam la : " + (soNgayLam * luong1h * 24));
    }
}
