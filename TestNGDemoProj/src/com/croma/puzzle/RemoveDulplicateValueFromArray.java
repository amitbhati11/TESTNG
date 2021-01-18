package com.croma.puzzle;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDulplicateValueFromArray {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,4,5,6,7,3,2,8,9,55,55,66,55,77};
		List<Integer> list = Arrays.asList(arr);
		HashSet<Integer> set = new HashSet<>(list); 
		for (Integer integer : set) {
			System.out.println(integer);
		}

		Object[] obj  = set.toArray();
		arr = (Integer[]) obj;
		
		System.out.println(arr);
	}

}
