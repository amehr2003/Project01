package src;

/**
 A class of bags whose entries are stored in a chain of linked nodes.
 The bag is never full.
 INCOMPLETE DEFINITION; includes definitions for the methods add,
 toArray, isEmpty, and getCurrentSize.
 @author Frank M. Carrano, Timothy M. Henry
 @version 5.0
 */
public class LinkedBag<T> implements BagInterface<T> {
    private Node firstNode;       // Reference to first node
    public int numberOfEntries;

    public LinkedBag() {
        firstNode = null;
        numberOfEntries = 0;
    }

    private class Node {
        private T data; // Entry in bag
        private Node next; // Link to next node

        private Node(T dataPortion) {
            this(dataPortion, null);
        }

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor
    } // end Node
// end LinkedBag1

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry The object to be added as a new entry.
     * @return True.
     */
    public boolean add(T newEntry) // OutOfMemoryError possible
    {
        //Adds to beginning
        Node newNode = new Node(newEntry);
        newNode.next = firstNode;  // Makes new node reference
        // if chain is empty, firstNode is null
        firstNode = newNode;       // New node will be at the start of the chain
        numberOfEntries++;
        return true;
    }

    /**
     * Retrieves all entries that are in this bag.
     *
     * @return A newly allocated array of all the entries in this bag.
     */
    public T[] toArray() {
        //ignore all unchecked warnings since new array has only null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[numberOfEntries];

        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null)) {
            result[index] = currentNode.data;
            index++;
            currentNode = currentNode.next;
        }

        return result;
        // Note: The body of this method could consist of one return statement,
        // if you call Arrays.copyOf
    } // end toArray

    /**
     * Sees whether this bag is empty.
     *
     * @return True if the bag is empty, or false if not.
     */
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    /**
     * Gets the number of entries currently in this bag.
     *
     * @return The integer number of entries currently in the bag.
     */
    public int getCurrentSize() {
        return numberOfEntries;
    }

// STUBS:

    /**
     * Removes one unspecified entry from this bag, if possible.
     *
     * @return Either the removed entry, if the removal
     * was successful, or null.
     */
    public T remove() {
        T result = null;

        if (firstNode != null) {

            result = firstNode.data;

            firstNode = firstNode.next; // Remove first node from chain

            numberOfEntries--;

        }

        return result;

    }

    /**
     * Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry The entry to be removed.
     * @return True if the removal was successful, or false otherwise.
     */
    public boolean remove(T anEntry) {
        boolean result = false;

        Node nodeN = getReferenceTo(anEntry);

        if (nodeN != null) {

            nodeN.data = firstNode.data; // Replace located entry with entry in first node

            firstNode = firstNode.next; // Remove first node

            numberOfEntries--;

            result = true;

        }

        return result;

    }

    private Node getReferenceTo(T anEntry) {
        boolean found = false;

        Node currentNode = firstNode;

        while (!found && (currentNode != null)) {

            if (anEntry.equals(currentNode.data))

                found = true;

            else

                currentNode = currentNode.next;

        }

        return currentNode;

    }


    /**
     * Removes all entries from this bag.
     */
    public void clear() {
        {

            while (!isEmpty())

                remove();

        }
    } // end clear

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry The entry to be counted.
     * @return The number of times anEntry appears in the bag.
     */
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;

        int counter = 0;

        Node currentNode = firstNode;

        while ((counter < numberOfEntries) && (currentNode != null)) {

            if (anEntry.equals(currentNode.data)) {

                frequency++;

            }

            counter++;

            currentNode = currentNode.next;

        }

        return frequency;
    }


    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry The entry to locate.
     * @return True if the bag contains anEntry, or false otherwise.
     */
    public boolean contains(T anEntry) {
        boolean found = false;

        Node currentNode = firstNode;

        while (!found && (currentNode != null)) {

            if (anEntry.equals(currentNode.data))

                found = true;

            else

                currentNode = currentNode.next;

        } // end while

        return found;

    }

    @Override
    public BagInterface<T> Union(BagInterface<T> bag) {

        BagInterface<T> result = new LinkedBag<>();
        T[] bag2 = bag.toArray();
        for (int i = 0; i < bag2.length; i++) {
            result.add(bag2[i]);
        }
        T[] bag1 = this.toArray();
        for (int i = 0; i < bag1.length; i++) {
            result.add(bag1[i]);
        }
        return result;

    }

    @Override
    public BagInterface<T> Intersection(BagInterface<T> bag) {

        BagInterface<T> result = new LinkedBag<>();

            int counter = 0;

            Node currentNode = firstNode;

            while ((counter < numberOfEntries) && (currentNode != null)) {

                if (bag.contains(currentNode.data)) {

                    result.add(currentNode.data);

                }

                counter++;

                currentNode = currentNode.next;

            }

            return result;

    }


    @java.lang.Override
    public BagInterface<T> Difference(BagInterface<T> bag2) {
        BagInterface<T> diffResult = new LinkedBag<>();

        int diffcounter = 0;

        Node diffCurrentNode = firstNode;

        while ((diffcounter < numberOfEntries) && (diffCurrentNode != null)) {

            if (!(bag2.contains(diffCurrentNode.data))) {

                diffResult.add(diffCurrentNode.data);
            }

            diffcounter++;

            diffCurrentNode = diffCurrentNode.next;
        }

        return diffResult;
    }
}

