package basic;

public class basicfunction {
	void greetings() {
		System.out.println("hello");
		sendoff();     //calls fn sendoff
	}
	void serve() {
		System.out.println("have dinner");
	}
	void sendoff() {
		System.out.println("byee");
	}
	static void nexttime() {
		System.out.println("see you tomorrow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basicfunction obj1=new basicfunction();
		obj1.greetings();
		
		obj1.serve();
		
		nexttime();  //obj does not needed to call static function
		

	}

}
