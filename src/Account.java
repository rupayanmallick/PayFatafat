import java.util.*;
import java.math.*;

public abstract class Account {
    private String id;
    private String ownerName;
    private BigDecimal balance;
    private List<Transaction> trans = new ArrayList<>();

    //Constructor
    public Account(String id,String ownerName,BigDecimal balance){
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //methods
    public void deposit(BigDecimal amount){
        if(amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        else{
            balance = balance.add(amount);
        }
    }
    public abstract void withdraw(BigDecimal amount);

}
