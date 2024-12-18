
package com.searching;

public class BinarySearch {
	public static int searchKey(int num, int arr[]) {
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int mid = right-(right-left)/2;
			
			if(arr[mid]==num) {
				return 1;
			}
			else if(num<arr[mid]) {
				right = mid-1;
			}
			else if(num>arr[mid]) {
				left = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,11,21,45,68,290};
		System.out.println(searchKey(290, arr));
	}

}
