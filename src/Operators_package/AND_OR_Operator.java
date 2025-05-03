package Operators_package;
public class AND_OR_Operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		float c = 9.3f;
		float d = 7.002f;
		if (a > b && b > a) //false ; true
		{System.out.println("first ");}
		if (a < b && b < a) // true ;false		
		{System.out.println("second ");	}
		if (b > a && a > a) //true ;false
		{System.out.println("third ");}
		if (a != b && b >= a) //true ;true
		{System.out.println("forth ");}
		System.out.println("##########################################");
		if (c > d || d > c) //true; false
			{ System.out.println("first ");	}
			if (c < d || d < c) //  true; false
			{System.out.println("second ");	}
			if (d > c || c > c) //false; false
			{System.out.println("third ");}
			if (c != d || d >= c) //true false
			{System.out.println("forth ");}
		}
	}


	


