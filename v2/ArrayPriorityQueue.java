//Peter Cwalina
//Apcs2 pd 8
//hw46
//2018-5-9
import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{
    private ArrayList<String> _data;
    
    
    public ArrayPriorityQueue(){
	_data = new ArrayList<String>();
    }
    public boolean isEmpty(){
	return _data.size() == 0;
    }//constant time

    public void add(String x){
	if (_data.size() == 0){
	    _data.add(x);
	}
	else{
	    for (int y = 0; y < _data.size();y++){
		if (x.compareTo(_data.get(y)) >=0){
		    _data.add(y,x);
		    return;
		}
		   
	    }
	    _data.add(x);
	}	    	
    }//o(n) runtime in worst case

    public String removeMin(){
	String retVal = _data.remove(_data.size()-1);

	return retVal;
    }//constant
    
    public String peekMin(){
	return _data.get(_data.size()-1);
    }//constant
    public static void main(String [] args){
	ArrayPriorityQueue kenny = new ArrayPriorityQueue();
	kenny.add("f");
	kenny.add("c");
	kenny.add("a");
	kenny.add("b");	
	kenny.add("d");
	kenny.add("e");
	
	System.out.println(kenny.removeMin());//should be f
	System.out.println(kenny.removeMin());//should be e	
	System.out.println(kenny.removeMin());//should be e
	System.out.println(kenny.removeMin());//should be e
	

    }

}
