import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = 1, number = 0;

        while(n != 0){
            System.out.print("Nhap vao so n : ");
            n = sc.nextFloat();
            if(n % 5 == 0 && n > number){
                number = n;
            }
        }
        System.out.println("So lon nhat trong cac so chia het cho 5 la : " + number);
    }
}