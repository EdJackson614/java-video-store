import java.util.ArrayList;
import java.util.Collection;

public class RentalStatement {
	Collection<Rental> transactions = new ArrayList();// Collection is an
														// interface implemented
														// by the (instance)
														// ArrayList...

	public void add(Rental toAdd) { // add Method to build Collection
		transactions.add(toAdd); // transactions added to array
	}

	public void print() {

		for (Rental eachElement : transactions) { // i represented each element
													// in the transactions but I
													// was confused
			System.out.println(" " + eachElement.getPriceCode() + " " + eachElement.getTitle() + " "
					+ eachElement.calculateFees());
		}

	}
}
