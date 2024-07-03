public class Employee2
 {
	
	 static int eid;
	 static String ename;
	 static int esalary;
	
	public static int getId() {
		return eid;
	}
	
	public void setId(int eid) {
		this.eid=eid;
	}
	
	public static String getName() {
		return ename;
	}
	
	public void setName(String ename) {
		this.ename=ename;
	}
	
	public static int getSalary() {
		return esalary;
	}
	
	public void setSalary(int esalary) {
		this.esalary=esalary;
	}





	public static void main(String[] args) {
		
		Employee obj=new Employee();
		
		//Setting bean values
		obj.setId(102);
		obj.setName("Ravi");
		obj.setSalary(77000);
		
		
		//getting bean values
		System.out.println("Employee Id is: "+Employee.getId());
		System.out.println("Employee name is:" +Employee.getName());
		System.out.println("Employee Salary is:"+Employee.getSalary());
	}

}
