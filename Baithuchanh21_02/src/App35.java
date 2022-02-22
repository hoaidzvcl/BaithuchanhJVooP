import java.util.Scanner;

public class App35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 2 so a va b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b){
            System.out.println("So nho nhat la : " + b);
        }
        else{
            System.out.println("So nho nhat la : " + a);
        }
    }
}
