package toStringMetod;

public class toString {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Pedro Duarte");
		Student s2 = new Student(2, "Victor Duarte");
		
		System.out.println(s1);
		System.out.println(s2);
		
		s2.setName("Thamires");
		System.out.println(s2.toString());
		
	}

}
