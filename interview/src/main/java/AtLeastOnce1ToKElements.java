
public class AtLeastOnce1ToKElements {

	public static void main(String[] args) {
		//int[] A = {1,1,1,2,2,3,4,4};
		//int[] A = {1};
		int[] A = {1,2,2,2};
		int k = 2;
		AtLeastOnce1ToKElements ato = new AtLeastOnce1ToKElements();
		System.out.println(ato.solution(A, k));
	}

	private boolean solution(int[] A, int k){
		int n = A.length;
		for (int i = 0; i < n-1; i++) {
			if((A[i] != A[i+1]) && (A[i] +1 != A[i+1])){
				return false;
			}
		}
		if(A[0] != 1 || A[n-1] != k){
			return false;
		}
		return true;
	}
}
