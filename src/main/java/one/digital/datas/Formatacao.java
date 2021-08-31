package one.digital.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formatacao {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        // 15/07/19 22:13

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 15 de Julho de 2019 22:13


        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(agora);
        System.out.println(dateToStr);
        // 15 de Julho de 2019 22h13min55s BRT

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
        // 14/07/2019

    }
}
