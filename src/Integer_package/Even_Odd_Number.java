package Integer_package;

public class Even_Odd_Number {

	public static void main(String[] args) {

		// For loop

		/*
		 * for (int i = 0; i < 20; i++) { if (i % 2 == 0){ System.out.println("EVEN no."
		 * + i); } else{ System.out.println("ODD no. " + i); }
		 

		// While loop
		
		 * int i = 1; while (i <= 10) { if (i % 2 == 0) { System.out.println("EVEN no."
		 * + i); } else { System.out.println("ODD no. " + i);
		 * 
		 * } i++; }
		 

		// while loop
		int i = 1;
		while (i <= 10) {
			System.out.println("output start with :" + i);
			i++;
		}*/
		
		//Do_while loop
		int i=1;
		
		do { 
			//System.out.println("count the no." +i);
			if(i%2==0) {
				System.out.println("the no is Even: "+i);
						}
			else {
				System.out.println("the no is odd: "+i);
			}
			i++;
		}
			
		while(i<=10);
		
	}
}
