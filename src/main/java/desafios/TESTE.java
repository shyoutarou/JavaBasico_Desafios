package desafios;

import java.io.IOException;
import java.util.Scanner;

public class TESTE {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int a[] = {-5,0,-3,-4,12}, i, even = 0, odd = 0, pos = 0, neg = 0, zero = 0;

        for (i = 0; i < a.length; i++){
            if (a[i] > 0){
                pos++;
            }

            else if (a[i] == 0){
                zero++;
            } else {
                neg++;
            }

            if (a[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}

