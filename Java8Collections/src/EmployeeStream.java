
public class EmployeeStream {
	private String firstname;
	private String lastname;
	private String department;
	private double salary;
	
	public EmployeeStream(String firstname, String lastname, String department, double salary ) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.salary =salary;
	}
	
	@Override
	public String toString() {
		return String.format("%-8s %-8s %8.2f %s", getFirstname(),getLastname() 
				,getSalary(),getDepartment());
				
	}
	
	public String getname() {
		return String.format("%s %s", firstname,lastname );	
	};
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
