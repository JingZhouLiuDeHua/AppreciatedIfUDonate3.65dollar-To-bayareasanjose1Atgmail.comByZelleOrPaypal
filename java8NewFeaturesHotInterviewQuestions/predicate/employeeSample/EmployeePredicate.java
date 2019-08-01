package java8NewFeaturesHotInterviewQuestions.predicate.employeeSample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
    public static Predicate<Employee> isAdultMale(){
    	return p -> p.getAge()>21 && p.getGender().equalsIgnoreCase("M");   			
    }
    
    public static Predicate<Employee> isAgeMoreThan(Integer age){
    	return p -> p.getAge() > age;
    }
	
	public static List<Employee>  filterEmployees(List<Employee> employees,Predicate<Employee> condition){
        return employees.stream()
        		        .filter(condition)
        		        .collect(Collectors.<Employee>toList());
	}
}
