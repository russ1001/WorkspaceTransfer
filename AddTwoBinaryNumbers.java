import java.util.Scanner;

public class AddTwoBinaryNumbers {
		public static void main (String [] args){
			
			
			/* It does exactly what you do with the two binaries on a piece of paper to add one to the other. Starts with the last digits. If they are both zero - the sum is zero, 1 and zero result in 1, 1 and 1 result in 0 and 1 remains for the next digits (remainder). Then it goes to the next digits.
			binary1 % 10 is the last digit of binary1.
			binary1 = binary1 / 10 is for the next iterance when the next digits are taken. Since those are int (or long) values any binary /10 will be the same binary but without the last digit. 
			The remainder is always either 1 or 0, because (int)(0.5) = 0 and (int)(1.5)=1.
			When there's no digit left in one of them, the loop stops. 
			To print the sum it needs to start from the first to the last. that's why it goes back from the last i to 0, printing in one line the indices of one-dimensional array sum[].
			*/
			
			long binary1, binary2;
			int i = 0, remainder = 0;
			int[] sum = new int [20];
			Scanner in = new Scanner(System.in);
			
			System.out.print("Input first binary number: ");
			binary1 = in.nextLong();
			System.out.print("Input second binary number: ");
			binary2 = in.nextLong();
			
			in.close();
			
			while (binary1 !=0 || binary2 !=0)
			{
			sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2 );	
			remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
			}
			
			if (remainder !=0)
			{
				sum[i++] = remainder;
			}
			--i;
			System.out.print("The sum of two binary numbers: ");
			while (i>=0)
			{
				System.out.print(sum[i--]);
			}
					
			System.out.print("\n");		
			
	}
}
