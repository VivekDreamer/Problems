import java.util.Arrays;

public class MagicBeans {

	public static void main(String[] args) {
		int[] arr = {4,1,6,5};
		System.out.println(minimumRemoval(arr));
	}
	public static long minimumRemoval(int[] beans) {
    
        Arrays.sort(beans);    
        long total = 0;
        long min = Long.MAX_VALUE;
        int n = beans.length;
        
        for(int bean : beans)
            total+=bean;
        
        for(int i = 0; i < n ; i++){
            long currentAns = total - ((n - i +0L)*beans[i]);
            min = (long)Math.min(min,currentAns);
        }
        return min;
    }
}
