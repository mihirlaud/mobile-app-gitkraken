public class QuotientRunner {

	public static void main(String[]args) {
	
		PrintQuotient p = (float a, float b) -> {
		
			System.out.printf("%.3f", a / b);
		
		};
		
		p.printQuotient(10.0f, 3.0f);
	
	}


}