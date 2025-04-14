package lab9;

/**
 *Set Interface methods defined/described generically
 * @author Sam Reynebeau
 */
public interface Set<E> {

    /**
     * Number of elements
     * @return total number of elements in set
     */
    int size();


    /**
     * Determines if set is empty
     * @return boolean, true or false
     */
    boolean isEmpty();


    /**
     * Does the set contain provided element
     * @param element what you're looking for
     * @return boolean true or false
     */
    boolean contains(E element);


    /**
     * Adds an element to the set. Only adds element if not already in set
     * so if you get a return of false, you know it's in there
     * @param element Element you want to add
     * @return boolean true or false
     */
    boolean add(E element);


    /**
     * Removes element from set. Only removes if it's there, of course. 
     * @param element Element provided in argument
     * @return  boolean true or false if removed or not
     */
    boolean remove(E element);


    /**
     * Removes ALL elements from the set
     */
    void clear();
}