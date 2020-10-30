package lol;
class Employee{
	String name;
	int year,salary;
	String address;
	
	Employee(String name,int year,int salary,String address) {
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;	
	}
	public void display() {
		System.out.println(name+"    "+year+"       "+address+"   "+salary);		
	}
}
public class clsprogram{
	
	public static void main(String[] args) {
		Employee emp[]=new Employee[3];
		emp[0]=new Employee("Robert",1994,20000,"64C-WallsStreet");
		emp[1]=new Employee("Sam",2000,30000,"68D-WallsStreet");
		emp[2]=new Employee("John",1999,40000,"26B-WallsStreet");
		System.out.println("Name"+"     "+"Year of joining"+"       "+"Address"+"   "+"Salary");
	    for(int i=0;i<3;i++) {
	     emp[i].display();
	    }
	}
}