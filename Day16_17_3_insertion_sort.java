package Day16_17_problem;

public class Day16_17_3_insertion_sort {
	public static void insertionSort(int array[]) {
		int insert = array.length;
		for (int j = 1; j < insert; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String a[]) {
		int[] arr1 = { 8, 12, 3, 4, 47, 87, 5, 15, 67 };
		System.out.println("Before Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

		insertionSort(arr1);

		System.out.println("After Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
