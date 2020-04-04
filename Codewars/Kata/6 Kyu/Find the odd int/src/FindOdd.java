public class FindOdd {
	public static int findIt(int[] A) {
  
  int odd=0;
		for(int i=0;i<A.length;i++){
			odd = odd^A[i];
		}
  
  	return odd;
  }
}