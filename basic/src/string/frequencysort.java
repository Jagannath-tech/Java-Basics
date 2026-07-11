package string;

public class frequencysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abacccdd";
		char c[]=a.toCharArray();
		int count=0;
		
		for(int i=0;i<c.length-1;i++) {
			for(int j=0;j<c.length-1;j++)
			if(c[i]==c[j+1]) {
				count+=1;
				System.out.println(c[j]);
			}
		}
	}

}
