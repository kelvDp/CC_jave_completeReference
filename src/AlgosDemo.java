import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgosDemo {
    // Demonstrate various built in collection algorithms

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // create a reverse order comparator
        Comparator<Integer> r = Collections.reverseOrder();

        // sort list by using the comparator
        Collections.sort(ll, r);

        System.out.print("List sorted in reverse: ");
        for (int i : ll) {
            System.out.println(i + " ");
        }

        System.out.println();

        // Shuffle list
        Collections.shuffle(ll);

        // Display randomized list
        System.out.print("List shuffled: ");
        for (int i : ll) {
            System.out.println(i + " ");
        }

        System.out.println();
        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}
