import java.math.BigDecimal;

public class Rental {

	private Movie rented;
	private int days;

	public Rental(Movie rented, int days) { // constructor
		this.rented = rented; // this.rented assigns variable to the PRIVATE
								// variable
		this.days = days;
	}

	public BigDecimal calculateFees() {
		return rented.calculateFees(days);
	}

	public String getTitle() {
		return rented.getTitle();

	}

	public String getPriceCode() {
		return rented.getPriceCode();

	}
}
