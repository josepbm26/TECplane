package estructurasDatos;


public class MaxHeap implements Heaps{

	private int[] Heap; 
    private int size; 
    private int maxsize; 
	
	
    public MaxHeap(int maxsize){ 
        this.maxsize = maxsize; 
        this.size = 0; 
        Heap = new int[this.maxsize + 1]; 
        Heap[0] = Integer.MAX_VALUE; 
    } 
	    
   
	
}
