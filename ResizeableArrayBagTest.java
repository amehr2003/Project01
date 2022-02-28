import static org.junit.jupiter.api.Assertions.*;

class ResizeableArrayBagTest {

    @org.junit.jupiter.api.Test
    void testUnion() {
        // Arrange
        ResizableArrayBag<Integer> intArrayBag = new ResizableArrayBag<>(2);
        intArrayBag.add(1);
        intArrayBag.add(2);
        ResizableArrayBag<Integer> intArrayBag2 = new ResizableArrayBag<>(2);
        intArrayBag2.add(3);
        intArrayBag2.add(4);

        // Act
        BagInterface<Integer> all = intArrayBag.union(intArrayBag2);

        // Assert
        assertTrue(all.contains(1));
        assertTrue(all.contains(2));
        assertTrue(all.contains(3));
        assertTrue(all.contains(4));
    }

    @org.junit.jupiter.api.Test
    void testIntersection() {
        //Arrange


        //Act
        BagInterface<Integer> inter = intArrayBag.Intersection(intArrayBag2);

        //Assert
    }

    @org.junit.jupiter.api.Test
    void testDifference() {
    }
}