import java.util.Scanner;

public class App30 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap vao so n : ");
       int n = sc.nextInt();
       int sum = 0;
       int soDu = 0;
       
       while(n > 0){
            soDu = n % 10;
            n = n / 10;
            sum += soDu;
       }

       System.out.println("Tong la : " + sum);

    }
}
