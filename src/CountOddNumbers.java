
public class CountOddNumbers {

	public static void main(String[] args) {
		System.out.println(countOdds(7, 11));
	}
	public static int countOdds(int low, int high) {
		if(low % 2 == 0)
			low++;
		if(high % 2 == 0)
			high--;
		return (high-low)/2 + 1;
	}
}
