package collections2.example;

import java.util.*;

public class Main {

    // Array -- constant size, very fast
    // ArrayList -- size is flexible, can insert between,can remove, can random-access (uses array, and doubles it)
    // LinkedList -- can point to start. then can move forward only. can remove/ add items. does not require an array
    // Queue -- when inserting item will be inserted at the end. when poping out item will pop out from the begining
    // Set -- no duplications
    // SortedSet --0 no duplication always sorted
    // HashMap
    // stack
    // Tree

    public static void main(String[] args) {

        LinkedList ml = new LinkedList();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(new MyNode<>(3));
        linkedList.root.next = new MyNode<>(10);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(80);
        nums.add(-3);
        nums.add(2);
        nums.add(0);

        Iterator<Integer> iter = nums.iterator();

        for (var item: nums) {
            // ERROR! IllegalStateException
            //if (item == 80) {
                //iter.remove();
            //}
            System.out.println(item);
        }

        while (iter.hasNext()) {
            Integer item = iter.next();
            if (item == 80) {
                iter.remove();
            }
            System.out.println(item);
        }

        NameRepository<String> names = new NameRepository<>(new ArrayList<>(List.of("a", "danny", "tania")));
        MyIterator<String> iterator = names.getIterator();
        System.out.println("====================");

        while (iterator.hasNext()) {
            var item = iterator.next();
            if (item.equals("danny")) {
                iterator.remove();
            }
            System.out.println(item);
        }


    }

}

