package edu.unca.csci201;

import java.util.Random;

public class QuickSort {

	
	
	public static void main(String[] args) {

		Random rand = new Random();
		
		// array of integers
		Integer [] ints = new Integer[20];
		for(int i = 0; i < ints.length; i ++) {
			ints[i] = rand.nextInt(20);
		}
		
		// array of rational numbers
		RationalNumber [] numbers = new RationalNumber[20];
		for(int i = 0; i < numbers.length; i ++) {
			numbers[i] = new RationalNumber(rand.nextInt(20), rand.nextInt(20));
		}
		
		
		// sort the arrays
		quicksort(ints);
		quicksort(numbers);

		
		// print out the arrays
		for(int i = 0; i < ints.length; i ++) {
			System.out.print(ints[i] + ", ");
		}
		System.out.println(); System.out.println();
		
		for(int i = 0; i < numbers.length; i ++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println();
	}

	public static void quicksort(Comparable [] arr) {
		quicksort(arr, 0, arr.length - 1);
	}
	
	public static void quicksort(Comparable [] arr, int begin, int end) {
		
		if (begin < end) {
			
			int part = partition(arr, begin, end);
			
			quicksort(arr, begin, part - 1);
			quicksort(arr, part + 1, end);
		}
	}
	
	public static int partition(Comparable [] arr, int begin, int end) {
		
		Comparable pivotElement = arr[ end];
		int returnval = begin;
		
		for (int i = begin; i < end; i ++) {
			
			if (arr[i].compareTo(pivotElement) < 0) {
				
				swap(arr, returnval, i);
				returnval ++;
				
			}
		}
		
		swap(arr, returnval, end);
		
		return returnval;
	}
	
	public static void swap(Comparable [] arr, int firstIndex, int secondIndex) {
		
		Comparable temp = arr[secondIndex];
		arr[secondIndex] = arr[firstIndex];
		arr[firstIndex] = temp;
	}
}
