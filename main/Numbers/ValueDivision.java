package Numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ValueDivision {
    public static void main(String[] args) throws ParseException {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        Number value = formatter.parse("$12,345.83");
        BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);
        System.out.println(formatter.format(result));

    }
}
