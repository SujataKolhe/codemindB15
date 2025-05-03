package Operators_package;

public class Arithmatic_operators {

	int P=10; // Initialization
	double Q=2;

	void Addition() {
		System.out.println("Adition of P and Q :  " + (P + Q));

	}

	void Substraction(int P, int Q) {
		System.out.println("substraction of P and Q :  " + (P - Q));
	}

	int Multiplication() {
		System.out.println("Multiplication of P and Q :  " + (P * Q));
		return P;

	}

	int Division(int P, int Q) {
		System.out.println("Division of P and Q :  " + (P / Q));
		return P;

	}

	void Module(int P, int Q) {
		System.out.println("module of P and Q :  " + (P % Q));
	}

	public static void main(String[] args) {
		Arithmatic_operators m1 = new Arithmatic_operators();

		m1.Addition();
		m1.Substraction(0, 0);
		m1.Multiplication();
		m1.Division(10, 2);
		m1.Module(11, 2);

	}
}
