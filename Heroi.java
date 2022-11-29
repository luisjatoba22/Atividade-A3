
public class Heroi extends Personagem {

    private String NomeReal;

    // Getters and Setters

    public String getNomeReal() {
        return NomeReal;
    }

    public void setNomeReal(String NomeReal) {
        this.NomeReal = NomeReal;
    }

    // Construtor
    public Heroi(String nome, String editora, int pfInicial, int peInicial, int pf, int pe, String NomeReal) {
        super(nome, editora, pfInicial, peInicial, pf, pe);
        this.NomeReal = NomeReal;
    }

}
