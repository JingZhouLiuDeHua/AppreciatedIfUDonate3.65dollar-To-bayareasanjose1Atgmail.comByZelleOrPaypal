package java8NewFeaturesHotInterviewQuestions.LambdaIntroduce.Sample1;

public class FilterEmployeeBySalary implements MyPredicate<Employee> {
    @Override
    public boolean test(Employee t) {
    	return t.getSalary() >=8888; 	
    }
}
