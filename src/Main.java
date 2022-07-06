public class Main {


    public static void main(String[] arg) {
        Bank bank = new Bank();
       bank.createWallet(bank.createUser(),"RUB");
       bank.getUserInfo();

    }
}

