/*
  Utilizes a min heap and a max heap to balance the numbers within 
them between two halves.  The lower half of data will be held in a maxheap
and the upper half of data in a minheap.  Depending on the number of values 
total odd/even odd - return the minvalue of the minheap even - average the min
value of the minheap and max value of the max heap.


 */
public class RunMed{
    private ALHeapMin bigVals;
    private ALHeapMax lilVals;
    private int lilSize;
    private int bigSize;
    private int total;
    public RunMed(){
	bigVals = new ALHeapMin();
	lilVals = new ALHeapMax();
	lilSize = 0;
	bigSize = 0;
	total = 0;
    }
    public int getMedian(){
	if (total% 2 == 0){
	    return (lilVals.peekMax()+bigVals.peekMin())/2;
	}
	else{
	    return bigVals.peekMin();
	}

    }
    public void add(Integer newVal){		  
	if (total == 0){
	    bigVals.add(newVal);
	    total+=1;
	    bigSize+=1;
	    return;
	}
	if (newVal < bigVals.peekMin()){
	    lilVals.add(newVal);
	    total+=1;
	    lilSize+=1;
	}
	else{
	    bigVals.add(newVal);
	    total+=1;
	    bigSize+=1;
	}
	balance();
    }
    public void balance(){
	if (total % 2 ==0){
	    while(bigSize != lilSize){
		if (bigSize > lilSize){
		    lilVals.add(bigVals.removeMin());
		    lilSize+=1;
		    bigSize-=1;
		}
		else{
		    bigVals.add(lilVals.removeMax());
		    bigSize+=1;
		    lilSize-=1;
		}
	    }
	}
	else{
	    while (bigSize != lilSize + 1){
		if (bigSize > lilSize){
		    lilVals.add(bigVals.removeMin());
		    lilSize+=1;
		    bigSize-=1;
		}
		else{
		    bigVals.add(lilVals.removeMax());
		    bigSize+=1;
		    lilSize-=1;
		}
	    }
	}
    }
    public static void main(String [] args){
	RunMed test = new RunMed();	
	test.add(1);	
	System.out.println(test.getMedian());
	test.add(5);	
	System.out.println(test.getMedian());
	test.add(4);	
	System.out.println(test.getMedian());
	test.add(6);	
	System.out.println(test.getMedian());
	test.add(21);	
	System.out.println(test.getMedian());
	test.add(7);	
	System.out.println(test.getMedian());
	test.add(9);	
	System.out.println(test.getMedian());
    }
}//end run med
