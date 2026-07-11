package string;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="hello";
		int count=0;
		for(int k=0;k<b.length();k++) {
			char ch=b.charAt(k);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	count=count+1;
		}
	}
		System.out.println(count);
		System.out.println(b.length());
}
}