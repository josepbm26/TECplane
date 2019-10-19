package estructurasDatos;

//Creacion de interfaz de Heaps
interface Heaps{
	
	// Retorna el padre
	static int parent(int pos) {
		return pos / 2;
	}
	  
	//Retorna los hijos
	static int leftChild(int pos) {
	  return (2 * pos);
	}
	static int rightChild(int pos) {
	  return (2 * pos) + 1; 
	}
	  
	//Intercambio
	static void swap(int fpos, int spos, int[] Heap) {
	  int tmp; 
	   tmp = Heap[fpos]; 
	   Heap[fpos] = Heap[spos]; 
	   Heap[spos] = tmp; 
	} 
	  
	//Insertar
	static void insert(int element, int size,int maxsize, int[] Heap) {
	  if (size >= maxsize) 
	         return; 
	  Heap[++size] = element; 
	
	  int current = size; 
	  while (Heap[current] > Heap[parent(current)]) { 
	      swap(current, parent(current),Heap); 
	      current = parent(current); 
	      }
	  }
  
}

