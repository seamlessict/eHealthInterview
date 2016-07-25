import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
class Question1 {
    public static void main(String[] args) {
		
   
	   // Reading the value of n
     System.out.println("Please enter a Positive Integer Value : ");
	 Scanner input = new Scanner(System.in);
	 // Check if the number entered is an integer
	 int n = input.nextInt();
	
	 String binary=Integer.toBinaryString(n);
     int binary_gap=getN(binary);
	 System.out.print("Longest Binary Gap is :");
	 System.out.print(binary_gap);

	 
     
	 
	
    }
	
	public static int getN(String bin)
	{
		// Since the zeros must be surrounded by ones then its will be logical to follow these steps
		//1. Get indexes of consecutive Ones and store them in an array called indexes
		//2. Loop through the array and get the differences of conscutive    indexes and store in another array called diff
		//3. Get the maximum of the array -1 to get the maximal consecutive zeros
		
		String ones="1"; // use this to compare with the string builder
		
		// Create a string builder object and Loop throught it to get the indexes where the value is 1's
        StringBuilder sb = new StringBuilder(bin);
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        ArrayList<Integer> diff = new ArrayList<Integer>();		
		for (int index = sb.indexOf(ones);  index >= 0;
         index = sb.indexOf(ones, index + 1))
		{
			indexes.add(index);
						
		}
		
		// Get the difference between the element of the indexes
		for (int i = 1; i < indexes.size(); i++) {
			
			int val =indexes.get(i) - indexes.get(i-1);
			
			diff.add(val);
			
		}
		Integer max = Collections.max(diff)-1;
		return max;	
	
			
	}
	}