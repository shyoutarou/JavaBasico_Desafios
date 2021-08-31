package one.digital.strings;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Rounding {
    public static void main(String[] args) {
        double N5 = 24.281250d;
        int precision = 10000; //keep 4 digits

        System.out.println(String.format("String.format: %.4f ", N5));

        DecimalFormat dfN5 = new DecimalFormat("#.0000");
        System.out.println("DecimalFormat: " + dfN5.format(N5));

        var MathceilN5 = Math.ceil(N5 * precision) / precision;
        System.out.println("Math.ceil: " + MathceilN5);

        var MathfloorN5 = Math.floor(N5 * precision +.5)/precision;
        System.out.println("Math.floor: " + MathfloorN5);

        NumberFormat fmtN5 = NumberFormat.getNumberInstance();
        fmtN5.setMaximumFractionDigits(4);
        fmtN5.setRoundingMode(RoundingMode.CEILING);
        System.out.println("NumberFormat: " +  fmtN5.format(N5));

    }
}
