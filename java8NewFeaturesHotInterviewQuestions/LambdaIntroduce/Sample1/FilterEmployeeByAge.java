package java8NewFeaturesHotInterviewQuestions.LambdaIntroduce.Sample1;

public class FilterEmployeeByAge implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee t) {
    	return t.getAge() >=21; 	
    }
}
