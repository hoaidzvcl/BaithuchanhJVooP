import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrListChar = new ArrayList<>();

        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
        
        ListIterator<Character> ListIterator = arrListChar.listIterator();
        
        System.out.println("Cac phan tu co trong arrListChar la : ");
        while(ListIterator.hasNext()){
            System.out.print(ListIterator.next() + "\t");
        }
    }
}
