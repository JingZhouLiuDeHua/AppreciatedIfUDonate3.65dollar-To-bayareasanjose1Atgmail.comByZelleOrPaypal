package leetcode.mid.topK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class topKFrequentWords_692 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String word : words) {// jing zhou liu de hua yuan chuang 2019 07
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        List<String> res = new ArrayList<String>();
        map.entrySet().stream()
                            .sorted((p1, p2) -> p1.getValue() != p2.getValue() ? 
                                                p2.getValue() - p1.getValue() : p1.getKey().compareTo(p2.getKey()))
                            .limit(k)// jing zhou liu de hua yuan chuang 2019 07
                            .forEachOrdered(x-> res.add(x.getKey()));

        System.out.println(map);     
        return res;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr= {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        topKFrequentWords_692 test=new topKFrequentWords_692();
        List<String> res=test.topKFrequent(arr,2);
        System.out.println(res);
	}

}
