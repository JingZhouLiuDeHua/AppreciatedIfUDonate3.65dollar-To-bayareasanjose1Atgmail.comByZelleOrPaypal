package leetcode.mid.java8LambdaUsage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequentWords_692 {

	class Pair {
        String word;
        int freq;

        Pair(String word, int freq) {
            this.word = word;
            this.freq = freq;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        List<String> lamdaSort = new ArrayList<String>();
        map.entrySet().stream()
                            .sorted((p1, p2) -> p1.getValue() != p2.getValue() ? 
                                                p2.getValue() - p1.getValue() : p1.getKey().compareTo(p2.getKey()))
                            .limit(k)
                            .forEachOrdered(x-> lamdaSort.add(x.getKey()));

        System.out.println(map);     
        return lamdaSort;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr= {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        topKFrequentWords_692 test=new topKFrequentWords_692();
        List<String> res=test.topKFrequent(arr,2);
        System.out.println(res);
	}

}
