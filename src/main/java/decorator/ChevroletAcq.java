package main.java.decorator;

/**.
*Chevrolet acquisition.
*Acquires Chevrolet and inherits Chevrolet Factory
*/

public class ChevroletAcq implements Acquire {
    
    int cost;
    int balance = 3000000;
    int debt = 95000;
    
    @Override
    //*acquire override acquires manufacturer and inherits factory*//
    public void acquire() {
        buyOut();
        inheritChevroletFactory();
    }
    
    //*inherits ford factory*//
    public void inheritChevroletFactory() {
        System.out.println("You can now manufacture Chevrolet Hybrid Vehicles");
    }
    
    //*Perform buy out*//
    private void buyOut() {
        System.out.println("Balance Available $" + this.getBalance());
        System.out.println("Acquired Debt $" + this.getDebt());
        System.out.println("Subtracting Cost $" + this.getCost());
        System.out.println("New Balance $" + updateBalance());
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
    
    public int getDebt() {
        return debt;
    }
    
    public void setDebt(int debt) {
        this.debt = debt;
    }
    
    //*update balance after acquisition*//
    public int updateBalance() {
        if (getBalance() > getCost()) {
            int newBalance = getBalance() - getCost() - getDebt();
            return newBalance;  
        } else {
            return getBalance();
        }
            
    }
}