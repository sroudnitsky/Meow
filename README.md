# Meow 
Peter Cwalina, Sean Roudnitsky, Aidan Griffin  
APCS pd08         
Lab #03  

# Heap Todo

1. constructor  
       We made the constructor first because without a constructor there is no object, which we need to make the main method. 
2. toString()  
       It's important to have a clear visual of what your methods are doing. Important for testing. 
3. isEmpty()   
       Needed for remove() method. Easy to implement.  
4. peekMin()   
       Needed for remove() method. Easy to implement.  
5. add()   
       Needed for remove. You can't remove without adding first. 
6. minChildPos()   
       Needed for removeMin().
7. removeMin()   
       Every method preceding this is intended to make this work. 
       
       
# Methods Explained
isEmpty():   
      Constant time just returns if the size is 0  
      
add():   
      We've decided to use the add method to determine the priority of strings being added into the ArrList 
      Strings with highest priority to be removed will be placed at the end of the Array
      At the  worst case this will run in o(n) time  
       
removeMin():  
      Due to the way the add method works we only have to remove the last element in the ArrayList which is given by
      \_data.size() - 1 Thus it is constant time  
      
peekMin():  
      Peek min will just use get on the last item in the ArrayList thus it is constant time  

