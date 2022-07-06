package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// USD, 35.6
public class Wallet {
    private String Currency;
    private Float Amount;

    public String getCurrency() {
        return Currency;
    }

    public Float getAmount() {
        return Amount;
    }

    public void setAmount(Float amount) {
        this.Amount = amount;
    }

    public Wallet(String currency, Float amount) {
        Currency = currency;
        Amount = amount;
    }
}
