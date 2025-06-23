package polymorphismprograms;

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("10 + 20 =" + calc.add(10, 20));
		System.out.println("10 + 20 + 30 =" + calc.add(10, 20, 30));
		System.out.println("5.5 + 4.5 =" + calc.add(5.5, 4.5));
		System.out.println("Hello + World =" + calc.add("Hello", "World"));


	}

}
