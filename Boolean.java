
public class Boolean {

	public static void main(String[] args) {
		
		
		boolean b = false;
		b = true;

		boolean toBe = false;
		b = toBe || !toBe;
		if (b) {
			System.out.println(toBe);
		}
		
		// Boolean conditionals
		
				int x = 4;
				if (x == 4) {
					System.out.println("Oh, so x is 4!");
				}
		
				
				
				
		
				// if / else statements
				int a = 1;
				int bb = 2;
				
				if (a == bb){
					System.out.println("Yes, a and bb are equal.");
				}
				else {
					System.out.println("No, a and bb are not equal!");
				}
				
			
				
				
				
				
				// if else statement with the operator ?
								
				int q = 4;
				int result = q == 4 ? 1 : 8;
				System.out.println(result);
				
				
				
				
				
				// Similar way to write the same code (obviously different comparison with q != 4)
			
				
				int result1;
				if(q != 4){
					result1 = 1;
				}
				else {
					result1 = 8;
				}
				System.out.println(result1);
				
				
				
				

				// == operator and 'equals' method
				
				String w = new String ("Wow");
				String t = new String ("Wow");
				String sameW = w;
				
				boolean r1 = w == t;
				boolean r2 = w.equals(t);
				boolean r3 = w == sameW;
				
				System.out.println(r1);
				System.out.println(r2);
				System.out.println(r3);
				
				
				
				
				
				// changing the variables declared below so that the boolean statements are all true
				
				String aa = new String ("Wow");
				String bbb = "Wow";
				String cc = aa;
				
				

		        boolean bb1 = aa == bbb;
		        boolean bb2 = bbb.equals(bbb + "!");
		        boolean bb3 = !cc.equals(aa);

		        if (bb1 && bb2 && bb3) {
		            System.out.println("Success!"); 
		        }
		        else{
		        	
		        	System.out.println("Not successful...");
		        }
				
		        
		        
		        
		       
	                
	        
		        
		        
		        
		        
		        
		
		
	}

}
