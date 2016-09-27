/*
 * 
 * 
 * @author Matt Parrella
 * @project CSC302 - Assignment1
 * @date September 3, 2016
 * 
 */

import java.util.Scanner;


public class Assignment1 {

	public static void main(String[] args) {
		
		int X;
		int n;
		
	
		
		System.out.println("Please enter how high you want to go in search of prime numbers:");
		
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		
		System.out.println("All Prime numbers from 1 to " + X + " are:" );
		
		for (n=1; n<=X; n++){ // Loop through numbers until the number defined by the user is hit
			
        
			
        isPrime(n);  // Will determine of n is prime or not
			
		
	         
		}
		
		
		

	} // End of main
	
	
	/*
	 * @param P - integer value for a Prime number 
	 * @param n - integer value for loop passed from Main 
	 * @param count - counter variable used for prime number determination
	 * @param is_prime - flag to be set for if a number is prime or not after logic is applied
	 * @returns void
	 * 
	 */
	
	
	public static void isPrime(int n){
		
		int P;
		int count = 1;		
		boolean is_prime = true;
		
	   
	    
	   P = ((int)Math.sqrt(n));
	
	   do {
		   
		   if ((n % count) == 0){
			
			   if ((((n / count) == 1) || ((n / count) == n))){
				   
				   is_prime = true;
				   
				   
			   }
			   
			   else{
				   
				   is_prime = false;
			   }
			   
			   
			   
		   }
		   		   
		   
		   count++;
		     
		   
	   }while (count <= P);
	   
	   
	   
	   if (is_prime == true){
		   
		 System.out.print(n + ", ");
		  
	   }
	   
	   if (is_prime == false) {
		   
		
		  
	   }
	     
	
	   
	} //end of isPrime Method
	}

