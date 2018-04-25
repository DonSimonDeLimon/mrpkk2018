package quicksort;

public class QuickSort {
	//
	private int[] zahlen = {4,56,5,4,3,334,5,56,67,2};
	//

	public static void main(String[] args) {
		new QuickSort();

	}

	public QuickSort() {
		sort (0, zahlen.length - 1);
		//
		for (int i : zahlen)
				System.out.println(i);
		}
	
	public void sort (int l, int r) {
		if (l < r) {
			int teiler = teile(l, r);
			sort(l, teiler);
			sort(teiler+1, r);
		}
	}

	private int teile(int l, int r) {
		int i = l;
		int j = r-1;
		int pivot = zahlen[r];
		//
		do {
			//
			while(zahlen[i] < pivot && i < r - 1)
				i = i++;
			//
			while(zahlen[j] >= pivot && j > l)
				j = j--;
			//
			if (i < j) {
				int temp = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = temp;
			}
			//
		} while (i < j);
		//
		if (zahlen[i] > pivot) {
			int temp = zahlen[i];
			zahlen[i] = zahlen[r];
			zahlen[r] = temp;
	}
	//
		return i;
		
}}

