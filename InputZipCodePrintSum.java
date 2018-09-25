/* Scanner class practice exercises
 * 
 * Enter the 5 digit zipcode and get the sum
 * 
 * ALGORITHM
 * 
 *                // base:  sum = 0, n = 123 
                  // step1: n % 10 = 3, n / 10 = 12 
                  //        sum = 3, n = 12 
                  // step2: n % 10 = 2, n / 10 = 1 
                  //        sum = 5, n = 1 
                  // step3: n % 10 = 1, n / 10 = 0 
                  //        sum = 6, n = 0 
                  // stop:  (n != 0) is false 
                  while (n != 0) { 
                        // add last digit to the sum 
                        sum += n % 10; 
                        // cut last digit
 */

import java.util.Scanner;

public class InputZipCodePrintSum {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Please enter your zicode: ");
		n = input.nextInt();
		
		if (n<= 0)
			System.out.println("The number you entered is negative or too large.");
		else {
			
			int sum = 0;
			
			while (n != 0){
				sum += n%10;
				n /= 10;
			}
			System.out.println("The sum of the entered zipcode digits is " + sum);	
			}
		}
		
		
	
		
		
		
		
		
		
	}





