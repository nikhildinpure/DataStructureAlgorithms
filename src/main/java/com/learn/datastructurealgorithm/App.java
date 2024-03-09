package com.learn.datastructurealgorithm;

/**
 * Hello world! Big-O Notation Notation and complexity 
 * 1. O(1) Constant 
 * 2.O(logn) Logarithmic 
 * 3. O(n) Linear 
 * 4. O(nlogn) n log-star n 
 * 5. O(n2) Quadratic
 * 
 * Array - Retrieval when we know index O(1) - 3 steps 1.Get start address 2.
 * Get the index and multiply to datatype size 3. add to start address Retrieval
 * when we dont know index O(n) - iterate through array worst case is last
 * element
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "======== Data Structure and Algorithms ========" );
        System.out.println("Learn about Arrays, Linked Lists, Trees, Hashtables, Stacks, Queues, Heaps, Sort algorithms and Search algorithms");
        System.out.println( "======== ============================= ========" );
        int [] arr = new int[10];
        arr[0] = 1;
        arr[9] = 10;
        
        System.out.println(arr[8]);
    }
}
