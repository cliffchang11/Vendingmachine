package auto2;


public class Vendingmachine {
	
	

	Drink bottleWater = new Drink(0,10,3);
	Drink redTea = new Drink(1,15,3);
	Drink greanTea = new Drink(2,15,3);
	Drink Cola = new Drink(3,20,3);
	Drink sarSi = new Drink(4,20,3);
	Drink coffee = new Drink(5,30,3);
	
	
	public int pay(int totalmoney ,int num){
	  	
	  	if(num == 0){
			if(enoughMoney(totalmoney, num) && enoughQuantity(num)){
				totalmoney = charge(bottleWater.getPrice(),totalmoney);
				bottleWater.setQuantity(bottleWater.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		  if(num == 1){
			if(enoughMoney(totalmoney, num) && enoughQuantity(num)){
				totalmoney = charge(redTea.getPrice(),totalmoney);
				redTea.setQuantity(redTea.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		  if(num == 2){
			if(enoughMoney(totalmoney, num) && enoughQuantity(num)){
				totalmoney = charge(greanTea.getPrice(),totalmoney);
				greanTea.setQuantity(greanTea.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		  if(num == 3){
			if(enoughMoney(totalmoney, num) && enoughQuantity(num)){
				totalmoney = charge(Cola.getPrice(),totalmoney);
				Cola.setQuantity(Cola.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		  if(num == 4){
			if(enoughMoney(totalmoney, num) && enoughQuantity(num)){
				totalmoney = charge(sarSi.getPrice(),totalmoney);
				sarSi.setQuantity(sarSi.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		  if(num == 5){
			if(enoughMoney(totalmoney, num) && enoughQuantity(num)){
				totalmoney = charge(coffee.getPrice(),totalmoney);
				coffee.setQuantity(coffee.getQuantity()-1);
				return totalmoney;
			}
			else {
				return -1 ;
			}
		  }
		
	  
	  	return -1;
		}
	public void refill(int num){
		if(num == 0){
			bottleWater.setQuantity(bottleWater.getQuantity()+1);
		}
		else if(num == 1){
			redTea.setQuantity(redTea.getQuantity()+1);
		}
		else if(num == 2 ){
			greanTea.setQuantity(greanTea.getQuantity()+1);
		}
		else if(num == 3){
			Cola.setQuantity(Cola.getQuantity()+1);
		}
		else if(num == 4){
			sarSi.setQuantity(sarSi.getQuantity()+1);
		}
		else{
			coffee.setQuantity(coffee.getQuantity()+1);
		}
	}
	public boolean enoughMoney(int totalmoney,int num){
		if(num == 0){
			if(totalmoney >= bottleWater.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 1){
			if(totalmoney >= redTea.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 2){
			if(totalmoney >= greanTea.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 3){
			if(totalmoney >= Cola.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 4){
			if(totalmoney >= sarSi.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 5){
			if(totalmoney >= coffee.getPrice()){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	public boolean enoughQuantity(int num){
		if(num == 0){
			if(bottleWater.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 1){
			if(redTea.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 2){
			if(greanTea.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 3){
			if(Cola.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 4){
			if(sarSi.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else if(num == 5){
			if(coffee.getQuantity() > 0){
				return true;
			}
			else{
				return false;
			}
		}
		else return false;
	}
	public int charge (int price , int money){
		return money-price;
	}
	  	


	
	

	
	
	
}