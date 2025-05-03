package controlStatement;

public class DecisionMaking {
	// if Statement.

	void ifStatement() {
		int marks = 25;
		if (marks >= 35) {
			System.out.println("Result is pass!");
		}
	}
	// if-else Statement

	void ifelseStatement() {
		int Marks = 25;
		if (Marks >= 35) {
			System.out.println("Result is Pass!");
		} else {
			System.out.println("Result is Fail!");

		}
	}

	// if-else-if statement

	void ifelseifStatement() {
		int Marks = 10;
		if (Marks > 35) {
			System.out.println("Student is Pass! & Added Sports Quota Marks : " );
		} else if (Marks >= 31 && Marks < 32) {
			System.out.println("Student pass with grace 5");
		} else if (Marks >= 32 && Marks < 33) {
			System.out.println("Student pass with grace 4");
		} else if (Marks >= 33 && Marks < 34) {
			System.out.println("Student pass with grace 3");
		} else if (Marks >= 34 && Marks < 35) {
			System.out.println("Student pass with grace 2");
		} else if (Marks >= 35 && Marks < 36) {
			System.out.println("Student pass with grace 1");

		} else {
			System.out.println("Student is fail so marks will be withdrawn : "+(Marks=Marks+10));
		}
		
		
	}

	void SwitchStatement() {
		int num = 1153434454;

		switch (num) {
		case 1:
			System.out.println("First : ");
			break;
		case 2:
			System.out.println("Second : ");
			break;
		case 3:
			System.out.println("Third :");
			break;
		case 4:
			System.out.println("Four :");
			break;
		case 5:
			System.out.println("Five :");
			break;
		case 6:
			System.out.println("Six : ");
			break;
		case 7:
			System.out.println("Seven :");
			break;
		case 8:
			System.out.println("Eight :");
			break;
		case 9:
			System.out.println("Nine :");
			break;
		case 10:
			System.out.println("Ten :");
			break;
		default :
			System.out.println("not found");

		}
	}

	public static void main(String[] args) {
		DecisionMaking DM = new DecisionMaking();
		 //DM.ifStatement();
		// DM.ifelseStatement();
	DM.ifelseifStatement();
		//DM.SwitchStatement();

	}
}
