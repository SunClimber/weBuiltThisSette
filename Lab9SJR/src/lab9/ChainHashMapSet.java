package lab9;

import net.datastructures.ChainHashMap;

/**
 * Name: Sam Reynebeau
 * Date: 4/14/2025
 * Description: This class is an implementation of the Set interface using a ChainHashMap defined in 
 * net/datastructures. 
 * Bugs: None known
 * Reflection: I was a bit confused at first, since I haven't really worked with sets before and the only 
 * description was they were a collection of unique elements. After doing a little research of some practical 
 * applications of sets, I keyed into what I was supposed to actually be doing. Once I clued in on using a
 * hashmap here, it all came together rather quickly. Although, it did take me a while to realize that I needed 
 * to create a ChainHashMap object here rather than extend the class itself. 
 */

public class ChainHashMapSet<E> implements Set<E> {
    //create ChainHashMap object 
    private ChainHashMap<E,Boolean> chainHashMap = new ChainHashMap<>();

    /**
     * Number of elements
     * @return total number of elements in set
     */
    public int size(){

        return chainHashMap.size();
    }


    /**
     * Determines if set is empty
     * @return boolean, true or false
     */
    public boolean isEmpty(){

        return chainHashMap.isEmpty();
    }


    /**
     * Does the set contain provided element
     * @param element what you're looking for
     * @return boolean true or false
     */
    public boolean contains(E element){
        //get returns null if elements not there so, will return true or false after comparision
        return chainHashMap.get(element) != null;
    }


    /**
     * Adds an element to the set. Only adds element if not already in set,
     * so if you get a return of false, you know it's in there
     * @param element Element you want to add
     * @return true if added or false if not
     */
    public boolean add(E element){
        //we want add() to return true if it adds it to the set (false if not added), so that means 
        //if put() returns null it's not in the set, and add will return true since we're seeing if put() == null
        //if put returns a value != null then it's already in the set and just replaced/updated the value with true
        //since that's the dummy default, and nothing changes
        return chainHashMap.put(element, true) == null;

    }


    /**
     * Removes element from set. Only removes if it's there, of course. 
     * @param element Element provided in argument
     * @return  true if removed, false if not
     */
    @Override
    public boolean remove(E element){
        return chainHashMap.remove(element) != null;
    }

    

    /**
     * Removes ALL elements from the set
     */
    public void clear() {
        for (E key : chainHashMap.keySet()) {
            chainHashMap.remove(key);
        }
    }

    /**
     * Creates iterable of keys. We only care about the keys here so no values included
     * @return iterable of keys
     */
    public Iterable<E> keySet() {
        return chainHashMap.keySet();
    }
}