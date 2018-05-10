//Aidan Griffin
//APCS2 pd8
//HW46 -- Arrr, There Be Priorities Here Matey
//2018-05-10

import java.util.ArrayList;

public class ArrayPriorityQueue{
    private ArrayList<Comparable> priorityQueue;
    public ArrayPriorityQueue(){
	priorityQueue = new ArrayList<Comparable>();
    }
    //finds the min priority
    //minPriority(): O(n)
    public Comparable minPriority() {
	Comparable _minPriority = "z";
	if (priorityQueue.isEmpty())
	    _minPriority = null;
	else {
	    for (int i = 0; i < priorityQueue.size(); i++) {
		if (priorityQueue.get(i).compareTo(_minPriority) < 0)
		    _minPriority = priorityQueue.get(i);
	    }
	}
	return _minPriority;
    }
    //add(Comparable blah): O(1)
    public void add(Comparable newItem){
	priorityQueue.add(newItem);//calls add method of the ArrayList
    }
    //isEmpty(): O(1)
    public boolean isEmpty(){
	return priorityQueue.size() == 0;
    }
    //returns the minimum element(in alphabetical order) without returning it
    //peekMin(): O(n)
    public Comparable peekMin(){
	return this.minPriority();
    }
    //returns the element being removed(which is the minimum element)
    //removeMin(): O(n)
    public Comparable removeMin(){
	int index = 0;
	while (!priorityQueue.get(index).equals(this.minPriority())){
	    index += 1;//walks element up to the one with priority
	}
	return priorityQueue.remove(index);
    }
    public String toString(){
	return priorityQueue.toString();
    }
    public static void main(String[] args){
	ArrayPriorityQueue moo = new ArrayPriorityQueue();
	moo.add("moo");
	moo.add("boo");
	System.out.println(moo);
	System.out.println(moo.peekMin());
	System.out.println(moo.removeMin());
	System.out.println(moo);
	moo.add("goo");
	moo.add("foo");
	System.out.println(moo);
	System.out.println(moo.peekMin());
        System.out.println(moo.removeMin());
	System.out.println(moo);
	moo.add("too");
	moo.add("coo");
	System.out.println(moo);
	System.out.println(moo.peekMin());
        System.out.println(moo.removeMin());
	System.out.println(moo);
    }
}
