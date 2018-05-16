/*****************************************************
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 *****************************************************/

import java.util.ArrayList;

public class ALHeap
{

    //instance vars
    private ArrayList<Integer> _heap; 

    /*****************************************************
     * default constructor  ---  inits empty heap
     *****************************************************/
    public ALHeap() 
    {
	_heap = new ArrayList<Integer>();//initialize the ArrayList
    }



    /*****************************************************
     * toString()  ---  overrides inherited method
     * Returns either 
     * a) a level-order traversal of the tree (simple version)
     * b) ASCII representation of the tree (more complicated, more fun)
     *****************************************************/
    public String toString() //boring toString
    {
	if (_heap.size() == 0){
	    return "";
	}
	String retVal = "";
	for (Integer n : _heap){
	    retVal +=n + " ";
	}
	return retVal;
      
    }//O(n)


    /*****************************************************
     * boolean isEmpty()
     * Returns true if no meaningful elements in heap, false otherwise
     *****************************************************/
    public boolean isEmpty()
    {
	return _heap.size() == 0;//is size 0?
    }//O(1)


    /*****************************************************
     * Integer peekMin()
     * Returns min value in heap
     * Postcondition: Heap remains unchanged.
     *****************************************************/
    public Integer peekMin()
    {
	return _heap.get(0);//min value is always at pos 0 of the arraylist
    }//O(1)


    /*****************************************************
     * add(Integer) 
     * Inserts an element in the heap
     * Postcondition: Tree exhibits heap property.
     Adds value into the Array then progressively swaps the value up a level if its less than its parent
     *****************************************************/
    public void add( Integer addVal )
    {
	_heap.add(addVal);//add the value to the arraylist then bring it into compliance
	int child = _heap.size() -1;
	int par = (child - 1)/2;    
	while (_heap.get(child) < _heap.get(par)){//is the added value less than its parent?
	    swap(par,child);//swap em
	    child = par;//child is now in the parents location
	    par = (child - 1)/2;//find the location of the new parent to check again
	  
	}
	  
    }//O(logn)


    /*****************************************************
     * removeMin()  ---  means of removing an element from heap
     * Removes and returns least element in heap.
     * Postcondition: Tree maintains heap property.
      
       Moves the min value of the heap to the leaves then proceeds to move every value to the right of it up the heap accordingly
     *****************************************************/
    public Integer removeMin()
    {
        if (isEmpty()){//if removing with nothing in heap
	    return -1;
	}
	int minPos = 0;//position of value to be removed
	int childPos = minChildPos(minPos);//smallest child of that value
	int par;//"                                       "
	int child;//for use in bringing the bottom level into accordance
	
	while(childPos != -1){//as long as there is a smallest child
	    swap(minPos, childPos);//change positions with it
	    minPos = childPos;//update its position
	    childPos = minChildPos(minPos);//find new smallest child
	    
	}
        int retVal = _heap.remove(minPos);//remove the smallest value shifting the rest of the level over 1
	
	for(int x = minPos;x < _heap.size();x++){//for all of the shifted values check if its in accordance then move it accordingly
	    child = x;//very similar to previous add method
	    par = (child-1)/2;
	    while(_heap.get(child) < _heap.get(par)){//same as add
		swap(par,child);
		child = par;
		par = (child-1)/2;
	    }
	}
	return retVal;
		
    }//O(logn)


    /*****************************************************
     * minChildPos(int)  ---  helper fxn for removeMin()
     * Returns index of least child, or 
     * -1 if no children, or if input pos is not in ArrayList
     * Postcondition: Tree unchanged
     *****************************************************/
    private int minChildPos( int pos )
    {
	int lc;
	int rc;
	if (pos >= _heap.size()){//is the pos out of the arraylist's bounds
	    return -1;
	}
	if (((2*pos) + 1)>=_heap.size()){//is the possible child out of the bounds
	    return -1;
	}
	lc = (2 * pos) + 1;
	if (((2*pos) + 2)>=_heap.size()){//is there no rc?
	    rc = lc;
	}
	else{
	    rc = 2 * pos + 2;
	}
	if (_heap.get(lc) < _heap.get(rc)){//pick the smallest node
	    return lc;
	}
	else{
	    return rc;
	}

    }//O(1)
  

    //************ aux helper fxns ***************
    private Integer minOf( Integer a, Integer b )
    {
	if ( a.compareTo(b) < 0 )
	    return a;
	else
	    return b;
    }

    //swap for an ArrayList
    private void swap( int pos1, int pos2 )
    {
	_heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );	
    }
    //********************************************



    //main method for testing
    public static void main( String[] args )
    {
    
	ALHeap pile = new ALHeap();

	pile.add(2);
	System.out.println(pile);
	pile.add(4);
	System.out.println(pile);
	pile.add(6);
	System.out.println(pile);
	pile.add(8);
	System.out.println(pile);
	pile.add(10);
	System.out.println(pile);
	pile.add(1);
	System.out.println(pile);
	pile.add(3);
	System.out.println(pile);
	pile.add(5);
	System.out.println(pile);
	pile.add(7);
	System.out.println(pile);
	pile.add(9);
	System.out.println(pile);
	
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  System.out.println("removing " + pile.removeMin() + "...");
	  System.out.println(pile);
	  /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class ALHeap
