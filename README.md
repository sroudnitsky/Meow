# Meow
# isEmpty()
Constant time just returns if the size is 0
# add()
We've decided to use the add method to determine the priority of strings being added into the ArrList 
Strings with highest priority to be removed will be placed at the end of the Array
At the  worst case this will run in o(n) time
# removeMin()
Due to the way the add method works we only have to remove the last element in the ArrayList which is given by
\_data.size() - 1 Thus it is constant time
# peekMin()
Peek min will just use get on the last item in the ArrayList thus it is constant time
