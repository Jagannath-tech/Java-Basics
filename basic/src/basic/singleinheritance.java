package basic;
class Animal{
	void eats() {
		System.out.println("animals are mammals");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}

public class singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.eats();
		d1.bark();

	}

}
