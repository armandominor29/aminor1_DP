package main.java.decorator;

/**.
*Nissan acquisition.
*Acquires Nissan and inherits Nissan Factory
*/

public class NissanAcq implements Acquire {
    
    int cost = 8000000;
    int balance = 3000000;
    int debt = 95000;
    
    @Override
    //*acquire override acquires manufacturer and inherits factory*//
    public void acquire() {
        buyOut();
        inheritNissanFactory();
    }
    
    //*inherits Nissan factory*//
    public void inheritNissanFactory() {
        System.out.println("You can now manufacture Nissan Truck Vehicles");
    }
    
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
    
    public int updateBalance() {
        int newBalance = getBalance() - getCost() - getDebt();
        return newBalance;
    }
}