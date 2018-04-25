package com;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test123 {
	
	/* An equilibrium-point of array is an element for which sum on the left is equal to the sum on the right.
	 * Write a method that receives an array of integers as an argument and finds all equilibrium-points.
	 * The method needs to return indexes sorted in a descending order. Method signature: */

	/* Example 1
	Input: [1, 2, 3, 4, -1]
	Output: [2]
	
	Example 2
	Input: [1, 2, 3, 4, 5]
	Output: []
	
	Example 3
	Input: [1, 1, -1, -1, 3]
	Output: [4, 2, 1]
	
	Example 4
	Input: [1, 1, -1]
	Output: [0]
	
	*/
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(equalSum(new int[]{1, 1, -1, -1, 3})));
		System.out.println(Arrays.toString(equalSum(new int[]{1, 1, -1})));
		System.out.println(Arrays.toString(equalSum(new int[]{1, 2, 3, 4, 5})));
		System.out.println(Arrays.toString(equalSum(null)));
		
		
	}
	
	public static int[] equalSum(int[] data){
		
		if (data == null) {
			return new int[0];
		}
		
		int[] output = new int[data.length];
		int outputIndex = 0;
		int total = IntStream.of(data).sum();
		int leftSum = 0;
		
		for (int i = data.length-1; i >= 0; i--){
			int rightSum = total - leftSum - data[i];
			if (rightSum == leftSum) {
				output[outputIndex] = i;
				outputIndex++;
			}
			leftSum += data[i];
		}
		
		int[] trimmedOutput = new int[outputIndex];
		System.arraycopy(output, 0, trimmedOutput, 0, outputIndex);
		return trimmedOutput;
	}
	
	
}
