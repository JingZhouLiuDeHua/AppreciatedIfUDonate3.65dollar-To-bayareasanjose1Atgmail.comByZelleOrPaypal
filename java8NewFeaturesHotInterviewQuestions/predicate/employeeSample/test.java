package java8NewFeaturesHotInterviewQuestions.predicate.employeeSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java8NewFeaturesHotInterviewQuestions.predicate.employeeSample.EmployeePredicate.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
	        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
	        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
	        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
	        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
	        Employee e6 = new Employee(6,15,"M","David","Feezor");
	        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
	        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
	        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
	        Employee e10 = new Employee(10,45,"M","Naveen","Jain");
	         
	        List<Employee> employees = new ArrayList<Employee>();
	        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
	        System.out.println( filterEmployees(employees, isAdultMale()) );
	        System.out.println( filterEmployees(employees, isAgeMoreThan(35)) );
	}

}
