import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		String str = "", sub ="";
		
		System.out.println("Enter the original string: ");
		str = new Scanner(System.in).nextLine();
		System.out.println("Enter the substring: ");
		sub = new Scanner(System.in).nextLine();
	//	logic1(str,sub);
		logic2(str,sub);
		
	}

	private static void logic2(String str, String sub) {
		int count = 0;
		for(int i =0;i<=str.length()-sub.length();i++) {
			if(str.charAt(i) == sub.charAt(0)) {
				int f = 0;
				for(int j =0;j<sub.length();j++) {
					if(str.charAt(i+j) != sub.charAt(j)) {
						f=1;
						break;
					}
				}
				if(f==0) {
					count+=1;
				}
			}
		}
		if(count==0)
			System.out.println("substring not found");
		else
			System.out.println("frequency is : "+count);
		
	}

	private static void logic1(String str, String sub) {
		int count = 0;
		for(int i =0; i<str.length();i++) {
			for(int j = i+1;j<=str.length();j++) {
				String t = str.substring(i,j);
				System.out.println(t);
				if(t.equals(sub))
					count+=1;
			}
		}
		if(count==0)
			System.out.println("substring not found");
		else
			System.out.println("frequency is : "+count);
		
	}


}
