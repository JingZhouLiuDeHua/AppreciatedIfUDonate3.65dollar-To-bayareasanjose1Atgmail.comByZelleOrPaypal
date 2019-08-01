package java8NewFeaturesHotInterviewQuestions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class sample {

	public static void filter(List<Integer> numbers, Predicate<Integer> condition1, Predicate<Integer> condition2) {
	    // you can define as much as conditions you wish introduced by JingZhouLiuDeHua
		for(Integer number: numbers) {
	    	if(condition1.and(condition2).test(number)) {
	    		System.out.println("filtered number: "+number);
	    	}
	    }	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> numbers = Arrays.asList(-1,-2,-3,-4,1,2,3,4,5,6,7);
        filter(numbers, n -> n>0, n -> n<6);
	}

}
