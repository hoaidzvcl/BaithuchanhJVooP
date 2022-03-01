import java.util.Scanner;

public class App4 {
    public static boolean Check(int n){
        if(n < 2){
            return false;
        }
        for(int i =2 ; i < Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong :");
        int n = input.nextInt();
         System.out.format("Các số nguyên tố nhỏ hơn %d là: ", n);
        for (int i = 0; i < n; i++) {
            if (Check(i)) {
                System.out.print(i + " ");
            }
        }
    } 
}