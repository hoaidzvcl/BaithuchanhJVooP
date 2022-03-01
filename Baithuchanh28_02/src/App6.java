import java.util.Scanner;

public class App6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so nguyen duong : ");
            n = input.nextInt();
        } while (n <= 0);
        for(int i = 1; i <n; i++){
            if(Check(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static boolean Check(int n) {
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum == n;
    }
}
