import java.util.Arrays;


public class mergeSort {
	public mergeSort() {
		
	}
	//p,q,r are indices of Array, where p <= q < r
	public int[] sort(int[] a, int p,int q, int r){
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] Left = Arrays.copyOfRange(a, 1, n1+1);
		int[] Right = Arrays.copyOfRange(a, 1, n2+1);
		for(int i = 1; i < n1; i++){
			Left[i] = a[p+i - 1];
		}
		for(int j = 1; j < n2; j++){
			Right[j] = a[q+j]; 
		}
		Left[n1+1] = (int) Double.POSITIVE_INFINITY; //Sentinal; Adds infinity to the end of the left subarray
		Right[n2+1] = (int) Double.POSITIVE_INFINITY; //Sentinal; Adds infinity to the end of the right subarray
		
 		int i = 1; int j = 1;
 		int k = p;
 		while(k < r){
 			if (Left[i] <= Right[j]){
 				a[k] = Left[k];
 				i = i + 1;
 			}
 			if(a[k] == Right[j]){
 				j = j + 1;
 			}
 		}
		return a;
	}
	public int[] merge(int[] a, int p, int r){
		int q = (int) Math.floor((p+r)/2);
		this.merge(a, p, q);
		this.merge(a, q+1, r);
		this.sort(a, p, q, r);		
		return a;
	}
}
