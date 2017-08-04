package Heaps;

import java.util.TreeMap;

public class MaxKnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		int[] arr = {1,2,3,65,3,23,90,8,4,-1,-111};
		for(int i=0;i<arr.length;i++)
		map.put(arr[i], i);
		
		int k=3;
		for(int i=0;i<k;i++)
		{
			System.out.println(map.lastKey());
		map.remove(map.lastKey());
		}
	
	}

}
