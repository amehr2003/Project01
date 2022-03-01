package src.test;

import org.junit.jupiter.api.Test;
import src.ResizeableArrayBag;

import src.BagInterface;

import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;

class ResizeableArrayBagTest {

    @Test
    void testUnion() {
        //Arrange
        ResizeableArrayBag<Integer> UnionArrayBag1 = new ResizeableArrayBag<>(2);
        UnionArrayBag1.add(6);
        UnionArrayBag1.add(7);
        ResizeableArrayBag<Integer> UnionArrayBag2 = new ResizeableArrayBag<>(2);
        UnionArrayBag2.add(8);
        UnionArrayBag2.add(9);

        //Act
        BagInterface<Integer> together = UnionArrayBag1.Union(UnionArrayBag2);

        //Assert
        assertTrue(together.contains(9));
        assertTrue(together.contains(6));
        assertTrue(together.contains(7));
        assertTrue(together.contains(8));
    }

    @Test
        void testIntersection() {
        //Arrange
        ResizeableArrayBag<Integer> IntersectionArrayBag1 = new ResizeableArrayBag<>(2);
        IntersectionArrayBag1.add(6);
        IntersectionArrayBag1.add(7);
        ResizeableArrayBag<Integer> IntersectionArrayBag2 = new ResizeableArrayBag<>(2);
        IntersectionArrayBag2.add(6);
        IntersectionArrayBag2.add(9);

        //Act
        BagInterface<Integer> common = IntersectionArrayBag1.Intersection(IntersectionArrayBag2);

        //Assert
        assertTrue(common.contains(6));
    }


    @Test
    void testDifference() {
        //Arrange
        ResizeableArrayBag<Integer> DifferenceArrayBag1 = new ResizeableArrayBag<>(2);
        DifferenceArrayBag1.add(6);
        DifferenceArrayBag1.add(7);
        ResizeableArrayBag<Integer> DifferenceArrayBag2 = new ResizeableArrayBag<>(2);
        DifferenceArrayBag2.add(6);
        DifferenceArrayBag2.add(9);

        //Act
        BagInterface<Integer> diff = DifferenceArrayBag1.Difference(DifferenceArrayBag2);

        //Assert
        assertTrue(diff.contains(7));
        assertTrue(diff.contains(9));
    }

}