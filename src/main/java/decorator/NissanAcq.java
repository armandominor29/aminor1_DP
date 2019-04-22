package main.java.decorator;

/**.
*Nissan acquisition.
*Acquires Nissan and inherits Nissan Factory
*/

public class NissanAcq implements Acquire {
    
    int cost= 1000000;
    int balance=4000000;
    int debt = 75000;
    
    @Override
    //*acquire override acquires manufacturer and inherits factory*//
    public void acquire() {
        
        if (getBalance()>getCost()) {
            System.out.println("Nissan Acquired");
            inheritNissanFactory();
        }
        else {
            System.out.println("You dont have enough money to buy Nissan!");
        }
    }

    //*inherits Nissan factory*//
    public void inheritNissanFactory() {
       System.out.println("You can now manufacture Nissan Trucks");
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