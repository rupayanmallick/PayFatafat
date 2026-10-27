import java.util.*;
import java.math.*;
import java.time.*;

public class Transaction {
    public enum Type {
        DEPOSIT,
        WITHDRAW,
        TRANSFER_IN,
        TRANSFER_OUT
    }
    //fields/attributes
    private BigDecimal amount;
    private Type type;
    private LocalDateTime timestamp;
    private BigDecimal balanceAfter;
    //constructor
    public Transaction(BigDecimal amount,Type type,LocalDateTime timestamp,BigDecimal balanceAfter){
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
        this.balanceAfter = balanceAfter;
    }
    //getters
    public BigDecimal getAmount(){
        return this.amount;
    }
    public Type getType(){
        return this.type;
    }
    public LocalDateTime getTimestamp(){
        return this.timestamp;
    }
    public BigDecimal getBalanceAfter(){
        return this.balanceAfter;
    }
}
