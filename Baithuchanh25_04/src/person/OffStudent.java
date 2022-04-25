package person;
import java.util.Scanner;
 
public class OffStudent extends Student{
    public int hocPhiHocOff;

    public void nhapChiPhiHocOff(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao hoc phi hoc off : ");
        hocPhiHocOff = sc.nextInt();
    }

    public void inChiPhiHocOff(){
        System.out.print("Tong chi phi : " + (hocPhiHocOff + tienTro));
    }
}
