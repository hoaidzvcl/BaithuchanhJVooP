import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = 1 , max = 0;

        while(n != 0){
            System.out.print("Nhap vao so n : ");
            n = sc.nextFloat();
            if(n > max){
                max = n;
            }
        }
        System.out.println("So lon nhat la : " + max);
    }
}