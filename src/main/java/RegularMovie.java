import java.math.BigDecimal;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title, "2.00");
	}

	// calculateFees Method

	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("2.00");
		if (days > 2) {
			BigDecimal extraDays = new BigDecimal(days - 2);
			amount = amount.add(new BigDecimal("1.5").multiply((extraDays)));
		}
		return amount;
	}

	public String getPriceCode() {
		return "regular";
	}

	public class RegularMovie2 extends Movie {

		public RegularMovie2(String title) {
			super(title, "2.00");

		}

		// calculateFees Method

		public BigDecimal calculateFees(int days) {
			BigDecimal amount = new BigDecimal("2.00");
			if (days > 2) {
				BigDecimal extraDays = new BigDecimal(days - 2);
				amount = amount.add(new BigDecimal("1.5").multiply((extraDays)));
			}
			return amount;
		}

		public String getPriceCode() {
			return "regular2";

		}

		public class RegularMovie3 extends Movie {

			public RegularMovie3(String title) {
				super(title, "2.00");

			}

			// calculateFees Method

			public BigDecimal calculateFees(int days) {
				BigDecimal amount = new BigDecimal("2.00");
				if (days > 2) {
					BigDecimal extraDays = new BigDecimal(days - 2);
					amount = amount.add(new BigDecimal("1.5").multiply((extraDays)));
				}
				return amount;
			}

			public String getPriceCode() {
				return "regular3";
			}
		}

	}

}
