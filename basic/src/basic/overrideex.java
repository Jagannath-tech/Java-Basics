package basic;

class zoo{
	String name;
	int age;
	
	void makesound() {
		System.out.println("animals make sound");
	}
}

class horse extends zoo{
	String Breed;
	
	void makesound() { //over riding
		System.out.println("Dog barks");
	}
}

class tiger extends zoo{
	String color;
	
	void makesound() { //over riding
		System.out.println("meow");
	}
}

public class overrideex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		horse d1=new horse();
		d1.name="mark";
		d1.age=5;
		d1.makesound();
		tiger c1=new tiger();
		c1.color="white";
		c1.makesound();
	}

}
