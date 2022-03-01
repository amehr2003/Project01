package src;


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
    }

}
