package dev.reid;

import dev.reid.stk.KurtStack;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        /*
        \
        Given two singly linked lists that intersect at some point, find the intersecting node. Assume the lists are non-cyclical.

For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, return the node with value 8. In this example, assume nodes with the same value are the exact same node objects.

Do this in 0( m + n) time (where m and n are the lengths of the lists) and constant space.
         */
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.add(3);
        l1.add(7);
        l1.add(8);
        l1.add(10);

        l2.add(99);
        l2.add(1);
        l2.add(8);
        l2.add(10);

        for (int i = 0; i < l1.size(); i++)
        {
            for (int x = 0; x < l2.size(); x++)
            {
                if (l1.get(i) == l2.get(x))
                {
                    System.out.println("l1 == l2");
                    i = l1.size() + 1000;
                    x = l2.size() + 1000;
                }
            }
        }

        KurtStack ks = new KurtStack();
        ks.push(1);
        ks.push(2);
        ks.push(3);

        ks.pop();
        ks.max();





     }
}
