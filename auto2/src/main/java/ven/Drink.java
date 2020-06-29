package ven;

public class Drink {
    private int num;
    private int price;
    private int quantity;
    

    public int getNum() {
        return num;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public Drink(int num,int price, int quantity){
        this.num = num;
        this.price = price ;
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    

}