package src;

public interface BagInterface<T>
{
    /**
     * @return The union of two collections consists of their contents combined into a new collection.
     */
    BagInterface<T> Union(BagInterface<T> bag);

    /**
     * @return The intersection of two collections is a new collection of the entries that occur in both collections.
     */
    BagInterface<T> Intersection(BagInterface<T> bag);

    /**
     * @return The difference of two collections is a new collection of the entries that would be
     * left in one collection after removing those that also occur in the second.
     */
    BagInterface<T> Difference(BagInterface<T> bag);

    /**
     * @return the integer number of entries currently in bag
     */
    int getCurrentSize();

    /**
     * @return boolean value if bag is empty or not
     */
    boolean isEmpty();

    /**
     * @return either removed entry if successful or null
     */
    boolean add(T newEntry);

    T remove();

    boolean remove(T anEntry);

    void clear();

    int getFrequencyOf(T anEntry);

    T[] toArray();

    /**
     * @return boolean if a bag contains an item
     */
    boolean contains(T item);
}
