package lesson10.labs.prob7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();
		
		  System.out.println(emps
				    .filter(e -> (e.getSalary() > 100000))
				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
				    .map(e -> fullName(e))
				    .sorted()
				    .collect(Collectors.joining(", ")));
				               
		             

	}

	/**
	 * Method 1
	 */
	public String asString1(Stream<Employee> emps){
		return emps
				.filter(e -> (e.getSalary() > 100000))
				.filter(e -> (e.getLastName().charAt(0) > 'M'))
				.map(e -> fullName(e))
				.sorted()
				.collect(Collectors.joining(", "));
	}

	/**
	 * Method 2
	 */
	public String asString2(Stream<Employee> emps){
		return emps
				.filter(Main::salaryGreaterThan100000)
				.filter(Main::lastNameAfterM)
				.map(Main::fullName)
				.sorted()
				.collect(Collectors.joining(", "));
	}
	public void printEmps(Stream<Employee> list){
		System.out.println(asString2(list));
	}


	public static boolean salaryGreaterThan100000(Employee e){
		return e.getSalary()>1000;
	}

	public static boolean lastNameAfterM(Employee e){
		return (e.getLastName().charAt(0) > 'M');
	}
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
