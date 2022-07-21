package Polimorfismo;

public class TestePassaros extends Bird{
	
	public static void main(String[] args) {
		
		Bird b = new Bird();
		b.name = "Pombo";
		b.sing();
		System.out.println(b.name);
		
		Robin pelican = new Robin();
		pelican.color = "Black";
		pelican.sing();
		
		
	}

}
