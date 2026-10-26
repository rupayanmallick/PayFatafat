import java.util.*;
import java.math.*;

public class CurrentAccount extends Account{
    //constructor
    public CurrentAccount(String id, String ownerName, BigDecimal balance){
        super(id,ownerName,balance);
    }
    //methods
    @Override
    public void withdraw(BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO) <= 0 ){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        BigDecimal currentBalance = this.getBalance();
        BigDecimal remainingBalance = currentBalance.subtract(amount);
        if(remainingBalance.compareTo(new BigDecimal("-5000")) < 0){
            throw new IllegalArgumentException("Overdraft limit exceeded");
        }
        this.updateBalance(remainingBalance);
    }
}
