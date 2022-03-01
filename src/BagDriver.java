package src;

public class BagDriver {
    public static void main(String[] args)
    {
        /**
         * implementation example for resizeableArrayBag
         * implements methods union, difference, and intersection
        */

        ResizeableArrayBag<Integer> mainArrayBag1 = new ResizeableArrayBag<>(2);
        mainArrayBag1.add(6);
        mainArrayBag1.add(7);
        mainArrayBag1.add(7);
        ResizeableArrayBag<Integer> mainArrayBag2 = new ResizeableArrayBag<>(2);
        mainArrayBag2.add(8);
        mainArrayBag2.add(7);

        BagInterface<Integer> togetherMain = mainArrayBag1.Union(mainArrayBag2);
        BagInterface<Integer> commonMain = mainArrayBag1.Intersection(mainArrayBag2);
        BagInterface<Integer> diffMain = mainArrayBag1.Difference(mainArrayBag2);

        System.out.println("After the union method for ResizeableArrayBag ");
        displayBag(togetherMain);
        System.out.println("After the intersection method for ResizeableArrayBag ");
        displayBag(commonMain);
        System.out.println("After the difference method for ResizeableArrayBag ");
        displayBag(diffMain);

        /**
         * implementation example for linkedBag
         * implements methods union, difference, and intersection
        */

        LinkedBag<Integer> testLinkedBag1 = new LinkedBag<Integer>();
        LinkedBag<Integer> testLinkedBag2 = new LinkedBag<Integer>();
        testLinkedBag1.add(1);
        testLinkedBag1.add(2);
        testLinkedBag2.add(2);
        testLinkedBag2.add(4);

        BagInterface<Integer> testLinkedTogether = testLinkedBag1.Union(testLinkedBag2);
        BagInterface<Integer> testLinkedCommon = testLinkedBag1.Intersection(testLinkedBag2);
        BagInterface<Integer> testLinkedDiff = testLinkedBag1.Difference(testLinkedBag2);

        System.out.println("After the union method for LinkedBag ");
        displayBag(testLinkedTogether);
        System.out.println("After the intersection method for LinkedBag ");
        displayBag(testLinkedCommon);
        System.out.println("After the difference method for LinkedBag ");
        displayBag(testLinkedDiff);
    }

    /**
     * @param aBag
     * @return  a list of items in the bag.
     */
    private static void displayBag(BagInterface<Integer> aBag) {
        System.out.println("The bag contains...");
        Object[] bagArray = aBag.toArray();
        for (int i = 0; i < bagArray.length; i++) {
            System.out.print(bagArray[i] + " ");
        } //end for
        System.out.println();
    } // end displayBag method
}
