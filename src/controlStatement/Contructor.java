package controlStatement;

public class Contructor {
	int i;
	float j;
	String city;
	boolean l;
	
	void State() {
		//float j= 1f;  when we want to declare constructor ,cant declare variable locally
		System.out.println("value of i :"+ i);
		System.out.println("value of j :"+ j);
		System.out.println("print city name:"+ city);
		System.out.println("result is: "+l);
			
	}
public static void main(String[]args) {
	Contructor S1= new Contructor(); // for memory allocation , we use constructor
	S1.State();
	
}
}
