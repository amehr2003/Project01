package src.test;

import org.junit.jupiter.api.Test;
import src.BagInterface;
import src.LinkedBag;

import static org.junit.jupiter.api.Assertions.*;

/**
 * this class was created to use the maven dependency and
 * create j-unit test files to run code for errors.
 * The Bag uses an implementation of Integer in this class.
 */

class LinkedBagTest<Object> {

    /**
     * testUnion tests the method that should combine two
    */

    @Test
    void testUnion() {

        //Arrange
        LinkedBag<Integer> UnionLinkedBag1 = new LinkedBag<Integer>();
        LinkedBag<Integer> UnionLinkedBag2 = new LinkedBag<Integer>();
        UnionLinkedBag1.add(1);
        UnionLinkedBag1.add(2);
        UnionLinkedBag2.add(3);
        UnionLinkedBag2.add(4);

        //Act
        BagInterface<Integer> linkedTogether = UnionLinkedBag1.Union(UnionLinkedBag2);

        // Assert
        assertTrue(linkedTogether.contains(1));
        assertTrue(linkedTogether.contains(2));
        assertTrue(linkedTogether.contains(3));
        assertTrue(linkedTogether.contains(4));
    }

    @Test
    void testIntersection() {
        // Arrange
        LinkedBag<Integer> IntersectionLinkedBag1 = new LinkedBag<Integer>();
        LinkedBag<Integer> IntersectionLinkedBag2 = new LinkedBag<Integer>();

        IntersectionLinkedBag1.add(1);
        IntersectionLinkedBag1.add(2);
        IntersectionLinkedBag2.add(2);
        IntersectionLinkedBag2.add(4);

        //Act
        BagInterface<Integer> linkedCommon = IntersectionLinkedBag1.Intersection(IntersectionLinkedBag2);

        // Assert
        assertTrue(linkedCommon.contains(2));
        assertFalse(linkedCommon.contains(1));
        assertFalse(linkedCommon.contains(4));
    }

    @Test
    void testDifference() {
        // Arrange
        LinkedBag<Integer> DifferenceLinkedBag1 = new LinkedBag<Integer>();
        LinkedBag<Integer> DifferenceLinkedBag2 = new LinkedBag<Integer>();

        DifferenceLinkedBag1.add(5);
        DifferenceLinkedBag1.add(6);
        DifferenceLinkedBag2.add(7);
        DifferenceLinkedBag2.add(6);

        //Act
        BagInterface<Integer> linkedDiff = DifferenceLinkedBag1.Difference(DifferenceLinkedBag2);

        // Assert
        assertTrue(linkedDiff.contains(7));
        assertTrue(linkedDiff.contains(5));
        assertFalse(linkedDiff.contains(6));
    }
}
