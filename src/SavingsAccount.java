import java.math.*;
import java.util.*;

public class SavingsAccount extends Account{
    //constructor
    public SavingsAccount(String id,String ownerName,BigDecimal balance){
        super(id,ownerName,balance);
    }
    @Override
    public void withdraw(BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Amount to be withdrawn must be greater than zero");
        }
        else if(amount.compareTo(this.getBalance()) > 0){
            throw new IllegalArgumentException("Amount to be withdrawn cannot be greater than balance");
        }
        else{
            BigDecimal currentBalance = this.getBalance();
            BigDecimal remainingBalance = currentBalance.subtract(amount);
            this.updateBalance(remainingBalance);
        }
    }
}
