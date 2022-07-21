package interfaceExample;

interface WaterBottleInterface{
	
	String color = "Blue";
	
	void fillup();	
	void pourOut();
	
	
}

public class InterfaceExample implements WaterBottleInterface {

	public static void main(String[] args) {
		System.out.println(color);	
		
		InterfaceExample ex = new InterfaceExample();
		ex.fillup();
		ex.pourOut();
	}

	@Override
	public void fillup() {
		System.out.println("It is filled");
		
	}

	@Override
	public void pourOut() {
		System.out.println("It is filled");
		
	}
	
}
