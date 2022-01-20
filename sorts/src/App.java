import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Random rand = new Random();

        int size = 10;

        UnOrderedArray ua1  = new UnOrderedArray(size); //selection sort

        UnOrderedArray ua2 = new UnOrderedArray(size);

        ua2.addLast(12);
        ua2.addLast(34);
        ua2.addLast(12);
        ua2.addLast(67);
        ua2.addLast(0);
        ua2.addLast(26);
        ua2.addLast(57);
        ua2.addLast(98);
        ua2.addLast(5);
        ua2.addLast(16);

        for (int x = 0; x < size; x++){
            int val = rand.nextInt(50);
            ua1.addLast(val);
        }


        // ua1.listItems();

        // ua1.selectionSort();

        // ua1.listItems();

        ua2.listItems();

        ua2.insertionSort();

        ua2.listItems();

        System.out.println(ua2.binarySearch(16));


        

    }
}
