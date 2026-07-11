package basic;


class Animals{
	
		void eats() {
			System.out.println("animals are mammals");
		}
}
class lion extends Animals{
		void bark() {
			System.out.println("ruling");
		}
	}
class Cat extends Animals{
	void meow() {
		System.out.println("meowing");
	}
}
public class heirarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.meow();
		c1.eats();

	}

}
