package basic;

class jungle{
	
		void animal() {
			System.out.println("animals");
		}
}
class lions extends jungle{
		void rules() {
			System.out.println("rules");
		}
	}
class cub extends lions{
	void eats() {
		System.out.println("eats");
	}
}

public class multiinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cub p1=new cub();
		p1.animal();
		p1.rules();
		p1.eats();

	}

}
