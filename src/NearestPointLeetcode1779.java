import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class NearestPointLeetcode1779 {

	public static void main(String[] args) {
		System.out.println(nearestValidPoint1(3, 4, new int[][] {{1,2},{3,1},{2,4},{2,3},{4,4}}));

	}
	
	public static int nearestValidPoint(int x, int y, int[][] points) {
		List<int[]> asList = Arrays.asList(points);
		int result = 0;
		Map<List, Integer> map = new HashMap<List, Integer>();
		
		for(int i = 0 ; i < points.length; i++) {
			int j = 0;
				int k = points[i][j];
		        int s = points[i][j+1];
				if(k == x || s == y) {
					List<List<Integer>> list = new ArrayList<List<Integer>>();
					List<Integer> l = new ArrayList<>();
					l.add(k);
					l.add(s);
					list.add(l);
					map.put(list, method2(list,x,y));
				}		
		}
		
		System.out.println(map);
		List<Integer> resultList =  new ArrayList<Integer>();
		Integer min = Collections.min(map.values());
		for(List<Integer> l : map.keySet()) {
			if(Objects.equals(map.get(l),min)){
				List<Integer> l2 = l;
				System.out.println(l2);
				int in=0;
				for(int[] ak : asList) {
					if(Arrays.toString(l2.toArray()).contains(Arrays.toString((asList.get(in++))))) {
						resultList.add(in-1);
					}
				}
			}
		}
		
		return Collections.min(resultList);
    }

	private static int method2(List<List<Integer>> list, int x, int y) {
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			int first = Math.abs(list.get(i).get(0) - x);
			int second =  Math.abs(list.get(i).get(1) - y);
			if(first < second) 
				result = second;
			else
				result = first;
		}
		return result;
	}
	
	
	//logic 2 simple
	public static int nearestValidPoint1(int x, int y, int[][] points) {
		int index = -1;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < points.length; i++) {
			int[] temp = points[i];
			if(temp[0] == x || temp[1] == y) {
				if(min > (Math.abs(x-temp[0]) + Math.abs(y - temp[1]))){
					min = Math.abs(x-temp[0]) + Math.abs(y - temp[1]);
					index = i;
				}
			}
		}
		return index;
	}	
}
