package person;
import java.util.Scanner;
 
public class OnlStudent extends Student{
    public int hocPhiHocOnl;

    public void nhapChiPhiHocOnl(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao hoc phi hoc onl : ");
        hocPhiHocOnl = sc.nextInt();
    }

    public void inChiPhiHocOnl(){
        System.out.print("Tong chi phi : " + (hocPhiHocOnl + tienTro));
    }
}
