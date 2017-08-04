package Heaps;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MergeKsorted {

	static class ArrayContainer implements Comparable<ArrayContainer> {
		int[] arr;
		int index;
	 
		public ArrayContainer(int[] arr, int index) {
			this.arr = arr;
			this.index = index;
		}
	 
		@Override
		public int compareTo(ArrayContainer o) {
			return this.arr[this.index] - o.arr[o.index];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {3,4,5,6};
		int[] arr2 = {1,45,65,77};
		int[] arr3 = {2,2,2,2};
		int[] arr4 = {0,0,7};
		int[] res = merge(new int[][]{arr1,arr2,arr3,arr4});
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}
public static int[] merge(int[][] arr)
{
	//PriorityQueue is heap in Java 
			PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
			int total=0;
	 
			//add arrays to heap
			for (int i = 0; i < arr.length; i++) {
				queue.add(new ArrayContainer(arr[i], 0));
				total = total + arr[i].length;
			}
	 System.out.println("total->"+total);
			Iterator it = queue.iterator();
		      while (it.hasNext()){
			   System.out.println ( "Value: "+ it.next()); 
			   }
		      
			int m=0;
			int result[] = new int[total];
	 
			//while heap is not empty
			while(!queue.isEmpty()){
				
				ArrayContainer ac = queue.poll();
				result[m] = ac.arr[ac.index];
				m++;
				if(ac.index < ac.arr.length-1){
					queue.add(new ArrayContainer(ac.arr, ac.index+1));
				}			
//				ArrayContainer ac = queue.poll();
//				result[m++]=ac.arr[ac.index];
//	 
//				if(ac.index < ac.arr.length-1){
//					queue.add(new ArrayContainer(ac.arr, ac.index+1));
//				}
			}
	 
			return result;
}
}
