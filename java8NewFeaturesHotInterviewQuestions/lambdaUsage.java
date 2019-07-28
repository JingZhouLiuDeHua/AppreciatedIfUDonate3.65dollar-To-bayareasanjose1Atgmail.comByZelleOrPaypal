package java8NewFeaturesHotInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lambdaUsage {
	public List<Integer> topKFrequent(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {  // jing zhou liu de hua yuan chuang 2019 07
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
 
        List<Integer> res = new ArrayList<Integer>();
        map.entrySet().stream()
                            .sorted((p1, p2) -> p1.getValue() != p2.getValue() ? 
                                                p2.getValue() - p1.getValue() : p1.getKey().compareTo(p2.getKey()))
                            .limit(k)
                            .forEachOrdered(x-> res.add(x.getKey()));
        // jing zhou liu de hua yuan chuang 2019 07
        System.out.println(map);     
        return res;
   }
	
	public static void main(String[] args) {
	    int[] arr= {1,1,1,2,2,3};
	    lambdaUsage test=new lambdaUsage();
	    List<Integer> res=test.topKFrequent(arr,2);
	    System.out.println(res);
	}
}
