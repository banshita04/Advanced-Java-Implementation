package com.projectconnect;

public class AlternatePlace {
	public static void main(String[] args) {
		int arr1[] = {3,1,-2,-5,2,-4};
		int arr2[] = new int[arr1.length];
		int c = 0;
		int ch = 1;
			for(int i = 0; i < arr1.length;i++) {
				if(arr1[i]>=0) {
					arr2[c] = arr1[i];
					c+=2;
				}else {
					arr2[ch] = arr1[i];
					ch+=2;
				}
			}
			
			for(int i = 0; i < arr1.length; i++) {
				System.out.println(arr2[i]);
			}

	}
}

