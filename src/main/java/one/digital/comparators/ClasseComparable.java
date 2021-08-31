package one.digital.comparators;

public class ClasseComparable implements Comparable<ClasseComparable> {

    private final String _nome;
    private final Integer _idade;

    public ClasseComparable(String nome, Integer idade)
    {
        this._nome = nome;
        this._idade = idade;
    }
    public String getnome(){  return this._nome;  }
    public Integer getidade(){  return this._idade;  }

    @Override
    public String toString(){  return this._nome + "(" + this._idade + "anos)";  }

    @Override
    public int compareTo(ClasseComparable o) {
        return this.getidade() - o.getidade();
    }
}
