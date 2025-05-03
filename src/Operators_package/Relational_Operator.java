package Operators_package;

public class Relational_Operator {

	public static void main(String[] args) {
		int P=5;
		int Q=10;
		int R=15;
		if (P==Q && R!=Q) // false true
			{System.out.println("1st case ");}
		else if(R>Q && P<Q) // true true
		{System.out.println("2nd case");}
		else if (Q<=P || P>=R) //false false
			{System.out.println("3rd case");}
		if (P==Q || R>=P) //false, true
        {System.out.println("4th case");}
		else if( R>=P && P!=Q) //true false
		{System.out.println("5th case");}

		
		}
	}

