import java.util.Scanner;

public class ForLoopIterationWithInputVariable {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter a number: ");
		int x = input.nextInt();
		
		
		for (int i=0; i<=10; i++){
		
			System.out.println(x + " x " + i + " = " + (x * i));
			
		}
		
		
	input.close();
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
