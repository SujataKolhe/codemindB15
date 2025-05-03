package Operators_package;

public class ternary_operator {
	
	
	 void operator() {
		 int salary;
		int age=30;
			
			salary = age>30? 50000:100000; //salary =30>=29 
		//	When age is greater than 30 salary=100000
			//When age is smaller than 30 salary=50000
			if (age>29) {
				System.out.println("Salary will be : "+ salary);
			}
			else {
				System.out.println("Sallary will be" +salary);
			}
			
	    System.out.println("salary is : "+ salary);
	    	
	    }

	public static void main(String[] args) {
	   ternary_operator O1 =new ternary_operator();
	   O1.operator();

	}

}
