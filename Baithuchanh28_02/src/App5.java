import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong : ");
        int number = sc.nextInt();

        if(number > 0){
            int sum = 0;
            for(int i = 1;i < number;i++){
                if(number % i == 0){
                    sum += i;
                }
            }
            if(sum == number){
                System.out.println(number + " la so hoan thien");
            }
        }
    }
}
