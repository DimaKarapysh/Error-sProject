package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private List<Wallet> wallets; // LIST OF WALLETS

    public User() {
        this.userId = UUID.randomUUID().toString();
        wallets=new ArrayList<>();
        wallets.add(new Wallet("RUB",0.0f));
    }

    public List<Wallet> getWallets() {
        return wallets;
    }

    public String getUserId() {
        return userId;
    }




}
