package Numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormat {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal("149.32");
        System.out.println(NumberFormat.getCurrencyInstance().format(money)); // Local
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(money)); // China
        System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(money)); // France
    }
}
