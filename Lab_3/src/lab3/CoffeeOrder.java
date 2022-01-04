package lab3;

/**
 * <strong>Create CoffeeOrders</strong>
 * <p>
 * Define a class named <i>CoffeeOrder</i>. Declare a private string field that
 * holds the coffee type to indicate whether the coffee type is
 * <strong><code>AmericanDark</code> , <code>AmericanRegular</code>,
 * <code>Espresso</code>, <code>Latte</code> or <code>IceCoffee</code></strong>.
 * <p>
 * Also, declare a private string field that hold the cup size to indicate
 * whether the cup size is <strong><code>S</code> ,<code>M</code> ,
 * <code>L</code> or <code>XL</code></strong>.
 *
 */

public class CoffeeOrder {

	/**
	 * The coffeeType can be one of the following choices
	 * <strong><code>AmericanDark</code> , <code>AmericanRegular</code>,
	 * <code>Espresso</code>, <code>Latte</code> or <code>IceCoffee</code></strong>.
	 * <p>
	 * The default value is <strong> <code>AmericanRegular</code></strong>
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String coffeeType;

	/**
	 * The cupSize can be one of the following choice <strong><code>S</code> ,
	 * <code>M</code> , <code>L</code> or <code>XL</code></strong>.
	 * <p>
	 * The default value is <strong> <code>S</code></strong>
	 * </p>
	 */
	// ALREADY IMPLEMENTED; DO NOT MODIFY
	private String cupSize;

	/**
	 * Default constructor set the attributes to default values
	 * 
	 */

	public CoffeeOrder() {

		/* Your implementation of this method starts here. */
		this.coffeeType = "AmericanRegular";
		this.cupSize = "S";

	}

	/**
	 * Constructor create a new CoffeeOrder by assigned coffeeType and cupSize
	 * attributes.
	 * 
	 * @param coffeeType the coffee type
	 * @param cupSize    the cup size
	 * 
	 *                   @pre.
	 *                   <p>
	 *                   <strong> Precondition </strong>
	 *                   </p>
	 *                   <p>
	 *                   The coffee type should be one of the following choices
	 *                   <strong><code>AmericanDark</code> ,
	 *                   <code>AmericanRegular</code>, <code>Espresso</code>,
	 *                   <code>Latte</code> or <code>IceCoffee</code></strong>.
	 *                   <p>
	 *                   and The cup size should be one of the following choices
	 *                   <strong><code>S</code>, <code>M</code> , <code>L</code> or
	 *                   <code>XL</code></strong>.
	 *                   </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the coffee type is not one of the
	 *                                  following choices
	 *                                  <strong><code>AmericanDark</code> ,
	 *                                  <code>AmericanRegular</code>,
	 *                                  <code>Espresso</code>, <code>Latte</code> or
	 *                                  <code>IceCoffee</code></strong>. or if the
	 *                                  cup size is not one of the following choices
	 *                                  <strong><code>S</code>, <code>M</code> ,
	 *                                  <code>L</code> or <code>XL</code></strong>.
	 *                                  </p>
	 */
	public CoffeeOrder(String coffeeType, String cupSize) {

		/* Your implementation of this method starts here. */

		if (coffeeType != "AmericanDark" && coffeeType != "AmericanRegular" && coffeeType != "Espresso"
				&& coffeeType != "Latte" && coffeeType != "IceCoffee") {

			throw new IllegalArgumentException("error");
		}

		if (cupSize != "S" && cupSize != "M" && cupSize != "L" && cupSize != "XL") {

			throw new IllegalArgumentException("error");
		}

		this.coffeeType = coffeeType;
		this.cupSize = cupSize;

	}

	/**
	 * Copy constructor Set the coffee type and cup size by copying another coffee
	 * order attributes
	 * 
	 * @param otherOrder another coffee order
	 */
	public CoffeeOrder(CoffeeOrder otherOrder) {

		/* Your implementation of this method starts here. */

		this.coffeeType = otherOrder.coffeeType;
		this.cupSize = otherOrder.cupSize;

	}

	/**
	 * This method is for internal use. It will help to reduce code duplication.
	 * Sets the coffee type and cup size of this coffee order object to <strong>
	 * <code>newCoffeeType</code> and <code>newCupSize</code></strong>,
	 * respectively.
	 * 
	 * @param newCoffeeType the new coffee type
	 * @param newCupSize    the new cup size
	 * 
	 *                      @pre.
	 *                      <p>
	 *                      <strong> Precondition </strong>
	 *                      </p>
	 *                      <p>
	 *                      The coffee type should be one of the following choices
	 *                      <strong><code>AmericanDark</code> ,
	 *                      <code>AmericanRegular</code>, <code>Espresso</code>,
	 *                      <code>Latte</code> or <code>IceCoffee</code></strong>.
	 *                      <p>
	 *                      and The cup size should be one of the following choices
	 *                      <strong><code>S</code>, <code>M</code> , <code>L</code>
	 *                      or <code>XL</code></strong>.
	 *                      </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the coffee type is not one of the
	 *                                  following choices
	 *                                  <strong><code>AmericanDark</code> ,
	 *                                  <code>AmericanRegular</code>,
	 *                                  <code>Espresso</code>, <code>Latte</code> or
	 *                                  <code>IceCoffee</code></strong>. or if the
	 *                                  cup size is not one of the following choices
	 *                                  <strong><code>S</code>, <code>M</code> ,
	 *                                  <code>L</code> or <code>XL</code></strong>.
	 *                                  </p>
	 */

	private void setCoffee(String newCoffeeType, String newCupSize) {

		/* Your implementation of this method starts here. */

		if (coffeeType != "AmericanDark" && coffeeType != "AmericanRegular" && coffeeType != "Espresso"
				&& coffeeType != "Latte" && coffeeType != "IceCoffee") {

			throw new IllegalArgumentException("error");
		}

		if (cupSize != "S" && cupSize != "M" && cupSize != "L" && cupSize != "XL") {

			throw new IllegalArgumentException("error");
		}

		this.coffeeType = newCoffeeType;
		this.cupSize = newCupSize;

	}

	/**
	 * Sets the coffee type of this coffee order object to <strong>
	 * <code>newCoffeeType</code></strong>.
	 * 
	 * @param newCoffeeType the new coffee type
	 * 
	 * 
	 *                      @pre.
	 *                      <p>
	 *                      <strong> Precondition </strong>
	 *                      </p>
	 *                      <p>
	 *                      The coffee type should be one of the following choices
	 *                      <strong><code>AmericanDark</code> ,
	 *                      <code>AmericanRegular</code>, <code>Espresso</code>,
	 *                      <code>Latte</code> or <code>IceCoffee</code></strong>.
	 * 
	 *                      </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the coffee type is not one of the
	 *                                  following choices
	 *                                  <strong><code>AmericanDark</code> ,
	 *                                  <code>AmericanRegular</code>,
	 *                                  <code>Espresso</code>, <code>Latte</code> or
	 *                                  <code>IceCoffee</code></strong>..
	 * 
	 */

	public void setCoffeeType(String newCoffeeType) {

		/* Your implementation of this method starts here. */

		if (coffeeType != "AmericanDark" && coffeeType != "AmericanRegular" && coffeeType != "Espresso"
				&& coffeeType != "Latte" && coffeeType != "IceCoffee") {

			throw new IllegalArgumentException("error");
		}

		this.coffeeType = newCoffeeType;
	}

	/**
	 * Sets the cup size of this coffee order object to
	 * <strong><code>newCupSize</code></strong>.
	 * 
	 * @param newCupSize the new cup size
	 * 
	 *                   @pre.
	 *                   <p>
	 *                   <strong> Precondition </strong>
	 *                   </p>
	 *                   <p>
	 *                   The cup size should be one of the following choices
	 *                   <strong><code>S</code>, <code>M</code> , <code>L</code> or
	 *                   <code>XL</code>.</strong>
	 *                   </p>
	 * 
	 * @throws IllegalArgumentException
	 *                                  <p>
	 *                                  if the cup size is not one of the following
	 *                                  choices <strong><code>S</code>,
	 *                                  <code>M</code> , <code>L</code> or
	 *                                  <code>XL</code></strong>.
	 *                                  </p>
	 */

	public void setCupSize(String newCupSize) {

		/* Your implementation of this method starts here. */

		if (cupSize != "S" && cupSize != "M" && cupSize != "L" && cupSize != "XL") {

			throw new IllegalArgumentException("error");
		}

		this.cupSize = newCupSize;
	}

	/**
	 * String representation of CoffeeOrder object if
	 * {@code CoffeeOrder o =  new CoffeeOrder("AmericanDark","S")} then
	 * {@code o.toString()} returns the string
	 * <p>
	 * {@code "Coffee Order with Coffee type is AmericanDark and cup size is S"}.
	 * </p>
	 * 
	 * 
	 * @return String representation of CoffeeOrder object
	 */

	/**
	 * Get the coffeeType value for this coffee order
	 * 
	 * @return the coffeeType value for this coffee order
	 */
	public String getCoffeeType() {
		/* Your implementation of this method starts here. */

		return this.coffeeType;

	}

	/**
	 * Get the cupSize value for this coffee order
	 * 
	 * @return the coffeeSize value for this coffee order
	 */
	public String getCupSize() {
		/* Your implementation of this method starts here. */
		return this.cupSize;

	}

	/**
	 * This method calculate the Coffee Order time. 
	 * The time needed to prepare the coffee order  
	 * 
	 * After determining the coffee order  type and size, the coffee order time is 
	 * calculated the preparation time (in Seconds) as following: 
	 * <p>
	 * {@code  Preparation time = 1.5 + (coffee order type) + (cup size) * 1.5}
	 * </p>
	 * It should be noted that the coffee order time returns 
	 * the Preparation time in seconds rounded to 
	 * the largest integer value that is less than or equal to the calculated Preparation time.
	 * 
	 * Furthermore, the coffee order time  has the following parameters For
	 * coffee  type and cup size:
	 * <p>
	 * coffee type
	 * </p>
	 * <code>AmericanDark</code>: 9 Seconds, <code>AmericanRegular</code>: 5 Seconds,
	 * <code>Espresso</code>: 8 Seconds, <code>Latte</code>: 6 Seconds, 
	 * <code>IceCoffee</code>: 3 Seconds,
	 * <p>
	 * Cup  size
	 * </p>
	 * <p>
	 * <code>S</code>: 2 Seconds, <code>M</code>: 2.45 Seconds, <code>L</code>: 4.5
	 * Seconds, <code>XL</code>: 6 Seconds
	 * </p>
	 * 
	 * @return  The Coffee Preparation time in Seconds rounded to  the largest integer value that is less than or equal
	 * to the preparation time.
	 */

	public int coffeeOrderTime() {
		/* Your implementation of this method starts here. */
		
		int coffeeOrderType = 0;
		double cupOrderSize = 0;
		
		if(this.coffeeType == "AmericanDark") {
			
			coffeeOrderType = 9;
		
		}
		else if (this.coffeeType == "AmericanRegular") {
			
			coffeeOrderType = 5;
		
		}
		else if (this.coffeeType == "Espresso") {
			
			coffeeOrderType = 8;
		
		}
		else if (this.coffeeType == "Latte") {
			
			coffeeOrderType = 6;
		
	}
		else {
			
			coffeeOrderType = 3;
		}
		
	if (this.cupSize == "S") {
		
		cupOrderSize = 2;
	
	}
	
	else if(this.cupSize == "M") {
		
		cupOrderSize = 2.45;
		
	}
	
	else if(this.cupSize == "L") {
		
		cupOrderSize = 4.5;
		
	}
	
	else {
		cupOrderSize = 6;
	}
	
	double orderTime = 1.5 + (double)(coffeeOrderType) + cupOrderSize *1.5;
	
	return (int)orderTime;
	}

	@Override
	public String toString() {
		/* Your implementation of this method starts here. */
		
		
		return "Coffee Order with Coffee type is "+ this.coffeeType + " and cup size is " + this.cupSize;
		
	}

}
