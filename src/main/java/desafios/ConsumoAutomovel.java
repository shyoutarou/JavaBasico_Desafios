package desafios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConsumoAutomovel {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        //declare as variaveis corretamente

        int distância_total_Km  = leitor.nextInt();
        double total_combustível = leitor.nextDouble();

        double media = distância_total_Km / total_combustível ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media  ));
    }
}
