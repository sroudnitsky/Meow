# Meow
# isEmpty()
O(1) because it just returns if the size is 0 and doesn't loop through anything.
# add()
Our algorithm:
adds a new Integer to the end of the _heap ArrayList. Checks if the integer of the child is less than that of the parent. If so, swap the parent and child. Continue doing this until the element being added is greater than that of its parent.
Best case: O(1), when the element is already in proper position upon insertion.
Worst case: O(log n), when the element needs to be placed on top of the heap.
# removeMin()

_data.size() - 1 Thus it is constant time
# peekMin()
O(1) because it simply returns the smallest value in the heap, aka the first element in the heap. 
