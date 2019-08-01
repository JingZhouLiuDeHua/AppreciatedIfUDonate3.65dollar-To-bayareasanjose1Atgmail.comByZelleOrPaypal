package java8NewFeaturesHotInterviewQuestions.LambdaIntroduce.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class streamSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 map
        List<Integer>  numbers= Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> sqList=numbers.stream()
        		             .map(i ->  i*i)
        		             .distinct()
        		             .limit(3)
        		             .collect(Collectors.toList());
        System.out.println(sqList);
        
        //-------------------------------------------------
        //2 filter
        List<String>  strList1=Arrays.asList("1234","5678", "", "bc", "", "d");
        int empCount =  (int)strList1.stream()
        		            .filter(s -> s.isEmpty())
        		            .count();
        int lenLarge3Count =(int)strList1.stream()
	            .filter(s -> s.length() > 3)
	            .count();
        
        System.out.println("empty string count is " + empCount);
        System.out.println("length >3's string count is " + lenLarge3Count);
        
        //-------------------------------------------------
        //3 sort, forEach
        Random random = new Random();
        random.ints().limit(8).sorted().forEach(System.out::println);
        
        //-------------------------------------------------
        //4 collect, Collectors.toList, Collectors.join, 
        //convert stream to list, get required elements and return
        List<String> strList2= Arrays.asList("123","","abc","","efg");
        List<String> filteredList=strList2.stream()
        		                          .filter(s -> !s.isEmpty() )
        		                          .collect(Collectors.toList());
        System.out.println(filteredList);
        String mergedString = strList2.stream()
        		                      .filter(s -> !s.isEmpty())
        		                      .collect(Collectors.joining("#"));        
        System.out.println("mergedList is " + mergedString);
        
        //-------------------------------------------------
        //5 reduce ,factorial, sum
        List<Integer> numbers1= Arrays.asList(1,2,3,4,5,6,7);
        Integer sum = numbers1.stream()
        		             .reduce((s,t) -> s+t)
        		             .get();
        
        System.out.println("sum of arrays is " + sum);
        		
	}

}
