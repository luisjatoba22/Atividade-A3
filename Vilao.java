public class Vilao extends Personagem {
    private int nivelDeMaldade;

    public int getNivelDeMaldade() {
        return nivelDeMaldade;
    }

    public void setNivelDeMaldade(int nivelDeMaldade) {
        this.nivelDeMaldade = nivelDeMaldade;
    }

    public Vilao(String nome, String editora, int pfInicial, int peInicial, int pf, int pe, int nivelDeMaldade) {
        super(nome, editora, pfInicial, peInicial, pf, pe);
        this.nivelDeMaldade = nivelDeMaldade;
    }

}
