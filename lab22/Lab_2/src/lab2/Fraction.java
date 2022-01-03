package lab2;

/**
 * This class represent fraction of two integer values
 * A fraction consists of two integers, one for numerator 
 *   and one for denominator.  An example fraction is 1/5.
 *   
 *   Note: A valid fraction must not have zero in the denominator.
 *   No need to simplify or reduce the fraction value  * 
 *
 */
public class Fraction {

	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	
	
	private int denominator;
	private int numerator;
	
	public Fraction() {
		this.denominator = 1;
		this.numerator = 0;
	}
	
	public Fraction(int numerator, int denominator) {
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void addFraction(Fraction f) {
		
		int d2 = f.getDenominator();
		int n2 = f.getNumerator();
		int d3 = 0;
		int n3 = 0;
	
			d3 = this.denominator * d2;
			n3 = this.numerator*d2 + n2*this.denominator;
			
			this.denominator = d3;
			this.numerator = n3;
		
	}
	
	public double getAbsValue() {
		
		double ans;
		
		ans = (double) this.numerator/(double)this.denominator;
		
		String result = String.format("%.7f", ans);
		
		double d = Double.parseDouble(result);
		
		return d;
		
	}
	
	public int getDenominator() {
		
		return this.denominator;
	}
	
	public int getNumerator() {
		
		return this.numerator;
	}
	
	public void setDenominator(int denominator) {
		
		this.denominator = denominator;
	}
	
	public void setFraction(int numerator, int denominator) {
		
		this.numerator = numerator;
		this.denominator = denominator;
		
	}
	
	public void setNumerator(int numerator) {
		
		this.numerator = numerator;
	}
	
	public java.lang.String toString() {
		
		return "Fraction (" + this.numerator + " / " + this.denominator + ")";
	}
}
