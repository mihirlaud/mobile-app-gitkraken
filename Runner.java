public class Runner {

	public static void main(String[]args) {
		
		// Mihir: I learned how to use GitKraken to merge
		// separate branches into one branch to get the edits
		// of both branches on one project.
	
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