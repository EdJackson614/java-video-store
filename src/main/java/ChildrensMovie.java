import java.math.BigDecimal;

public class ChildrensMovie extends Movie {
	public ChildrensMovie(String title) {
		super(title, "1.50");
	}

	public String getPriceCode() {
		return "childrens";
	}

	public BigDecimal calculateFees(int days) {
		BigDecimal amount = new BigDecimal("1.50");
		amount = new BigDecimal("1.50");

		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}
		return amount;
	}

	public class ChildrensMovie2 extends Movie {
		public ChildrensMovie2(String title) {
			super(title, "1.50");
		}

		public String getPriceCode() {
			return "childrens2";
		}

		public BigDecimal calculateFees(int days) {
			BigDecimal amount = new BigDecimal("1.50");
			amount = new BigDecimal("1.50");

			if (days > 3) {
				BigDecimal extraDays = new BigDecimal(days - 3);
				amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
			}
			return amount;
		}

		public class ChildrensMovie3 extends Movie {
			public ChildrensMovie3(String title) {
				super(title, "1.50");
			}

			public String getPriceCode() {
				return "childrens3";
			}

			public BigDecimal calculateFees(int days) {
				BigDecimal amount = new BigDecimal("1.50");
				amount = new BigDecimal("1.50");

				if (days > 3) {
					BigDecimal extraDays = new BigDecimal(days - 3);
					amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
				}
				return amount;
			}
		}
	}
}