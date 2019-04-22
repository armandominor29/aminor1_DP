package main.java.decorator;

/**.
*Ford acquisition.
*Acquires Ford and inherits Ford Factory
*/

public class FordAcq implements Acquire {
    
    int cost= 8000000;
    int balance=3000000;
    int debt = 95000;
    
    @Override
    //*acquire override acquires manufacturer and inherits factory*//
    public void acquire() {
        
        if (getBalance()>getCost()) {
            System.out.println("Ford Acquired");
            inheritFordFactory();
        }
        else {
            System.out.println("You dont have enough money to buy Ford!");
        }
    }
    
    //*inherits ford factory*//
    public void inheritFordFactory() {
       System.out.println("You can now manufacture Ford Sport Vehicles");
    }
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public int getCost() {
        return cost;
    }
    
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    public int updateBalance() {
        
        
        if (getBalance()>getCost()) {
            int newBalance = getBalance()-getCost();
            return newBalance;
        }
        else {
            return getBalance();
        }
    }
}