package leetcode.mid.DP.oneD;

import java.util.ArrayList;
import java.util.List;

public class maximumSubarray_53 {
   
	        public int maxSubArray(int[] arr) {
	            int res = arr[0]; 
	            int curr_max = arr[0]; 
	            for (int i = 1; i < arr.length; i++){ 
	               curr_max = Math.max(arr[i], curr_max+arr[i]); 
	               res = Math.max(res, curr_max); 
	            } 
	            return res; 
	        }
		
	        public List<Integer> maxSubArraySumReturnSubarray(int arr[]){ 
	        	List<Integer> res=new ArrayList<Integer>();
	            int maxSum = Integer.MIN_VALUE, 
	            	curr_max = 0,start = 0, 
	                end = 0, s = 0; 
	      
	            for (int i = 0; i < arr.length; i++){ 
	            	curr_max += arr[i]; 	      
	                if (maxSum < curr_max){ 
	                	maxSum = curr_max; 
	                    start = s; 
	                    end = i; 
	                } 	      
	                if (curr_max < 0){ 
	                	curr_max = 0; 
	                    s = i + 1; 
	                } 
	            } 
	            System.out.println("Maximum contiguous sum is " 
	                               + maxSum); 
	            for(int i=start;i<=end;i++)
	            	res.add(arr[i]);
	            
	            return res;
	        } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; 
		 maximumSubarray_53 test=new maximumSubarray_53();
		 int sum=test.maxSubArray(arr);
		 System.out.println("max sum is:"+sum);
		 List<Integer> res=test.maxSubArraySumReturnSubarray(arr);
		 System.out.println(res);
	}

}
