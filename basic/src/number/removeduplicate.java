package number;

public class removeduplicate {

public static int duplicate(int[] arr) {
	int j=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=arr[j])
			arr[++j]=arr[i];
		}
	return j;
	
}
public static void main(String[] args) {
	int[]arr= {5,6,4,3,3,4,3,9};
	int length=duplicate(arr);
	for(int i=0;i<length;i++) {
		System.out.println(arr[i]);
  }
 }
}


