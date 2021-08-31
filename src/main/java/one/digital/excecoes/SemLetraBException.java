package one.digital.excecoes;

public class SemLetraBException  extends Exception {
    @Override
    public String getMessage(){
        return "Não existe letra B em sua frase";
    }
}
