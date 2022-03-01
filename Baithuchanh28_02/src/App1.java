import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so a : ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b : ");
        int b = sc.nextInt();

        if(a > 0 && b > 0){
            System.out.print("Uoc cua so a la : ");
            for(int i = 1;i <= a;i++){
                if(a % i == 0){
                    System.out.print(" " + i);
                }
            }
            System.out.println();
            System.out.print("Uoc cua so b la : ");
            for(int i = 1;i <= b;i++){
                if(b % i == 0){
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
        int ucln = 1;
        for(int i = 1;i <= a;i++){
            for(i = 1;i <=b;i++){
                if(a % i == 0 && b % i == 0){
                        if(i > ucln){
                            ucln = i;
                       }
                    }
                }
            }
        System.out.println("Uoc chung lon nhat la : " + ucln);
    }
}