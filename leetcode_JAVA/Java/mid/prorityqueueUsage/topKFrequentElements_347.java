package leetcode.mid.prorityqueueUsage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class topKFrequentElements_347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
 
        // create a min heap
        PriorityQueue<Map.Entry<Integer, Integer>> queue 
                  = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
       //maintain a heap of size k.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
           }
       }
 
       //get all elements from the heap
       List<Integer> result = new ArrayList<>();
           while (queue.size() > 0) {
           result.add(queue.poll().getKey());
       }
       //reverse the order
       Collections.reverse(result);
       return result;
   }
	
	public static void main(String[] args) {
	    int[] arr= {1,1,1,2,2,3};
	    topKFrequentElements_347 test=new topKFrequentElements_347();
	    List<Integer> res=test.topKFrequent(arr,2);
	    System.out.println(res);
	}
}
