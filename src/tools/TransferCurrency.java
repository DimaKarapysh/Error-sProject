package tools;

import java.util.HashMap;
import java.util.Map;

public class TransferCurrency {
    String CurrencyF;
    String CurrencyT;
    HashMap<String, Float> koefs;

    public String getCurrencyF() {
        return CurrencyF;
    }

    public String getCurrencyT() {
        return CurrencyT;
    }

    public TransferCurrency(String currencyF, String currencyT) {
        CurrencyF = currencyF;
        CurrencyT = currencyT;
    }

    Float Convert(Float amount) {
        return amount * getKoef();
    }

    Float getKoef() {
        koefs.put("USD_RUB", 75f);
        koefs.put("USD_RUB", 1 / 75f);

        return koefs.get(getCurrencyF() + "_" + getCurrencyT());
    }
}
