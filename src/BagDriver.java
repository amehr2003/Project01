package src;


import org.w3c.dom.Node;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagDriver {
    public static void main(String[] args)
    {
        /**
         * implementation example for resizeableArrayBag
         * implements methods union, difference, and intersection
        */

        ResizeableArrayBag<Integer> testUnionArrayBag1 = new ResizeableArrayBag<>(2);
        testUnionArrayBag1.add(6);
        testUnionArrayBag1.add(7);
        ResizeableArrayBag<Integer> testUnionArrayBag2 = new ResizeableArrayBag<>(2);
        testUnionArrayBag2.add(8);
        testUnionArrayBag2.add(9);

        BagInterface<Integer> togethermain = testUnionArrayBag1.Union(testUnionArrayBag2);

        System.out.println(togethermain);

        /**
         * showcasing intersection method for ResizeableArrayBag
         */
        ResizeableArrayBag<Integer> testIntersectionArrayBag1 = new ResizeableArrayBag<>(2);
        testIntersectionArrayBag1.add(6);
        testIntersectionArrayBag1.add(7);
        ResizeableArrayBag<Integer> testIntersectionArrayBag2 = new ResizeableArrayBag<>(2);
        testIntersectionArrayBag2.add(6);
        testIntersectionArrayBag2.add(9);

        BagInterface<Integer> testcommon = testIntersectionArrayBag1.Intersection(testIntersectionArrayBag2);

        System.out.println(togethermain);


        /**
         * implementation example for linkedBag
         * implements methods union, difference, and intersection
        */
/*
        Node<Object> headNode = new Node(3, null);
        LinkedBag<Object> intLinkedBag = new LinkedBag<Object>(headNode);
        intLinkedBag.add(4);

        Node<Object> anotherHeadNode = new Node(5, null);
        LinkedBag<Object> intLinkedBag2 = new LinkedBag<Object>(anotherHeadNode);
        intLinkedBag2.add(6);

        BagInterface<Integer> union2 = intLinkedBag.Union(intLinkedBag2);
        BagInterface<Integer> difference2 = intLinkedBag.Difference(intLinkedBag2);
        BagInterface<Integer> intersection2 = intLinkedBag.Intersection(intLinkedBag2);
*/

    }

}
