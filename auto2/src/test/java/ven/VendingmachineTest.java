package ven;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.jupiter.api.Test;



class VendingmachineTest {

	@Test
	void testPay() {
		Vendingmachine ven = new Vendingmachine();

		assertEquals(-1, ven.pay(10, ven.coffee));

		assertEquals(10, ven.pay(20, ven.bottleWater));
		assertEquals(-1, ven.pay(0, ven.bottleWater));
		ven.bottleWater.setQuantity(0);
		assertEquals(-1, ven.pay(10, ven.bottleWater));
		assertEquals(-1, ven.pay(0, ven.bottleWater));

		assertEquals(10, ven.pay(25, ven.redTea));
		assertEquals(-1, ven.pay(0, ven.redTea));
		ven.redTea.setQuantity(0);
		assertEquals(-1, ven.pay(25, ven.redTea));
		assertEquals(-1, ven.pay(0, ven.redTea));

		assertEquals(10, ven.pay(25, ven.greanTea));
		assertEquals(-1, ven.pay(0, ven.greanTea));
		ven.greanTea.setQuantity(0);
		assertEquals(-1, ven.pay(25, ven.greanTea));
		assertEquals(-1, ven.pay(0, ven.greanTea));

		assertEquals(10, ven.pay(30, ven.Cola));
		assertEquals(-1, ven.pay(0, ven.Cola));
		ven.Cola.setQuantity(0);
		assertEquals(-1, ven.pay(25, ven.Cola));
		assertEquals(-1, ven.pay(0, ven.Cola));

		assertEquals(10, ven.pay(30, ven.sarSi));
		assertEquals(-1, ven.pay(0, ven.sarSi));
		ven.sarSi.setQuantity(0);
		assertEquals(-1, ven.pay(30, ven.sarSi));
		assertEquals(-1, ven.pay(0, ven.sarSi);

		assertEquals(10, ven.pay(40, ven.coffee));
		assertEquals(-1, ven.pay(0, 5));
		ven.coffee.setQuantity(0);
		assertEquals(-1, ven.pay(40, 5));
		assertEquals(-1, ven.pay(0, 5));
	}

	
	@Test
	void testDrink() {
		Vendingmachine ven = new Vendingmachine();
		ven.sarSi.getNum();
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

		assertEquals(false, ven.enoughMoney(30, ven.coffee));

	}

	@Test
	void testRefill() {
		Vendingmachine ven = new Vendingmachine();
		ven.refill(0);
		ven.refill(1);
		ven.refill(2);
		ven.refill(3);
		ven.refill(4);
		ven.refill(5);

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
		assertEquals(false, ven.enoughQuantity(ven.coffee));
	}

	@Test
	void testCharge() {
		Vendingmachine ven = new Vendingmachine();
		assertEquals(15, ven.charge(5, 20));
		assertEquals(10, ven.charge(15, 25));
		assertEquals(20, ven.charge(30, 50));
	}

	@Test
	void testCGameFDrink() {
		CGameF g = new CGameF();
		ActionEvent b = new ActionEvent(g.btnBottlewater, 0, null);
		g.ListGame.actionPerformed(b);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		assertEquals("",g.lblPlay.getText());
		
		ActionEvent r = new ActionEvent(g.btnRedtea, 0, null);
		g.ListGame.actionPerformed(r);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
		ActionEvent green = new ActionEvent(g.btnGreentea, 0, null);
		g.ListGame.actionPerformed(green);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
		ActionEvent c = new ActionEvent(g.btnCola, 0, null);
		g.ListGame.actionPerformed(c);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
		ActionEvent s = new ActionEvent(g.btnSarsi, 0, null);
		g.ListGame.actionPerformed(s);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
		ActionEvent co = new ActionEvent(g.btnCoffee, 0, null);
		g.ListGame.actionPerformed(co);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
		ActionEvent buy = new ActionEvent(g.btnBuyingmode, 0, null);
		g.ListGame.actionPerformed(buy);
		assertEquals("現為購買模式",g.lblComp.getText());
		
		ActionEvent refill = new ActionEvent(g.btnRefill, 0, null);
		g.ListGame.actionPerformed(refill);
		assertEquals("現為補貨模式",g.lblComp.getText());
	}
	@Test
	void testCGameFDollar() {
		CGameF g = new CGameF();
		ActionEvent onedollar = new ActionEvent(g.btnOnedollar, 0, null);
		g.ListGame.actionPerformed(onedollar);
		assertEquals("投入金額 : 1",g.lblInputmony.getText());
		assertEquals("使用者金額 : 1",g.lblTotalmoney.getText());
		
		ActionEvent fivedollar = new ActionEvent(g.btnFivedollar, 0, null);
		g.ListGame.actionPerformed(fivedollar);
		assertEquals("投入金額 : 5",g.lblInputmony.getText());
		assertEquals("使用者金額 : 6",g.lblTotalmoney.getText());
		
		ActionEvent tendollar = new ActionEvent(g.btnTendollar, 0, null);
		g.ListGame.actionPerformed(tendollar);
		assertEquals("投入金額 : 10",g.lblInputmony.getText());
		assertEquals("使用者金額 : 16",g.lblTotalmoney.getText());
	}
	@Test
	void testFalseMode() {
		CGameF g = new CGameF();
		ActionEvent FalseMode = new ActionEvent(g.btnRefill, 0, null);
		g.ListGame.actionPerformed(FalseMode);
		
		ActionEvent onedollar = new ActionEvent(g.btnOnedollar, 0, null);
		g.ListGame.actionPerformed(onedollar);
		assertEquals("補貨模式無法投幣",g.lblComp.getText());
		
		
		ActionEvent fivedollar = new ActionEvent(g.btnFivedollar, 0, null);
		g.ListGame.actionPerformed(fivedollar);
		assertEquals("補貨模式無法投幣",g.lblComp.getText());
		
		ActionEvent tendollar = new ActionEvent(g.btnTendollar, 0, null);
		g.ListGame.actionPerformed(tendollar);
		assertEquals("補貨模式無法投幣",g.lblComp.getText());
		
		ActionEvent bottle = new ActionEvent(g.btnBottlewater, 0, null);
		g.ListGame.actionPerformed(bottle);
		assertEquals("礦泉水剩餘數量 : 4",g.lblComp.getText());
		
		ActionEvent red = new ActionEvent(g.btnRedtea, 0, null);
		g.ListGame.actionPerformed(red);
		assertEquals("紅茶剩餘數量 : 4",g.lblComp.getText());
		
		ActionEvent green = new ActionEvent(g.btnGreentea, 0, null);
		g.ListGame.actionPerformed(green);
		assertEquals("綠茶剩餘數量 : 4",g.lblComp.getText());
		
		ActionEvent cola = new ActionEvent(g.btnCola, 0, null);
		g.ListGame.actionPerformed(cola);
		assertEquals("可樂剩餘數量 : 4",g.lblComp.getText());
		
		ActionEvent sarsi = new ActionEvent(g.btnSarsi, 0, null);
		g.ListGame.actionPerformed(sarsi);
		assertEquals("沙士剩餘數量 : 4",g.lblComp.getText());
		
		ActionEvent coffee = new ActionEvent(g.btnCoffee, 0, null);
		g.ListGame.actionPerformed(coffee);
		assertEquals("咖啡剩餘數量 : 4",g.lblComp.getText());
		
	}
	@Test
	void Systemtest() {
		CGameF g = new CGameF();
		
		ActionEvent tendollar = new ActionEvent(g.btnTendollar, 0, null);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		assertEquals(30,g.coin.getTotalmoney());
		
		ActionEvent b = new ActionEvent(g.btnBottlewater, 0, null);
		g.ListGame.actionPerformed(b);
		assertEquals("礦泉水剩餘數量 : 2",g.lblComp.getText());
		assertEquals("使用者金額 : 20",g.lblTotalmoney.getText());
		
		ActionEvent red = new ActionEvent(g.btnRedtea, 0, null);
		g.ListGame.actionPerformed(red);
		assertEquals("紅茶剩餘數量 : 2",g.lblComp.getText());
		assertEquals("使用者金額 : 5",g.lblTotalmoney.getText());
		
		ActionEvent green = new ActionEvent(g.btnGreentea, 0, null);
		g.ListGame.actionPerformed(green);
		assertEquals("金額或庫存數量不足",g.lblComp.getText());
		
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		assertEquals(35,g.coin.getTotalmoney());
		
		g.ListGame.actionPerformed(green);
		assertEquals("綠茶剩餘數量 : 2",g.lblComp.getText());
		assertEquals("使用者金額 : 20",g.lblTotalmoney.getText());
		
		ActionEvent cola = new ActionEvent(g.btnCola, 0, null);
		g.ListGame.actionPerformed(cola);
		assertEquals("可樂剩餘數量 : 2",g.lblComp.getText());
		assertEquals("使用者金額 : 0",g.lblTotalmoney.getText());
		
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		assertEquals(60,g.coin.getTotalmoney());
		
		ActionEvent sarsi = new ActionEvent(g.btnSarsi, 0, null);
		g.ListGame.actionPerformed(sarsi);
		assertEquals("沙士剩餘數量 : 2",g.lblComp.getText());
		assertEquals("使用者金額 : 40",g.lblTotalmoney.getText());
		
		ActionEvent coffee = new ActionEvent(g.btnCoffee, 0, null);
		g.ListGame.actionPerformed(coffee);
		assertEquals("咖啡剩餘數量 : 2",g.lblComp.getText());
		assertEquals("使用者金額 : 10",g.lblTotalmoney.getText());
		
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		g.ListGame.actionPerformed(tendollar);
		assertEquals(70,g.coin.getTotalmoney());
		
		g.ListGame.actionPerformed(b);
		assertEquals("礦泉水剩餘數量 : 1",g.lblComp.getText());
		assertEquals("使用者金額 : 60",g.lblTotalmoney.getText());
		
		g.ListGame.actionPerformed(b);
		assertEquals("礦泉水剩餘數量 : 0",g.lblComp.getText());
		assertEquals("使用者金額 : 50",g.lblTotalmoney.getText());
		assertEquals("礦泉水 X",g.btnBottlewater.getText());
	}
	
}
