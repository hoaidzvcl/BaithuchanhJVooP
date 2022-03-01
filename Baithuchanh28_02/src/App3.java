import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        int number = sc.nextInt();

        if(number > 0){
            int sum = 0;// biến đếm số lần chia hết cho i
            for(int i = 2;i < number;i++){
                if(number % i == 0){
                    sum++;
                }
            }
            if(sum > 0){
                System.out.println(number + " khong phai la so nguyen to.");
            }
            else{
                System.out.println(number + " la so nguyen to.");
            }
        }
    }
}