import java.util.Scanner;

public class Person {
    String PersonID , PersonName ,Gender, Address;

    void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao personid : ");
        PersonID = sc.nextLine();
        System.out.print("Nhap vao personname : ");
        PersonName = sc.nextLine();
        System.out.print("Nhap vao gioi tinh: ");
        Gender = sc.nextLine();
        System.out.print("Nhap vao address : ");
        Address = sc.nextLine();
    }
    
    void inthongtin(){
        System.out.println("Pername : " + PersonName);
        System.out.println("Personid cua " + PersonName + " la : " + PersonID);
        System.out.println("Gioi tinh cua " + PersonName + " la : " + Gender);
        System.out.println("Address cua " + PersonName + " la : " + Address);
    }
}
