import java.util.Scanner;

public class App40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ngay : ");
        int x = sc.nextInt();

        switch(x){
            case 0 :
                System.out.println("Hom nay là chu nhat.");
                break;
            case 1 :
                System.out.println("Hom nay là thu hai.");
                break;
            case 2 :
                System.out.println("Hom nay là thu ba.");
                break;
            case 3 :
                System.out.println("Hom nay là thu tu.");
                break;
            case 4 :
                System.out.println("Hom nay là thu nam.");
                break;
            case 5 :
                System.out.println("Hom nay là thu sau.");
                break;
            case 6 :
                System.out.println("Hom nay là thu bay.");
                break;
            default :
                System.out.print("So khong hop le .");
        }
    }
}
