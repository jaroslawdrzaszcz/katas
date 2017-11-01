package kata2.kata2;

public class BinaryChop {
	
	
	public int binarySearchElement(int element, int[] array) {
		
		int a = 0;
		int b = array.length-1;
		
		while(a<=b){
			
			int mid = (a+b)/2;
			
			if(array[mid] > element)
                b = mid - 1;
            else if(array[mid] < element)
                a = mid + 1;
            else
                return mid;
		}
		return -1;	
	}
	
	
	public int simpleFindElement(int element, int[] array) {
		
			for(int i=0; i<array.length; i++){
			if (array[i]==element)
				return i;
			}
			return -1;
}


	public int recursivelySearchElement(int element, int[] array) {
				
		   return binaryinarySearchForRecursive(array, element, 0, (array.length-1));
	}


	private int binaryinarySearchForRecursive(int[] array, int element, int a, int b) {


		while(a<=b){
			
			int mid = (a+b)/2;
			
			if(array[mid] > element)
				return binaryinarySearchForRecursive(array, element, a, mid-1);
                               
			else if(array[mid] < element)
            	 return binaryinarySearchForRecursive(array, element, mid+1, b);           
			
			else
                return mid;
		}
		
		return -1;
		

			
	
	}


	public int inetrpolationFindElement(int element, int[] array) {
		
		int a = 0;
		int b = array.length-1;
		
		while(a<=b && element >= array[a] && element <= array[b]){
		
			if(array[b]-array[a] == 0)
				return 0;
			else{
			int mid = a + ((element - array[a])*(b-a)/(array[b]-array[a]));
			
			if(array[mid] > element)
                b = mid - 1;
            else if(array[mid] < element)
                a = mid + 1;
            else
                return mid;
			}
		}
			return -1;	
	}
}



