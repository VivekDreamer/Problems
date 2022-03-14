//time complexity = O(nlogn)
public class MergeSort {
	public static void conquer(int[] arr, int start, int mid, int end) {
		//O(n)
		int[] mergedArray = new int[end-start+1];
		
		int index1 = start;
		int index2 = mid+1;
		int x = 0;
		
		while(index1<=mid && index2<=end) {
			if(arr[index1] <= arr[index2]) {
				mergedArray[x++] = arr[index1++];
			}
			else {
				mergedArray[x++] = arr[index2++];
			}
		}
		while(index1<=mid)
			mergedArray[x++] = arr[index1++];
		while(index2<=end)
			mergedArray[x++] = arr[index2++];
		
		for(int i = 0,j=start; i < mergedArray.length; i++,j++) {
			arr[j] = mergedArray[i];
		}	
	}
	public static void divide(int[] arr, int start, int end) {
		//O(logn)
		if(start>=end)return;
		int mid = start + (end - start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conquer(arr, start, mid, end);
	}
	
	public static void main(String[] args) {
		int[] arr = {6,3,9,5,2,8};
		int n = arr.length;
		divide(arr, 0, n-1);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
