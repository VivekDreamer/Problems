import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingList {

	public static void main(String[] args) {
		Integer[] arr = {10,7,10,11,10,7,12,5};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		System.out.println(sortBasedOnFrequencyAndIndex(list));

	}

	private static List<Integer> sortBasedOnFrequencyAndIndex(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
		}
		System.out.println(map);
		Collections.sort(list, (k1,k2) -> {
			int frequency1 = map.get(k1);
			System.out.println("k1     "+k1);
			System.out.println(frequency1);
			int frequency2 = map.get(k2);
			System.out.println("k2     "+k2);
			System.out.println(frequency2);
			System.out.println("************************************************************************");
			if(frequency1 != frequency2)
				return frequency2 - frequency1;
			return list.indexOf(k1) - list.indexOf(k2);
		});
		return list;
	}

}
