public class Fibonacci 
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
		int max = 15;
		
		// create the array to hold the sequence of Fibonacci numbers
		int[] sequence = new int [max];
		
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 0;
		sequence[1] = 1;
		
		//create the Fibonacci sequence and store it in int[] sequence
		//for loop to fill the first 15 num of sequence. 0-1 already created. ends at 377. index 14
		for(int i = 2; i < 15; i++){
		    
		    //take sequence 1 and 2 before index and add together. 
		    //variabels created to simplify addition statement. 
		    int firstNum = sequence[i-1];
		    int secondNum = sequence[i-2];
		    
		    //add nums. 
		    int fibonacci = firstNum + secondNum;
		    
		    //create array list. 
		    //add to the sequence array. 
		    sequence[i] = fibonacci;
		    
		}
	
		
		//print the Fibonacci sequence numbers
		//for loop to iterate through numbers. 
		System.out.println("The first 15 elements in the fibonacci sequence are: ");
		for(int i = 0; i < sequence.length; i++){
		    System.out.print(sequence[i] + " ");
		}
      
    
        System.out.println("\nThe element after 55 is " + findNextElement(sequence, 55));
    
    }
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {
        //iterate through numbers to find the number stated. 
        for(int i = 0; i < arr.length; i++){
            //if num == num to find, return num in index after. 
            if(arr[i] == toFind){
                return arr[i+1];
            }
        }
        return -1;
    }
}