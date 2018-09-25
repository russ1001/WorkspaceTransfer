
public class ArrayListTest {

	public static void main(String[] args) {
		
		java.util.ArrayList cityList = new java.util.ArrayList();
		
		// keeps track of the order in which they are entered
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		// london, denver, paris, miami, seoul, tokyo
		System.out.println("List size ? " + cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());
		
		
		cityList.add(2, "Xian");
		// london, denver, xian, paris, miami, seoul, tokyo
		
		cityList.remove("Miami"); 
		// london, denver, xian, paris, seoul, tokyo
		
		cityList.remove(1);
		// london, xian, paris, seoul, tokyo
		
		
		System.out.println(cityList.toString());
		
		for(int i=cityList.size()-1; i>=0; i--){
			
			System.out.println(cityList.get(i) + " ");
			
		}
		
		System.out.println();

		
		
		
		
	}

}
