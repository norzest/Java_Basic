package java_20210507;

import java.util.Iterator;

public class MethodDemo {
	
	public static void main(String[] args) {
		int[] array = {5, 3, 5, 2, 9};
		
		MethodDemo MethodDemo = new MethodDemo();
		
		System.out.println(MethodDemo.plus(3, 5));	
		System.out.println(MethodDemo.isLeafYear(2020));
		MethodDemo.bubble_sort(array);
		for (int i = 0; i < array.length; i++) {			
			System.out.print(array[i]);
		}
		
		System.out.println();
		MethodDemo.print(2021, 5);
	} // main

	public int plus(int x, int y) {
		return x + y;
	} // plus
	
	public boolean isLeafYear(int year) {
		return year%4==0 && year%100!=0 || year%400==0;
	} // isLeafYear
	
	public void bubble_sort(int[] arr) {
		for (int j = 0; j < arr.length; ++j) { // bubble sort
			for (int k = 0; k < arr.length-j-1; ++k) {
				if (arr[k] >= arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				} // if
			} // for k
		} // for j
	} // bubble sort
	
	public void print(int year, int month) {
		int[] month_day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		if (isLeafYear(year)) {
			month_day[1] += 1; // 윤년일시 2월 29일 추가
		} // if
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for (int i = 0; i <= month_day[month-1]; ++i) {
			System.out.print(i + "\t");
			
			if (i % 7 == 6) { System.out.println(); }
		} // for i
		
	} // print
	
} // class
