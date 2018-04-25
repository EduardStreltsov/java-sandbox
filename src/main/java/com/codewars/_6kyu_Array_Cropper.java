package com.codewars;

/*You need to crop an array of ints,
such as if it is an image and you want to crop a specific segment from it
in the graphics editor to remove the maximum amount of the background
and leave only the object you intrested in.
        
        The background consists of 0.
        The object consists of 1.
        
        For example the Array:
        
        {0,1,0,0},
        {0,0,1,0},
        {1,1,1,0},
        {0,0,0,0}
        After the cropping will look like:
        
        {0,1,0},
        {0,0,1},
        {1,1,1}*/

import java.util.Arrays;

public class _6kyu_Array_Cropper {
	
	public static int[][] getCroppedFieldAsArray(int[][] arr) {
		
		int minx = arr.length - 1, maxx = 0, miny = arr.length - 1, maxy = 0;
		
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				
				if (arr[x][y] > 0) {
					minx = Math.min(minx, x);
					miny = Math.min(miny, y);
				}
				if (arr[arr.length - 1 - x][arr.length - 1 - y] > 0) {
					maxx = Math.max(maxx, arr.length - 1 - x);
					maxy = Math.max(maxy, arr.length - 1 - y);
				}
			}
		}
		
		if (minx == arr.length - 1 || miny == arr.length - 1) {
			return new int[0][];
		}
		
		int[][] newarr = Arrays.copyOfRange(arr, minx, maxx);
		for (int i = 0; i < newarr.length; i++) {
			arr[i] = Arrays.copyOfRange(arr[i], miny, maxy);
		}
		print(arr);
		print(newarr);
		return newarr;
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[4][4];//{{1}, {1,1}};
		arr[0] = new int[]{0, 0, 0, 0};
		arr[1] = new int[]{0, 1, 0, 0};
		arr[2] = new int[]{0, 1, 0, 0};
		arr[3] = new int[]{0, 1, 0, 0};
		
		print(arr);
		
	}
	
	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("" + arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------------");
	}
}
