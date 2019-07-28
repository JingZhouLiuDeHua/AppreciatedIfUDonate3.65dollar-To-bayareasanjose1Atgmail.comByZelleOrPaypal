package leetcode.mid.topK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequentElements_347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {  // jing zhou liu da hua yuan chuang 2019 07
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
 
        List<Integer> lamdaSort = new ArrayList<Integer>();
        map.entrySet().stream()
                            .sorted((p1, p2) -> p1.getValue() != p2.getValue() ? 
                                                p2.getValue() - p1.getValue() : p1.getKey().compareTo(p2.getKey()))
                            .limit(k)
                            .forEachOrdered(x-> lamdaSort.add(x.getKey()));
        // jing zhou liu da hua yuan chuang 2019 07
        System.out.println(map);     
        return lamdaSort;
   }
	
	public static void main(String[] args) {
	    int[] arr= {1,1,1,2,2,3};
	    topKFrequentElements_347 test=new topKFrequentElements_347();
	    List<Integer> res=test.topKFrequent(arr,2);
	    System.out.println(res);
	}
}
