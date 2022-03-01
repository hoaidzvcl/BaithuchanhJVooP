import java.util.Scanner;

public class App47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("Nhap vao so : ");
            int so = sc.nextInt();
            sum += so;
        }while(sum < 100);
        System.out.println("Tong cac so nhap vao la : " + sum);
    }
}
