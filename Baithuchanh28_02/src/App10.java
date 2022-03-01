import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        int n = sc.nextInt();

        if(n > 0){
            int dem = 0;
            while(n >= 10){
                n /= 10;
                dem++;
            }
            System.out.println("So nguyen duong vua nhap co " + (dem+1) + " so");
        }
    }
}