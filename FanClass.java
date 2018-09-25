
public class FanClass {

	
	public static void main(String[] args){
		
		Fan1 fan1 = new Fan1();
		// used to set the private member variables
		fan1.setSpeed(Fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		System.out.println(fan1.toString());
		
		Fan1 fan2 = new Fan1();
		// used to set the private member variables
		fan2.setSpeed(Fan1.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		System.out.println("\n" + fan2.toString());
	}
}


class Fan1{
	

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	// use private member variables to keep track of the Fan state
	// so that other people who are using our classes just don't change the member variables 
	// without thinking whether the input is valid
	// within the methods there would be validation of the variable data
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "white";
	
	public Fan1(){
		
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String toString(){
		return "speed " + speed + "\n" + "color " + color + "\n" + "radius " + radius + "\n" + ((on) ? "fan is on " : "fan is off ");
		
	}
	
	
}