package desafios;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        int numero  = leitor.nextInt();
        for (int i = 1 ; i <= numero; i++) {
            if (i % 2 == 0 ) System.out.println(i);
        }
    }
}
