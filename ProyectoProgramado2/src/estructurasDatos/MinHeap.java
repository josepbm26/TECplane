package estructurasDatos;

public class MinHeap implements Heaps {
	
	private int[] Heap; 
    private int size; 
    private int maxsize;
	
	public MinHeap(int maxsize) 
    { 
        this.maxsize = maxsize; 
        this.size = 0; 
        Heap = new int[this.maxsize + 1]; 
        Heap[0] = Integer.MIN_VALUE; 
    } 

}
