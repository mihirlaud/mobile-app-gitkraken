public class Runner {

	public static void main(String[]args) {

		//Cory: I learned how to operate GitKraken. This is my first time using GitHub and GitKraken. I learned how to create and merge branches
		//		as well as how to write code in Lambda notation.

		PrintQuotient p = (float a, float b) -> {

			System.out.printf("%.3f", a / b);

		};

		p.printQuotient(10.0f, 3.0f);

		PerfectSquare printer = (int number) -> {

				int x = (int) Math.sqrt(number);
				if(Math.pow(x,2) == number)
					return true;
				else
					return false;



		};

		System.out.println(printer.PerfectSquare(25));

	}

}