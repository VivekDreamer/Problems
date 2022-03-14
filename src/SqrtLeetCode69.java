
public class SqrtLeetCode69 {

	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	}
    public static int mySqrt(int x) {
      int y = 0;
      while(y * y <= x)
    	  y++;
      return y-1;
    }

}
