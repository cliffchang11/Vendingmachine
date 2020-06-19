package auto2;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.jupiter.api.Test;

import auto2.Vendingmachine;

class VendingmachineTest {

	@Test
	void testPay() {
		Vendingmachine ven = new Vendingmachine();

		assertEquals(-1, ven.pay(10, 6));

		assertEquals(10, ven.pay(20, 0));
		assertEquals(-1, ven.pay(0, 0));
		ven.bottleWater.setQuantity(0);
		assertEquals(-1, ven.pay(10, 0));
		assertEquals(-1, ven.pay(0, 0));

		assertEquals(10, ven.pay(25, 1));
		assertEquals(-1, ven.pay(0, 1));
		ven.redTea.setQuantity(0);
		assertEquals(-1, ven.pay(25, 1));
		assertEquals(-1, ven.pay(0, 1));

		assertEquals(10, ven.pay(25, 2));
		assertEquals(-1, ven.pay(0, 2));
		ven.greanTea.setQuantity(0);
		assertEquals(-1, ven.pay(25, 2));
		assertEquals(-1, ven.pay(0, 2));

		assertEquals(10, ven.pay(30, 3));
		assertEquals(-1, ven.pay(0, 3));
		ven.Cola.setQuantity(0);
		assertEquals(-1, ven.pay(25, 3));
		assertEquals(-1, ven.pay(0, 3));

		assertEquals(10, ven.pay(30, 4));
		assertEquals(-1, ven.pay(0, 4));
		ven.sarSi.setQuantity(0);
		assertEquals(-1, ven.pay(30, 4));
		assertEquals(-1, ven.pay(0, 4));

		assertEquals(10, ven.pay(40, 5));
		assertEquals(-1, ven.pay(0, 5));
		ven.coffee.setQuantity(0);
		assertEquals(-1, ven.pay(40, 5));
		assertEquals(-1, ven.pay(0, 5));
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

		assertEquals(false, ven.enoughMoney(30, 6));

	}

	@Test
	void testRefill() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(0));
		assertEquals(true, ven.enoughQuantity(1));
		assertEquals(true, ven.enoughQuantity(2));
		assertEquals(true, ven.enoughQuantity(3));
		assertEquals(true, ven.enoughQuantity(4));
		assertEquals(true, ven.enoughQuantity(5));
		assertEquals(false, ven.enoughQuantity(6));
	}

	@Test
	void testEnoughQuantity() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(true, ven.enoughQuantity(0));
		assertEquals(true, ven.enoughQuantity(1));
		assertEquals(true, ven.enoughQuantity(2));
		assertEquals(true, ven.enoughQuantity(3));
		assertEquals(true, ven.enoughQuantity(4));
		assertEquals(true, ven.enoughQuantity(5));
		assertEquals(false, ven.enoughQuantity(6));
	}

	@Test
	void testCharge() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(15, ven.charge(5, 20));
		assertEquals(10, ven.charge(15, 25));
		assertEquals(20, ven.charge(30, 50));
	}

	@Test
	void testCGameF() {
		CGameF g = new CGameF();
		ActionEvent e = new ActionEvent(g.btnBottlewater, 0, null);
		e.setSource(g.btnBottlewater);
		g.ListGame.actionPerformed(e);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
	}

}
