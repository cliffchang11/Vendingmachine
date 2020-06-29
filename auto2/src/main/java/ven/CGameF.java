package ven;

import javax.swing.*;
import java.awt.event.*;

public class CGameF extends JFrame {
	private boolean mode = true;
	public Coin coin = new Coin();

	Vendingmachine ven = new Vendingmachine();
	public JLabel lblPlay = new JLabel("");
	public JLabel lblComp = new JLabel("現為購買模式");
	public JLabel lblTotalmoney = new JLabel("使用者金額 : 0");
	private JLabel lblChange = new JLabel("找零 : 0");
	public JLabel lblInputmony = new JLabel("投入金額 : 0");
	private JLabel lblbottlewater = new JLabel(ven.bottleWater.getPrice() + "元");
	private JLabel lblredTea = new JLabel(ven.redTea.getPrice() + "元");
	private JLabel lblgreenTea = new JLabel(ven.greanTea.getPrice() + "元");
	private JLabel lblcola = new JLabel(ven.Cola.getPrice() + "元");
	private JLabel lblsarsi = new JLabel(ven.sarSi.getPrice() + "元");
	private JLabel lblcoffee = new JLabel(ven.coffee.getPrice() + "元");

	public JButton btnBuyingmode = new JButton("購買模式");
	public JButton btnRefill = new JButton("補貨模式");
	public JButton btnBottlewater = new JButton("礦泉水 X");
	public JButton btnRedtea = new JButton("红茶 X");
	public JButton btnGreentea = new JButton("綠茶 X");
	public JButton btnCola = new JButton("可樂 X");
	public JButton btnSarsi = new JButton("沙士 X");
	public JButton btnCoffee = new JButton("咖啡 X");

	public JButton btnOnedollar = new JButton("1元");
	public JButton btnFivedollar = new JButton("5元");
	public JButton btnTendollar = new JButton("10元");

	public CGameF() {
		// 副標
		lblPlay.setBounds(10, 10, 150, 60);
		add(lblPlay);
		lblComp.setBounds(140, 10, 150, 60);
		add(lblComp);
		// 販賣機狀態
		btnRefill.setBounds(370, 10, 90, 30);
		add(btnRefill);
		btnBuyingmode.setBounds(370, 50, 90, 30);
		add(btnBuyingmode);
		lblTotalmoney.setBounds(370, 90, 150, 30);
		add(lblTotalmoney);
		lblChange.setBounds(370, 130, 150, 30);
		add(lblChange);
		lblInputmony.setBounds(370, 170, 150, 30);
		add(lblInputmony);
		// 飲料按鈕

		btnBottlewater.setBounds(10, 90, 90, 30);
		add(btnBottlewater);
		btnRedtea.setBounds(130, 90, 90, 30);
		add(btnRedtea);
		btnGreentea.setBounds(250, 90, 90, 30);
		add(btnGreentea);
		btnCola.setBounds(10, 180, 90, 30);
		add(btnCola);
		btnSarsi.setBounds(130, 180, 90, 30);
		add(btnSarsi);
		btnCoffee.setBounds(250, 180, 90, 30);
		add(btnCoffee);
		// 飲料價錢
		lblbottlewater.setBounds(40, 120, 90, 30);
		add(lblbottlewater);
		lblredTea.setBounds(160, 120, 90, 30);
		add(lblredTea);
		lblgreenTea.setBounds(280, 120, 90, 30);
		add(lblgreenTea);
		lblcola.setBounds(40, 210, 90, 30);
		add(lblcola);
		lblsarsi.setBounds(160, 210, 90, 30);
		add(lblsarsi);
		lblcoffee.setBounds(280, 210, 90, 30);
		add(lblcoffee);
		// 零錢
		btnOnedollar.setBounds(370, 210, 90, 30);
		add(btnOnedollar);
		btnFivedollar.setBounds(370, 250, 90, 30);
		add(btnFivedollar);
		btnTendollar.setBounds(370, 290, 90, 30);
		add(btnTendollar);

		btnBottlewater.addActionListener(ListGame);
		btnRedtea.addActionListener(ListGame);
		btnGreentea.addActionListener(ListGame);
		btnCola.addActionListener(ListGame);
		btnSarsi.addActionListener(ListGame);
		btnCoffee.addActionListener(ListGame);
		btnBuyingmode.addActionListener(ListGame);
		btnRefill.addActionListener(ListGame);
		btnOnedollar.addActionListener(ListGame);
		btnFivedollar.addActionListener(ListGame);
		btnTendollar.addActionListener(ListGame);

		setTitle("自動販賣機");
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public ActionListener ListGame = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			// 只完成礦泉水
			if (e.getSource() == btnBottlewater) {
				if (mode == true) {
					int charge = ven.pay(coin.getTotalmoney(), ven.bottleWater);
					if (charge >= 0) {
						coin.setTotalMoney(charge);
						lblComp.setText("礦泉水剩餘數量 : " + ven.bottleWater.getQuantity());
						lblPlay.setText("購買一瓶礦泉水");
						lblInputmony.setText("投入金額 : 0");
						lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
						lblChange.setText("找零 : " + charge);
						checkLight(coin.getTotalmoney());
					} else {
						lblComp.setText("金額或庫存數量不足");
						lblPlay.setText("");
						checkLight(coin.getTotalmoney());
					}
				} else {
					ven.refill(ven.bottleWater);
					lblComp.setText("礦泉水剩餘數量 : " + ven.bottleWater.getQuantity());
				}

			}
			if (e.getSource() == btnRedtea) {
				if (mode == true) {
					int charge = ven.pay(coin.getTotalmoney(), ven.redTea);
					if (charge >= 0) {
						coin.setTotalMoney(charge);
						lblComp.setText("紅茶剩餘數量 : " + ven.redTea.getQuantity());
						lblPlay.setText("購買一瓶紅茶");
						lblInputmony.setText("投入金額 : 0");
						lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
						lblChange.setText("找零 : " + charge);
						checkLight(coin.getTotalmoney());
					} else {
						lblComp.setText("金額或庫存數量不足");
						lblPlay.setText("");
						checkLight(coin.getTotalmoney());
					}
				} else {
					ven.refill(ven.redTea);
					lblComp.setText("紅茶剩餘數量 : " + ven.redTea.getQuantity());

				}

			}
			if (e.getSource() == btnGreentea) {
				if (mode == true) {
					int charge = ven.pay(coin.getTotalmoney(), ven.greanTea);
					if (charge >= 0) {
						coin.setTotalMoney(charge);
						lblComp.setText("綠茶剩餘數量 : " + ven.greanTea.getQuantity());
						lblPlay.setText("購買一瓶綠茶");
						lblInputmony.setText("投入金額 : 0");
						lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
						lblChange.setText("找零 : " + charge);
						checkLight(coin.getTotalmoney());
					} else {
						lblComp.setText("金額或庫存數量不足");
						lblPlay.setText("");
						checkLight(coin.getTotalmoney());
					}
				} else {
					ven.refill(ven.greanTea);
					lblComp.setText("綠茶剩餘數量 : " + ven.greanTea.getQuantity());
				}

			}
			if (e.getSource() == btnCola) {
				if (mode == true) {
					int charge = ven.pay(coin.getTotalmoney(), ven.Cola);
					if (charge >= 0) {
						coin.setTotalMoney(charge);
						lblComp.setText("可樂剩餘數量 : " + ven.Cola.getQuantity());
						lblPlay.setText("購買一瓶可樂");
						lblInputmony.setText("投入金額 : 0");
						lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
						lblChange.setText("找零 : " + charge);
						checkLight(coin.getTotalmoney());
					} else {
						lblComp.setText("金額或庫存數量不足");
						lblPlay.setText("");
						checkLight(coin.getTotalmoney());
					}
				} else {
					ven.refill(ven.Cola);
					lblComp.setText("可樂剩餘數量 : " + ven.Cola.getQuantity());
				}

			}
			if (e.getSource() == btnSarsi) {
				if (mode == true) {
					int charge = ven.pay(coin.getTotalmoney(), ven.sarSi);
					if (charge >= 0) {
						coin.setTotalMoney(charge);
						lblComp.setText("沙士剩餘數量 : " + ven.sarSi.getQuantity());
						lblPlay.setText("購買一瓶沙士");
						lblInputmony.setText("投入金額 : 0");
						lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
						lblChange.setText("找零 : " + charge);
						checkLight(coin.getTotalmoney());
					} else {
						lblComp.setText("金額或庫存數量不足");
						lblPlay.setText("");
						checkLight(coin.getTotalmoney());
					}
				} else {
					ven.refill(ven.sarSi);
					lblComp.setText("沙士剩餘數量 : " + ven.sarSi.getQuantity());
				}

			}
			if (e.getSource() == btnCoffee) {
				if (mode == true) {
					int charge = ven.pay(coin.getTotalmoney(), ven.coffee);
					if (charge >= 0) {
						coin.setTotalMoney(charge);
						lblComp.setText("咖啡剩餘數量 : " + ven.coffee.getQuantity());
						lblPlay.setText("購買一瓶咖啡");
						lblInputmony.setText("投入金額 : 0");
						lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
						lblChange.setText("找零 : " + charge);
						checkLight(coin.getTotalmoney());
					} else {
						lblComp.setText("金額或庫存數量不足");
						lblPlay.setText("");
						checkLight(coin.getTotalmoney());
					}
				} else {
					ven.refill(ven.coffee);
					lblComp.setText("咖啡剩餘數量 : " + ven.coffee.getQuantity());
				}

			}

			if (e.getSource() == btnOnedollar) {
				if (mode == true) {
					coin.insertCoin(coin.getTotalmoney(), 1);
					lblInputmony.setText("投入金額 : 1");
					lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
					checkLight(coin.getTotalmoney());
				} else {
					lblComp.setText("補貨模式無法投幣");
					lblPlay.setText("");
					checkLight(coin.getTotalmoney());
				}
			}
			if (e.getSource() == btnFivedollar) {
				if (mode == true) {
					coin.insertCoin(coin.getTotalmoney(), 5);
					lblInputmony.setText("投入金額 : 5");
					lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
					checkLight(coin.getTotalmoney());
				} else {
					lblComp.setText("補貨模式無法投幣");
					lblPlay.setText("");
					checkLight(coin.getTotalmoney());
				}

			}
			if (e.getSource() == btnTendollar) {
				if (mode == true) {
					coin.insertCoin(coin.getTotalmoney(), 10);
					lblInputmony.setText("投入金額 : 10");
					lblTotalmoney.setText("使用者金額 : " + coin.getTotalmoney());
					checkLight(coin.getTotalmoney());
				} else {
					lblComp.setText("補貨模式無法投幣");
					lblPlay.setText("");
					checkLight(coin.getTotalmoney());
				}

			} else if (e.getSource() == btnBuyingmode) {
				mode = true;
				lblComp.setText("現為購買模式");
				lblPlay.setText("");
			} else if (e.getSource() == btnRefill) {
				mode = false;
				lblComp.setText("現為補貨模式");
				lblPlay.setText("");
			}
		}
	};

	public void checkLight(int totalmoney) {
		
		
		if (ven.enoughMoney(totalmoney, ven.bottleWater)  && ven.enoughQuantity(ven.bottleWater)) {
			btnBottlewater.setText("礦泉水 O");
		} else {
			btnBottlewater.setText("礦泉水 X");
		}
		if (ven.enoughMoney(totalmoney, ven.redTea) && ven.enoughQuantity(ven.redTea)) {
			btnRedtea.setText("紅茶 O");
		} else {
			btnRedtea.setText("紅茶 X");
		}
		if (ven.enoughMoney(totalmoney, ven.greanTea)  && ven.enoughQuantity(ven.greanTea)) {
			btnGreentea.setText("綠茶 O");
		} else {
			btnGreentea.setText("綠茶 X");
		}
		if (ven.enoughMoney(totalmoney, ven.Cola) && ven.enoughQuantity(ven.Cola)) {
			btnCola.setText("可樂 O");
		} else {
			btnCola.setText("可樂 X");
		}
		if (ven.enoughMoney(totalmoney, ven.sarSi) && ven.enoughQuantity(ven.sarSi)) {
			btnSarsi.setText("沙士 O");
		} else {
			btnSarsi.setText("沙士 X");
		}
		if (ven.enoughMoney(totalmoney, ven.coffee)  && ven.enoughQuantity(ven.coffee)) {
			btnCoffee.setText("咖啡 O");
		} else {
			btnCoffee.setText("咖啡 X");
		}

	}

	public static void main(String args[]) {
		CGameF gameF = new CGameF();
	}
}