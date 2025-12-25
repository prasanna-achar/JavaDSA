package arrays;

import java.util.Arrays;

public class AllocateBooks {
	
	/*
	Problem: Allocate Books

	You are given an array arr[] of size N, where each element represents
	the number of pages in a book, and an integer M representing the number
	of students.

	Allocate books to students such that:
	1. Each student gets at least one book.
	2. Each book is allocated to exactly one student.
	3. Books allocated to a student must be contiguous.
	4. The objective is to minimize the maximum number of pages assigned
	   to any student.

	If it is not possible to allocate books according to the above rules,
	return -1.

	Example:
	Input:
	arr = [12, 34, 67, 90], M = 2

	Output:
	113

	Explanation:
	One optimal allocation is:
	Student 1 -> [12, 34, 67] (113 pages)
	Student 2 -> [90] (90 pages)
	The maximum pages allocated to a student is minimized to 113.
	*/

	
	private static boolean isPossible(int[] arr, int studentCount, int pageLimit) {
		int studentNumber = 1;
		int currentPageCount = 0;
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > pageLimit) {
				return false;
			}
			if(currentPageCount + arr[i] <= pageLimit) {
				currentPageCount += arr[i];
			}else {
				studentNumber++;
				if(studentNumber > studentCount) {
					return false;
				}
				currentPageCount = arr[i];
			}
		}
		return true;
	}
	
	public static int solution(int[] arr, int studentCount) {
		if(arr.length < studentCount) {
			return -1;
		}
		if(arr.length == studentCount) {
			return Arrays.stream(arr).max().getAsInt();
		}
		int l = Arrays.stream(arr).min().getAsInt();
		int r = Arrays.stream(arr).sum();
		int res = -1;
		while(l <= r) {
			int mid = ( l + r) / 2;
			if(isPossible(arr, studentCount, mid)) {
				res = mid;
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		return res;
	}
}
