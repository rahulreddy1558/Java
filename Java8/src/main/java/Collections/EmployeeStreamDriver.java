package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStreamDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeStream[] employess = {
		new EmployeeStream("jason","red","IT",5000),
		new EmployeeStream("Ashely","Green","IT",4500),
		new EmployeeStream("Matthew","Indigo","Sales",3857.5),
		new EmployeeStream("James","Bluw","Construciton",4700.5),
		new EmployeeStream("Luke","Plup","Finance",3200.45),
		new EmployeeStream("Jain","Yellow","IT",1250.2),
		new EmployeeStream("Mark","Brown","IT",5585.6) 
		};
		
		List<EmployeeStream> list = Arrays.asList(employess);
		list.stream().forEach(System.out::println);
		
		System.out.println("printing rows that have salary between 4000 and 6000%n");
		
		Predicate<EmployeeStream> fourthou = 
				e -> (e.getSalary() >= 4000 && e.getSalary() <=  6000);
		list.stream()
		.filter(fourthou)
		.sorted(Comparator.comparing(EmployeeStream::getSalary))
		.forEach(System.out::println);
		System.out.println("printing  first employee%n ");
		
		Comparator<EmployeeStream> lasthenfirst = 
				Comparator.comparing(EmployeeStream::getFirstname).thenComparing(EmployeeStream::getLastname);
		System.out.println("printing  last then first %n ");
		list.stream()
		.sorted(lasthenfirst)
		.forEach(System.out::println);
		
		System.out.println("printing  distinct last name");
		list.stream()
		.map(EmployeeStream::getLastname)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("Grouping by department");
		
		Map<String, List<EmployeeStream>> groupedbydepartment = 
				list.stream()
				.collect(Collectors.groupingBy(EmployeeStream::getDepartment));
 
		
		groupedbydepartment.forEach( 
				(department, employeesindepartment) -> 
				{ 
					System.out.println(department);
					employeesindepartment.forEach( employe -> System.out.printf("%s%n",employe));
				
				} 
		);
		
		
		
	}

}
