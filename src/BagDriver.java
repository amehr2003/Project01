package src;


import org.w3c.dom.Node;

public class BagDriver {
    public static void main(String[] args)
    {
        /**
         * implementation example for resizeableArrayBag
         * implements methods union, difference, and intersection
         */
        ResizeableArrayBag<Integer> ArrayBag1 = new ResizeableArrayBag<>(2);
        ArrayBag1.add(3);
        ArrayBag1.add(7);
        ResizeableArrayBag<Integer> ArrayBag2 = new ResizeableArrayBag<>(2);
        ArrayBag2.add(8);
        ArrayBag2.add(9);

        /**
         * implementation example for linkedBag
         * implements methods union, difference, and intersection
         */

        Node<Object> headNode = new Node(3, null);
        LinkedBag<Object> intLinkedBag = new LinkedBag<Object>(headNode);
        intLinkedBag.add(4);

        Node<Object> anotherHeadNode = new Node(5, null);
        LinkedBag<Object> intLinkedBag2 = new LinkedBag<Object>(anotherHeadNode);
        intLinkedBag2.add(6);


    }

}
