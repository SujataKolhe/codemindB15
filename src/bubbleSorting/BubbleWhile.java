package bubbleSorting;

public class BubbleWhile {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 20, 70, 67, 98, 54 };
		int i = 0;
		int j = i + 1;
		int temp = 0;

		while (i < arr.length) {
			while (j < arr.length) {
				if (arr[i] < arr[j])
					temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
         j++;
		}
		System.out.println(arr[i]);
		i++;
	}

}
