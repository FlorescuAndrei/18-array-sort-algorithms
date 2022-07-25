# 18-array-sort-algorithms
Algorithm Theory and Big O.  
Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort

Big O – number of step to perform for an algorithm  
O(1)  0 of 1 &emsp; – Constant time complexity  
O(log<sub>2</sub>n)	&emsp; - Logaritmic  
O(n) &emsp;&emsp;&emsp; – Linear  (diagonala)  
O(nlog<sub>2</sub>n)  
O(n<sup>2</sup>) &emsp; &emsp; - Quadratic

Normally each loop corresponds to n : &emsp;   for() =>O(n); &emsp; for(for()) => O(n2).  
  
Stable vs Unstable sort:  
-  Stable: original ordering when there are duplicates will be preserved. 
 
In-place vs Not in-place:  
-  Not in-place use additional arrays, consume more memory.
  
  
**Bubble Sort**  
  Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.  
      
  -  In-place algorithm
  -  O(n<sup>2</sup>) time complexity - quadratic
  -  Stable sort algorithm
  -  Algorithm degrades quickly.
  
**Selection Sort**   
  Selection sort is a sorting algorithm that selects the biggest element from an unsorted list in each iteration and places that element at the end of the unsorted list swapping it with the last element.   
  Will usually perform better then bubble sort.  
  -  In-place algorithm.
  -  O(n<sup>2</sup>) time complexity - quadratic.
  -  Unstable algorithm.
  -  Doesn't required as much swapping as bubble sort.  
  
  
**Insertion Sort**   
  Insertion sort (virtually) partitions the array into sorted and unsorted partitions like selection sort.   
  It starts out by saying that the element at position 0 is in the sorted partition. In each iteration takes the first element from the unsorted partition (next element) and inserts it in the sorted partition at the correct position moving elements one position to the right.
  -  In-place algorithm.
  -  O(n<sup>2</sup>) time complexity - quadratic.
  -  Stable algorithm.
 
 
**Merge Sort**   
  -  Divide and conquer algorithm.
  -  Recursive algorithm.   
  -  Two phases: Splitting and Merging. 
  -  Not In-place algorithm.
  -  O(nlog<sub>2</sub>n). &emsp; Repeteadly partitioning the array into two halves
  -  Stable algorithm.  
 
 
 
**Quick Sort**   
  -  Divide and conquer algorithm.
  -  Recursive algorithm.   
  -  Use a pivot element to partition the array into two parts: elements < pivot to its left, elements > pivot to its right. Pivot will then be in its correct sorted position.
  -  In-place algorithm.
  -  O(nlog<sub>2</sub>n). &emsp; Repeteadly partitioning the array into two halves
  -  Unstable algorithm.
  




[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)

