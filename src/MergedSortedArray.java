import java.util.Arrays;

public class MergedSortedArray {

	public static void main(String[] args) {
	int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
	int	n = 3,m=3;
			merge(nums1, m, nums2, n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i = 0 ; i < nums1.length; i++) {
			if(i >= m)
				nums1[i] = nums2[i-m];
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}

}
