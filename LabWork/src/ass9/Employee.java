package ass9;

import java.time.LocalDate;

public class Employee {
 
	 Integer employeeId;
	 String firstName;
	 String lastName;
	 String email;
	 String phoneNumber;
	 LocalDate hireDate;
	 String designation;
	 Double salary;
	 Integer managerId;
	 Department department;
	 
	 Employee(Integer employeeId, String firstName,String lastName, String email,String phoneNumber,LocalDate hireDate,String designation,Double salary,Integer managerId){
		 this.employeeId=employeeId;
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.email=email;
		 this.phoneNumber=phoneNumber;
		 this.hireDate=hireDate;
		 this.designation=designation;
		 this.salary=salary;
		 this.managerId=managerId;
		 
	 }
	 
	 
}
