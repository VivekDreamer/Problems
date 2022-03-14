import java.util.Scanner;

public class ReverseBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// print the binary of the number and reversing bit
		boolean flag = false;
		int reverse = 0;
		int j = 0;
		for(int i = 31; i >= 0; i--) {
			int mask = (1 << i);
			if(flag) {
				if((n & mask)!=0) {
					System.out.print(1);
					int setMask = (1 << j);
					reverse |= setMask;
				}
				else
					System.out.print(0);
				j++;
			}
			else {
				if((n & mask)!=0) {
					flag = true;
					System.out.print(1);
					int setMask = (1 << j);
					reverse |= setMask;
					j++;
				}
				else {}
			}
		}
		System.out.println();
	System.out.print(reverse);
	}

}
