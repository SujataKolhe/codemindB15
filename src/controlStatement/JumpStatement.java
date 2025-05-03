package controlStatement;

public class JumpStatement {
	// Break..
	public static void main(String[] args) {
		int i;
		
		  for (i = 1; i <= 10; i++) { if (i == 5) break; {
		  System.out.println("break the statement: " + i);
		  
		  }
		 }

		for (i = 1; i <= 10; i++) {

			if (i == 6)
				continue;

			{
				System.out.println("continue statement after: " + i);
			}

		}
	}

}
