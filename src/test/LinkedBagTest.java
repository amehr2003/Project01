package src.test;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
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

        // Arrange
        Node<Object> headNode = new Node(3, null);
        LinkedBag<Object> intLinkedBag = new LinkedBag<Object>(headNode);
        intLinkedBag.add(4);

        Node<Object> anotherHeadNode = new Node(5, null);
        LinkedBag<Object> intLinkedBag2 = new LinkedBag<Object>(anotherHeadNode);
        intLinkedBag2.add(6);

        // Act
        BagInterface<Object> everything = intLinkedBag.Union(intLinkedBag2);

        // Assert
        assertTrue(everything.contains(3));
        assertTrue(everything.contains(4));
        assertTrue(everything.contains(5));
        assertTrue(everything.contains(6));
    }

    @Test
    void testIntersection() {
        // Arrange
        Node<Object> headNode = new Node(4, null);
        LinkedBag<Object> intLinkedBag = new LinkedBag<Object>(headNode);
        intLinkedBag.add(3);

        Node<Object> anotherHeadNode = new Node(5, null);
        LinkedBag<Object> intLinkedBag2 = new LinkedBag<Object>(anotherHeadNode);
        intLinkedBag2.add(3);

        // Act
        BagInterface<Object> everything = intLinkedBag.Intersection(intLinkedBag2);

        // Assert
        assertTrue(everything.contains(3));
        assertFalse(everything.contains(4));
        assertFalse(everything.contains(5));
    }

    @Test
    void testDifference() {
        // Arrange
        Node<Object> headNode = new Node(4, null);
        LinkedBag<Object> intLinkedBag = new LinkedBag<Object>(headNode);
        intLinkedBag.add(3);
        intLinkedBag.add(5);

        Node<Object> anotherHeadNode = new Node(5, null);
        LinkedBag<Object> intLinkedBag2 = new LinkedBag<Object>(anotherHeadNode);
        intLinkedBag2.add(3);

        // Act
        BagInterface<Object> leftover = intLinkedBag.Difference(intLinkedBag2);

        // Assert
        assertTrue(leftover.contains(4));
        assertFalse(leftover.contains(3));
        assertFalse(leftover.contains(5));
    }
}
