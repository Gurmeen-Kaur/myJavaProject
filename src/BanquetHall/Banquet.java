package BanquetHall;

public class Banquet {

	double baseCost;
	double foodCost;
	double beverageCost;
	double tip;
	double totalBaseCost;
	double tax;
	int guests;
	double cess;
	double totalCost;

	// method to calculate total base cost by adding inputs taken from console
	public double calculateBaseCost(double base_Cost, double food_Cost, double beverage_Cost, double _tip) {
		baseCost = base_Cost;
		foodCost = food_Cost;
		beverageCost = beverage_Cost;
		tip = _tip;

		totalBaseCost = baseCost + foodCost + beverageCost + tip;
		return totalBaseCost;
	}

	
	// method to calculate tax
	public double calculateTax(double totalBaseCost) {
		tax = totalBaseCost * 0.10;
		return tax;
	}

	//method to calculate the cess tax depending on the number of guests
	public double calculateCess(int nOfGuests, double totalBaseCost) {
		guests = nOfGuests;

		if (guests <= 40 && guests >= 1) {
			cess = 0.04 * totalBaseCost;
		} else if (guests > 40 && guests <= 80) {
			cess = 0.08 * totalBaseCost;
		} else if (guests > 80 && guests <= 150) {
			cess = 0.10 * totalBaseCost;
		} else if (guests > 150) {
			cess = 0.125 * totalBaseCost;
		} else {
			System.out.println("you have entered an invalid value");
		}
		return cess;
	}

	public double calculateTheTotalCost(double totalBaseCost, double tax, double cess) {
		totalCost = totalBaseCost + tax + cess;
		return totalCost;
	}
}
