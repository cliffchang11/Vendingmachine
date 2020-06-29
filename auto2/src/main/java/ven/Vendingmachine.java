package ven;



public class Vendingmachine {

	public Drink bottleWater = new Drink(0, 10, 3);
	public Drink redTea = new Drink(1, 15, 3);
	public Drink greanTea = new Drink(2, 15, 3);
	public Drink Cola = new Drink(3, 20, 3);
	public Drink sarSi = new Drink(4, 20, 3);
	public Drink coffee = new Drink(5, 30, 3);

	public int pay(int totalmoney, Drink drink) {

		if (enoughMoney(totalmoney, drink) && enoughQuantity(drink)) {
			totalmoney = charge(bottleWater.getPrice(), totalmoney);
			bottleWater.setQuantity(bottleWater.getQuantity() - 1);
			return totalmoney;
		} else {
			return -1;
		}

	}

	public void refill(Drink drink) {
		drink.setQuantity(drink.getQuantity() + 1);
	}

	public boolean enoughMoney(int totalmoney, Drink drink) {

		if (totalmoney >= drink.getPrice()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean enoughQuantity(Drink drink) {

		if (drink.getQuantity() > 0) {
			return true;
		} else {
			return false;
		}

	}

	public int charge(int price, int money) {
		return money - price;
	}

}