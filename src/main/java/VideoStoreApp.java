
public class VideoStoreApp {

	public static void main(String[] args) {

		// RentalCalculator calculator = new RentalCalculator();
		Movie regular = new RegularMovie("What Would Jesus/Allah Do");
		Movie regular2 = new RegularMovie("There Was and There was Not?");
		Movie regular3 = new RegularMovie("The Chamber");

		Movie childrens = new ChildrensMovie("Lookng for a Face Like Mine");
		Movie childrens2 = new ChildrensMovie("The Littlest Volunteers");
		Movie childrens3 = new ChildrensMovie("If the World Were a Village");

		Movie newRelease = new NewRelease("Fire at Sea");
		Movie newRelease2 = new NewRelease("Between the World and Me");
		Movie newRelease3 = new NewRelease("Missoula");

		RentalStatement myStmt = new RentalStatement();
		Rental firstRental = new Rental(regular, 5);
		Rental firstRental2 = new Rental(regular2, 5);
		Rental firstRental3 = new Rental(regular3, 5);
		Rental firstRental4 = new Rental(childrens, 5);
		Rental firstRental5 = new Rental(childrens2, 5);
		Rental firstRental6 = new Rental(childrens3, 5);
		Rental firstRental7 = new Rental(newRelease, 5);
		Rental firstRental8 = new Rental(newRelease2, 5);
		Rental firstRental9 = new Rental(newRelease3, 5);

		myStmt.add(firstRental);
		myStmt.add(firstRental2);
		myStmt.add(firstRental3);
		myStmt.add(firstRental4);
		myStmt.add(firstRental5);
		myStmt.add(firstRental6);
		myStmt.add(firstRental7);
		myStmt.add(firstRental8);
		myStmt.add(firstRental9);

		myStmt.print();
	}

}
