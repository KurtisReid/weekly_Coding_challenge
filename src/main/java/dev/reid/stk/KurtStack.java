package dev.reid.stk;

import java.util.Queue;
//LIFO
public class KurtStack {
     //Integer[] arr = new Integer[0];
     //Integer[] arr = new Integer[0];
     //Integer[] maxStack = new Integer[0];
    private class Node {
        int data;
        Node nlink;
     }
     Node top;
     int max = 0;
     Node maxPlace = new Node();
     int currentPointer = 0;

    public KurtStack(Node n) {
        this.top = n;
        maxPlace = n;
    }

    public KurtStack()
    {
        Node n = new Node();
        n.data = 0;
        n.nlink = null;

        top = n;

    }


    public void push(int val)
    {
        Node temp = new Node();
        temp.data = val;
        temp.nlink = top;
        top = temp;
        if (val > maxPlace.data)
        {
            max = val;
            maxPlace = temp;
        }



    }
    public int pop()
    {
        if (top == null)
        {
            System.out.println("top is null");
            return -1;
        }
        Node temp = top;
        top = top.nlink;
        return temp.data;
    }
    public int max()
    {
        return maxPlace.data;
    }


}
