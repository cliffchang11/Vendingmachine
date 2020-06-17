package auto2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import auto2.Vendingmachine;

class VendingmachineTest {

	@Test
	void testPay1() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(10, ven.pay(20, 0));
		assertEquals(0, ven.pay(10, 0));
		assertEquals(5, ven.pay(15,0));
		assertEquals(-1, ven.pay(5, 0));
	}
	
	
	
	@Test
	void testEnoughMoney1() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughMoney(15, 0));
	}

	@Test
	void testEnoughMoney2() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(false, ven.enoughMoney(5, 0));
	}
	
	@Test
	void testEnoughMoney3() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughMoney(20, 1));
	}
	
	@Test
	void testEnoughMoney4() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(false, ven.enoughMoney(5, 1));
	}
	
	
	@Test
	void testEnoughMoney5() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughMoney(20, 2));
	}
	
	@Test
	void testEnoughMoney6() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(false, ven.enoughMoney(10, 2));
	}
	
	@Test
	void testEnoughMoney7() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughMoney(20, 3));
	}
	
	@Test
	void testEnoughMoney8() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(false, ven.enoughMoney(15, 3));
	}
	
	@Test
	void testEnoughMoney9() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughMoney(25, 4));
	}
	
	@Test
	void testEnoughMoney10() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(false, ven.enoughMoney(5, 4));
	}
	
	@Test
	void testEnoughMoney11() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughMoney(30, 5));
	}
	
	@Test
	void testEnoughMoney12() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(false, ven.enoughMoney(15, 5));
	}
	
	@Test
	void testEnoughQuantity1() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(0));
	}

	@Test
	void testEnoughQuantity2() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(1));
	}
	
	@Test
	void testEnoughQuantity3() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(2));
	}
	
	@Test
	void testEnoughQuantity4() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(3));
	}
	
	@Test
	void testEnoughQuantity5() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(4));
	}
	
	@Test
	void testEnoughQuantity6() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(5));
	}
	
	@Test
	void testCharge1() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(15, ven.charge(5, 20));
	}
	
	@Test
	void testCharge2() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(10, ven.charge(15, 25));
	}
	
	@Test
	void testCharge3() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(20, ven.charge(30, 50));
	}

}
