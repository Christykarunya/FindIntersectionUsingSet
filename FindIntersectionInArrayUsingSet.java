package week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionInArrayUsingSet {

	public static void main(String[] args) {
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		
		Set<Integer> inter= new LinkedHashSet<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			inter.add(arr2[i]);//loading arr2 in Set
		}
		for (int i = 0; i < arr1.length; i++) {
			if(!inter.add(arr1[i])) {//loading arr1 in Set which intersects with arr2
				System.out.println(arr1[i]);//to print intersecting values
			}
		//to print non intersecting values then use contains() instead of add() or remove ! from if statement
		}
		
	}

}
