package one.digital.datas;

import java.time.Instant;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {

        try {
            Date dataNoPassado = new Date();
            System.out.println(dataNoPassado); // Tue Jul 06 20:22:30 BRT 2021

            Long currentTimeMillis = System.currentTimeMillis();
            System.out.println(currentTimeMillis); // 1625614566334

            Date dataNoFuturo = new Date(currentTimeMillis);
            System.out.println(dataNoFuturo);
            // Tue Jul 06 20:36:06 BRT 2021

            Date mesmaDataNoFuturo = new Date(currentTimeMillis);

            /** Comparando se a dataNoPassado é posterior a dataNoFuturo */
            boolean isAfter = dataNoPassado.after(dataNoFuturo);
            System.out.println(isAfter);
            //false

            /** Comparando se a dataNoPassado é anterior a dataNoFuturo */
            boolean isBefore = dataNoPassado.before(dataNoFuturo);
            System.out.println(isBefore); //true

            /** Comparando se as datas são iguais */
            boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
            System.out.println(isEquals); //true

            int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes
            System.out.println(compareCase3); // 0

            Instant instant = dataNoPassado.toInstant();
            System.out.println(instant);

            var instant2 = dataNoPassado.from(instant);
            System.out.println(instant2);
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
