
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		while(true) {
		System.out.println(closestNumber(n));
		System.out.println("*****************************************************************************");
		n = sc.nextInt();
		}
	}

	private static int closestNumber(int n) {
		int a[][] = new int[4][3];
		a[0][0]=1;a[0][1]=2;a[0][2]=3;
		a[1][0]=4;a[1][1]=5;a[1][2]=6;
		a[2][0]=7;a[2][1]=8;a[2][2]=9;
		a[3][0]=11;a[3][1]=0;a[3][2]=11;
		
		
		if(n < 10)return n;
		
		if(n>=10 && n<100) {			
			int [] dummy = new int[2];
			dummy[0]= n/10;
			dummy[1]= n%10;
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			return getAnswer(n,a);
		}
					

		if(n>=100 && n<=200) {
			int [] dummy1 = new int[3];
			dummy1[0] = n/100;
			int p = n%100;
			dummy1[1] = (n%100)/10;
			dummy1[2] = n%10;
//			System.out.println("dummy[1] : "+dummy1[0]);
			return ((dummy1[0]*100)+getAnswer(p,a));			
		}
		return -1;
	}

	private static int getAnswer(int n, int[][] a) {
		int [] dummy = new int[2];
		dummy[0]= n/10;
		dummy[1]= n%10;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = dummy[0];
		
		for(int i = 0;i<=3;i++) {
			for(int j = 0; j<=2; j++) {
				if(a[i][j] == result && j==2 && i==2 ) {
					return (result*10)+a[i][j];
				}
				if(a[i][j] == result && j==2) {
					int k = i;int resultLast=0;
					while(k<=2) {
						map.put((result*10)+a[k][j], Math.abs(((result*10)+a[k][j])-n));
						k++;
					}
					int value = Collections.min(map.values());
					for(Entry<Integer, Integer> entry: map.entrySet()) {
						 if(entry.getValue() == value) {
							resultLast =  entry.getKey();
						 }
					}
					map.clear();
					return resultLast;
				}
				if(a[i][j] == result && j==1) {
					int k =i;int l = j; int resultLast = 0;
					while(k<=3) {
						map.put((result*10)+a[k][j], Math.abs((result*10)+a[k][j]-n));
						k++;
					}
					while(l<=2) {
						map.put((result*10)+a[i][l], Math.abs((result*10)+a[i][l]-n));
						l++;
					}
					int value = Collections.min(map.values());
					for(Entry<Integer, Integer> entry: map.entrySet()) {
						 if(entry.getValue() == value) {
							 resultLast = entry.getKey();
						 }
					}
					/*
					 * for(Map.Entry m : map.entrySet()){
					 * System.out.println(m.getKey()+" "+m.getValue()); }
					 */  
					map.clear();
					return resultLast;
				}
				if(a[i][j] == result && j==0) {
					int k =i;int l = j;int resultLast = 0;
					while(k<=2) {
						map.put((result*10)+a[k][j], Math.abs((result*10)+a[k][j]-n));
						k++;
					}
					while(l<=2) {
						map.put((result*10)+a[i][l], Math.abs((result*10)+a[i][l]-n));
						l++;
					}
					int value = Collections.min(map.values());
					for(Entry<Integer, Integer> entry: map.entrySet()) {
						 if(entry.getValue() == value) {
							 resultLast = entry.getKey();
						 }
					}
					map.clear();
					return resultLast;
				}	
			}	
		}
		return -1;
	}
}
	
