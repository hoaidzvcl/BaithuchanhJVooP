import java.util.Scanner;
import java.util.ArrayList;

public class slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Nhap so phan tu cua ArrayList : ");
        int n = sc.nextInt();

        for(int i = 0;i < n;i++){
            System.out.print("Nhap phan tu thu " + i + ": ");
            number = sc.nextInt();
            arrListInteger.add(number);
        }

        int max = arrListInteger.get(0);
        
        for(int i = 1;i < arrListInteger.size();i++){
            if(arrListInteger.get(i).compareTo(max) > 0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger la " + max);
    }
}
