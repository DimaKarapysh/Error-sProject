import entities.User;
import entities.Wallet;

import java.util.*;

public class Bank {
    private Map<String, User> Users = new HashMap<>();

    public Bank() {

    }

    String createUser() {
        var user = new User();
        Users.put(user.getUserId(), user);
        return user.getUserId();
    }

    void deleteUser(String user) {
        Users.remove(user);
    }

    void addAmount(String current, Float amount) {
    }

    void transferAmount(String currentF, String currentT) {

    }

    void createWallet(String user, String currency) {
        if (checkWalletExist(currency, user)) {
            return;
        } else {
            List<Wallet> userWallet = Users.get(user).getWallets();
            userWallet.add(new Wallet(currency, 0f));
        }
    }

    boolean checkWalletExist(String current, String user) {
        var asd = Users.get(user).getWallets();
        for (Wallet w : asd) {
            if (w.getCurrency().equals(current)) {
                return true;
            }
        }
        return false;

    }
    void getUserInfo(){
        for (var a:Users.entrySet()) {
            System.out.println(a.getKey());
            System.out.println("------------------");
            System.out.println(a.getValue().toString());
        }
    }
}

