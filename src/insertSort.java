public class insertSort {

	public insertSort(int[] arrayIn) {
		for (int i = 1; i < arrayIn.length; i++){
			int key = arrayIn[i]; 
			int j;
			for(j = i - 1; j >= 0 && key < arrayIn[i]; j--)
				arrayIn[j+1] = arrayIn[j];
			arrayIn[j+1] = key;
		}
	}

}
