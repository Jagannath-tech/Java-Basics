package basic;

class vehicle{
	int price=101000;
	vehicle(String name){
		System.out.println(name);
	}
	void sound() {
		System.out.println("makes sound");
	}
	}


class yamaha extends vehicle{
	yamaha(){
		super("pulsar"); //initialises constructor parameter in suerclass
		super.sound(); // calls the function
		System.out.println("rx100");
		System.out.println(super.price);  //access the fields
		
	}
}
public class superex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       yamaha y1=new yamaha(); //constructor is called immediately
	}

}
