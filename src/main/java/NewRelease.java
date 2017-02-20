import java.math.BigDecimal;

public class NewRelease extends Movie {
	public NewRelease(String title) {
		super(title, "3.00");
	}

	String title;

	// calculateFees Method

	public String getPriceCode() {
		return "New Release";
	}

	public BigDecimal calculateFees(int days) {

		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);

		return amount;
	}

	public class NewRelease2 extends Movie {
		public NewRelease2(String title) {
			super(title, "3.00");
		}

		String title2;

		// calculateFees Method

		public String getPriceCode() {
			return "New Release2";
		}

		public BigDecimal calculateFees(int days) {

			BigDecimal rentalDays = new BigDecimal(days);
			BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);

			return amount;
		}

		public class NewRelease3 extends Movie {
			public NewRelease3(String title) {
				super(title, "3.00");
			}

			String title2;

			// calculateFees Method

			public String getPriceCode() {
				return "New Release3";
			}

			public BigDecimal calculateFees(int days) {

				BigDecimal rentalDays = new BigDecimal(days);
				BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);

				return amount;
			}

		}

	}
}