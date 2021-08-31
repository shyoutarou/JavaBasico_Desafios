package one.digital.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2019-07-14

        System.out.println(ontem);
        // 2019-07-13

        LocalTime agoratime = LocalTime.now();

        System.out.println(agoratime);
        // 23:53:58.421

        LocalTime maisUmaHora = agoratime.plusHours(1);

        System.out.println(maisUmaHora);
        // 00:55:37.421

        LocalDateTime agoraDateTime = LocalDateTime.now();

        System.out.println(agoraDateTime);
        // 2019-07-15T00:02:16.076

        LocalDateTime futuro = agoraDateTime.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2019-07-17T01:02:28.076
    }
}
