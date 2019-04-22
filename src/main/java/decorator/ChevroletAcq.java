package main.java.decorator;

/**.
*Chevrolet acquisition.
*Acquires Chevrolet and inherits Chevrolet Factory
*/

public class ChevroletAcq implements Acquire {
    
    int cost;
    int balance;
    int debt;
    int tick;
    
    @Override
    //*acquire override acquires manufacturer and inherits factory*//
    public void acquire() {
        tick++;
        setBalance(9000000);
        setCost(6000000);
        setDebt(2000000);
        
        if (getBalance()>getCost()) {
           System.out.println("Balance Available $" + getBalance());
           System.out.println("Acquired Debt $" + getDebt());
           System.out.println("Subtracting Cost $" + getCost());
           System.out.println("New Balance $" + updateBalance());
           inheritChevroletFactory();
           }
        else {
            System.out.println("You dont have enough money to buy Chevrolet!");
            }
    }
    
    //*inherits Chevrolet factory*//
    public void inheritChevroletFactory() {
       System.out.println("You can now manufacture Chevrolet Hybrid Vehicles");
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
            int newBalance = getBalance()-getCost()-getDebt();
            return newBalance;
    }
}
