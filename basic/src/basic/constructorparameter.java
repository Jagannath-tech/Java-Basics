package basic;

public class constructorparameter {
	int marks;
	String name;
	constructorparameter(){
		System.out.println("empty constructor");
	}
	constructorparameter(int a,String b){
		marks=a;
		name=b;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorparameter obj1=new constructorparameter(10,"jagan");
		constructorparameter obj2=new constructorparameter(20,"jack");
		System.out.println(obj1.marks);
		System.out.println(obj2.name);
		

	}

}
