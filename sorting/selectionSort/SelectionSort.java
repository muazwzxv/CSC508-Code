
public class SelectionSort  {

	public static void main(String[] args) {
		int[] arr = {3, 455, 22, 11, 35, 73, 1, 0, -5, 99};

		sort(arr);

		for (int i:arr) {
			System.out.println(i+"");
		}
	}
	
	public static void sort(int[] arr) {
		System.out.println(arr.length);
		for (int i = 0; i < arr.length - 1; i++) {

			int index = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smol = arr[index];
			arr[index] = arr[i];
			arr[i] = smol;
		}
	}
}
