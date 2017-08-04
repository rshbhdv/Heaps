package Heaps;

import java.util.Map;
import java.util.TreeMap;

public class Heaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		int[] arr = {12,11,14,16,13,15,17};
		int l = arr.length;

		int k=3;
		boolean b=true;
		int i=0,j=3;
		for(int i2=0;i2<k;i2++){map.put(arr[i2], i2);}
		//System.out.println("after->");
		while(i<l)
		{
            int key = map.firstKey();
			arr[i] = key;
					map.remove(key);
//			System.out.println("arr->"+arr[i]);
//			for(Map.Entry<Integer, Integer> map1 : map.entrySet())
//				{
//					System.out.println("map->"+map.firstEntry());
//				}
		//	System.out.println("hrere->");
			i++;
		if(j<l){
	//	System.out.println(arr[j]+" &&  "+j);
		map.put(arr[j], j);
		}
		j++;

		}
		
		for(int i1=0;i1<arr.length;i1++)
		{
			System.out.println("arr->"+arr[i1]);
		}
	}

}
