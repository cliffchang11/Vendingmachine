package auto2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import auto2.Vendingmachine;

class VendingmachineTest {

	@Test
	void testPay() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(10, ven.pay(20, 0));
		assertEquals(0, ven.pay(10, 0));
		assertEquals(5, ven.pay(15,0));
		assertEquals(-1, ven.pay(5, 0));
	}
	
	
	
	@Test
	void testEnoughMoney() {
		Vendingmachine ven = new Vendingmachine();

		assertEquals(true, ven.enoughMoney(15, 0));
		assertEquals(false, ven.enoughMoney(5, 0));

		assertEquals(true, ven.enoughMoney(20, 1));
		assertEquals(false, ven.enoughMoney(5, 1));

		assertEquals(true, ven.enoughMoney(20, 2));
		assertEquals(false, ven.enoughMoney(10, 2));

		assertEquals(true, ven.enoughMoney(20, 3));
		assertEquals(false, ven.enoughMoney(15, 3));

		assertEquals(true, ven.enoughMoney(25, 4));
		assertEquals(false, ven.enoughMoney(5, 4));

		assertEquals(true, ven.enoughMoney(30, 5));
		assertEquals(false, ven.enoughMoney(15, 5));
	}

	
	s\
	@Test
	void testEnoughQuantity() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(0));
		assertEquals(true, ven.enoughQuantity(1));
		assertEquals(true, ven.enoughQuantity(2));
		assertEquals(true, ven.enoughQuantity(3));
		assertEquals(true, ven.enoughQuantity(4));
		assertEquals(true, ven.enoughQuantity(5));
	}

	@Test
	void testCharge() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(15, ven.charge(5, 20));
		assertEquals(10, ven.charge(15, 25));
		assertEquals(20, ven.charge(30, 50));
	}
	
	

}
