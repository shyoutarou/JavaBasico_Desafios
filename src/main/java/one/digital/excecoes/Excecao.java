package one.digital.excecoes;

import one.digital.interfaces.Gol;

public class Excecao {
    public static void main(String[] args) throws SemLetraBException
    {
        String frase = "Sou um teste!";
        if(!frase.contains("b") || !frase.contains("B"))
            throw new SemLetraBException();

        try {
            Gol carro = new Gol();
            carro.ligar();
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
            throw e; // rethrowing the exception
        }
    }

    public void metodo() throws SemLetraBException {

        String frase = "Sou um teste!";
        String novaFrase = null;
        if(!frase.contains("b") || !frase.contains("B"))
            throw new SemLetraBException();

        try {
           novaFrase = frase.toUpperCase();
           new java.io.FileInputStream("arquivo.txt");
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            frase = "Frase vazia";
        }
        finally
        {
            novaFrase = frase.toUpperCase();
            System.out.println("Fechar conexões");
        }
    }
}


