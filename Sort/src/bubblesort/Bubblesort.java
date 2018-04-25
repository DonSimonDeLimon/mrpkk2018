package bubblesort;

public class Bubblesort {
	
	public static void main(String[] args) {
		new Bubblesort();
		//
	}
	
	public Bubblesort() {
		//
		int[] zahlen = {3,6,6,2,6,7,2,54,8,9};
		//
		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n-1; i++) {
				if(zahlen[i]>zahlen[i+1]) {
					int temp = zahlen[i];
					zahlen[i] = zahlen[i+1];
					zahlen[i+1] = temp;
				}
			}
		}
		//
		for (int e = 0; e < zahlen.length; e++) {
			System.out.println(zahlen[e]);
		}
	}
}

