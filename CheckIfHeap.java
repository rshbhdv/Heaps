package Heaps;

public class CheckIfHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=true;
		int[] arr = {91,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length-2;i++)
		{
			if(2*i+2<arr.length)
			if(arr[i]>arr[2*i+1] || arr[i]>arr[2*i+2])
			{
				b=false;
			}
		}
		System.out.println(b);
	}

}
