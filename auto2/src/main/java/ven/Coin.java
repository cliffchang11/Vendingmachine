package main.java.ven;

public class Coin {
    private int totalmoney = 0;

    

    public int getTotalmoney() {
        return totalmoney;
    }

    public void insertCoin(int totalmoney,int coin) {
        this.totalmoney += coin;
    }

    public void setTotalMoney(int money){
        this.totalmoney = money;
    }
    
}