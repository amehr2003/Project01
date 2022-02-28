package src.test;

import org.junit.jupiter.api.Test;
import src.ResizeableArrayBag;

class ResizeableArrayBagTest {

    @Test
    void testUnion() {
        //Arrange
        ResizeableArrayBag<Integer> ArrayBag1 = new ResizeableArrayBag<>(2);
        ArrayBag1.add(6);
        ArrayBag1.add(7);
        ResizeableArrayBag<Integer> ArrayBag2 = new ResizeableArrayBag<>(2);
        ArrayBag1.add(8);
        ArrayBag1.add(9);

        //Act
        BagInterface<Integer> together = ArrayBag1.union(ArrayBag2);

        //Assert
        assertTrue(together.contains(9));
        assertTrue(together.contains(6));
        assertTrue(together.contains(7));
        assertTrue(together.contains(8));
    }

    @Test
        void testIntersection() {
    }

    @Test
    void testDifference() {
    }


}