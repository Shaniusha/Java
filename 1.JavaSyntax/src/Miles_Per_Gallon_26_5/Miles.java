package Miles_Per_Gallon_26_5;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Miles {
    public static float mpgToKPM(final float mpg) { //1 способ
        double km = 1.609344 * mpg / 4.54609188;
        km = Math.round(km * 100);//round
        km = km / 100;

        return (float) km;
    }
    public static float mpgToKPM1(final float mpg) { //2 способ
        BigDecimal bigDecimal = BigDecimal.valueOf(mpg * 1.609344f / 4.54609188f);
        bigDecimal = bigDecimal.round(new MathContext(2, RoundingMode.HALF_UP));
        return bigDecimal.floatValue();
    }
    public static void main(String[] args) {
        // 1 британский галлон = 4,54609188 литров 1 миля = 1,609344 километра
        float m = 10;
        System.out.println(mpgToKPM(m));

        float m2 = 20;
        System.out.println(mpgToKPM(m2));

        float m3 = 30;
        System.out.println(mpgToKPM(m3));

        float m4 = 458;
        System.out.println(mpgToKPM(m4));
    }
}
