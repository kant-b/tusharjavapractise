package pack1;

import java.util.Arrays;

public class java25 {

	public static int binarysearch(int[] arr, int key) {

		int l = 0, h = arr.length - 1, mid = 0;

		for (int i = 0; i <= arr.length; i++) {
			Arrays.sort(arr);
			
		}
		while (l <= h) {

			mid = (l + h )/ 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				h = mid - 1;
				l = l;

			} else {
				l = mid + 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 3, 9, 7, 4 };
		int key = 9;
		System.out.println(binarysearch(arr, key));
	}

}
