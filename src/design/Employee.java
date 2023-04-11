package design;

public interface Employee {
	void setFirstName(String firstName);

	void setLastName(String lastName);

	void setSalary(double salary);

	void setAge(int age);

	String getFullName();

	double getSalary();

	int getAge();
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.

}
