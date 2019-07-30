package java8NewFeaturesHotInterviewQuestions.LambdaIntroduce.Sample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;



public class TestLambda {
	
    @Test   //anonymous inner  class
    public void test1() {
        Comparator<Integer> com =new Comparator<Integer>() {
        	@Override
        	public int compare(Integer o1,Integer o2) {
        		return Integer.compare(o1,o2);
        	}
        };
    }
    
    @Test   //lambda
    public void test2() {
    	Comparator<Integer> com=(x,y) -> Integer.compare(x, y);
    	TreeSet<Integer> ts= new TreeSet<>(com);
    }
    
    static List<Employee> employees =Arrays.asList(
    		new Employee("zhang san", 18, 9999.99),
    		new Employee("li si"    , 19, 8888.88),
    		new Employee("wang wu"  , 20, 7777.77),
    		new Employee("zhao liu" , 21, 6666.66),
    		new Employee("wang ma zi"  , 22, 5555.55)
    		);
    
    //demand: retrieve employee's age > 35
    @Test
    public void test3() {
    	List<Employee> list= filterEmployees1(employees);
    	for(Employee employee: list) {
    		System.out.println(employee.getName());
    	}
    }
    
    
    public  List<Employee>  filterEmployees1(List<Employee> list){
    	List<Employee> emps =new ArrayList<>();
    	for(Employee emp: list) {
    		if(emp.getAge() >=11) {
    			emps.add(emp);
    		}
    	}
    	return emps;
    }
    
    //demand: retrieve salary >= 7777
    //if another client request comes, we need to modify just 1 line code,
    //emp.xxx xxx xxx
    // too poor/bad design,too many redundant code as below
    public  List<Employee>  filterEmployees2(List<Employee> list){
    	List<Employee> emps =new ArrayList<>();
    	for(Employee emp: list) {
    		if(emp.getSalary() >= 7777) {
    			emps.add(emp);
    		}
    	}
    	return emps;
    }
    
    
    //optimization 1:
    // use Strategy Pattern and generalize
    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> mp){
    	List<Employee> emps =new ArrayList<>();
    	for(Employee employee: list) {
    		if(mp.test(employee)) {
    			emps.add(employee);
    		}
    	}
    	return emps;
    }

    @Test
    public void test4() {
    	List<Employee>  list = filterEmployee(employees,new FilterEmployeeByAge());
    	for(Employee employee: list) {
    		System.out.println(employee.getName());
    	}
    	List<Employee>  list2 = filterEmployee(employees,new FilterEmployeeBySalary());
    	for(Employee employee: list2) {
    		System.out.println(employee.getName());
    	}
    }
    
    
    
    // use lambda as below:
    @Test
    public void testLambda() {
    	List<Employee> list = filterEmployee(employees, (e) -> e.getSalary() >=7000 );
    	list.forEach(System.out::println);
    }
    
    //use lambda as below, use stream API
    //very IMPRESSIVE solution thanks to java8's lambda
    @Test
    public void test7() {
    	employees.stream()
    	         .filter((e) -> e.getSalary() >=7000)
    	         .limit(2)
    	         .forEach(System.out::println);
    }
    
    

    
}
