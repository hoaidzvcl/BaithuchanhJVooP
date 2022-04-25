package person;
import java.util.Scanner;

public class Customer extends Person{
    public int maKH;

    public void nhapMaKH(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma KH : ");
        maKH = sc.nextInt();
    }

    public void inThongTinKH(){
        System.out.println("Ten : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Ma KH : " + maKH);
    }
}
