interface GarrafaDeAgua {
	
	String color = "Blue";
	
	void encher();
	
}



public class ExemploInterface implements GarrafaDeAgua{
	
	public static void main(String[] args) {
		System.out.println(color);
		ExemploInterface exemplo = new ExemploInterface();
		exemplo.encher();
		
		
	}

	@Override
	public void encher() {
		System.out.println("cheia.");
		
	}
}
