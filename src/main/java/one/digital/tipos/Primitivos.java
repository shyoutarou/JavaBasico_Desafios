package one.digital.tipos;

public class Primitivos {
    public static void main(String[] args) {
        //byte nullbyte = null;

        byte b;      //8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129; //too large

        //WRAPPER VARIABLE
        //AUTOBOXING, não precisa de new para instanciar a classe
        Byte wb1 = 127;
        Byte wb2 = -128;
        Byte wb3 = null;

        char c;
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA'; //NOK
        //char c4 = -100; //NOK

        //WRAPPER VARIABLE
        Character wc;
        Character wc1 = 'A';
        Character wc2 = 15;

        short s;    //16 bits
        short s1 = 32767;
        short s2 = -32767;

        //WRAPPER VARIABLE
        Short ws1 = 32767;
        Short ws2 = -32767;

        int i;    //32 bits
        int i1 = 217483647;
        int i2 = -217483648;
        //int i3 = -217483649; //too large

        //WRAPPER VARIABLE
        Integer wi1 = 217483647;
        Integer wi2 = -217483648;

        long l = 9223372036854775807L;
        long l2 = -9223372036854775808L;
        //long l3 = -9223372036854775809L; //too large

        //WRAPPER VARIABLE
        Long wl = 9223372036854775807L;
        Long wl2 = -9223372036854775808L;

        //FLUTUANTES
        float f = 65f;  //32 bits 3.402,823,5 E+28
        float f2 = 65.0f;
        float f3 = -0.5f;  //1.4 E-45

        //WRAPPER VARIABLE
        Float wf2 = 65.0f;
        Float wf3 = -0.5f;  //1.4 E-45

        double d = 124.99d; //64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456d;   //4.9 E-324

        //WRAPPER VARIABLE
        Double wd = 124.99d; //64 bits 1.797,693,134,862,315,7 E+308
        Double wd2 = 10.2456d;   //4.9 E-324

        //BOOLEANO
        boolean bo = true;
        boolean bo1 = false;
        //boolean bo2 = "true";   //NOK
        //boolean bo3 = 'false';    //NOK

        Boolean wbo = true;
        Boolean wbo1 = false;
        Boolean wbo2 = Boolean.getBoolean("false");
        Boolean wbo3 = Boolean.valueOf("true");

        //void v; //palavra reservada

        //System.out.println("byte: " + b); //ERRO de variavel não inicializada

        final Default padrao = new Default();
        System.out.println(padrao.getInteiro());
        System.out.println(padrao.IsActive());

    }

    private static class Default {
        int i;
        boolean active;

        public int getInteiro() {
            return i;
        }

        public boolean IsActive() {
            return active;
        }
    }

    private static class Unboxing {
        //Atribui um tipo Wrapper para um tipo primitivo
        int i = new Integer(9);
        int inteiro = Integer.valueOf(55);

        boolean active = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("true");
    }
}
