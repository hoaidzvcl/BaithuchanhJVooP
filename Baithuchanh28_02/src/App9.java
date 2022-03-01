import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        int n = sc.nextInt();
        int soDu;

        if(n > 0){
            System.out.print("So sau khi bi dao nguoc la : ");
            do{
                soDu =  n % 10;
                System.out.print(soDu);
                n = n / 10;
            }while(n % 10 != 0);
        }
    }
}