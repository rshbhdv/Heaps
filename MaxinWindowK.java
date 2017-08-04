package Heaps;

import java.util.TreeMap;

public class MaxinWindowK {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		// TODO Auto-generated method stub

		int[] arr = {3,4,2,1,7,3,2,1,0,9};
		int k=3;
		int i=0;
		int j=3;
		for(int i2=0;i2<k;i2++)
			map.put(arr[i2], i2);
		for(int i1=3;i1<arr.length;i1++)
		{
			System.out.println("max->"+map.lastKey());
			map.remove(arr[i]);
			map.put(arr[j], j);
			i++;
			j++;
			map.put(arr[i1], i1);
			//System.out.println(arr[i1]);
			
		}
		System.out.println("max->"+map.lastKey());
	}

}
