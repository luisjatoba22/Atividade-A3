import java.util.ArrayList;
import java.util.Random;

public abstract class Personagem {
    private String nome;
    private String editora;
    private int peInicial;
    private int pfInicial;
    private int pf;
    private int pe;
    private ArrayList<Poder> poderes = new ArrayList<Poder>();

    public int getPeInicial() {
        return peInicial;
    }

    public void setPeInicial(int peInicial) {
        this.peInicial = peInicial;
    }

    public int getPfInicial() {
        return pfInicial;
    }

    public void setPfInicial(int pfInicial) {
        this.pfInicial = pfInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getPf() {
        return pf;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void AdicionarPoder(Poder p) {
        this.poderes.add(p);
    }

    public void RemoverPoder(Poder p) {
        this.poderes.remove(p);
    }

    // Constutor Personagem
    public Personagem(String nome, String editora, int pfInicial, int peInicial, int pf, int pe) {
        this.nome = nome;
        this.editora = editora;
        this.peInicial = peInicial;
        this.pfInicial = pfInicial;
        this.pf = pf;
        this.pe = pe;

    }

    public void Atacar(Personagem p2) {

        //
        // System.out.printf("O herói %s possui: %d de energia\n", getNome(), getPe());

        Random random = new Random();
        int randomNumber = random.nextInt(this.poderes.size());

        // System.out.println(this.poderes.get(randomNumber).getPe());

        if (getPe() > this.poderes.get(randomNumber).getPe()) {
            System.out.printf("O(A) %s ataca com com %s e causou %d de dano!\n", getNome(),
                    this.poderes.get(randomNumber).getNome(), this.poderes.get(randomNumber).getDano());

            pe = getPe() - this.poderes.get(randomNumber).getPe();

            int aux;

            aux = p2.getPf() - this.poderes.get(randomNumber).getDano();

            p2.setPf(aux);

            System.out.printf("A nova energia do %s é de: %d\n", getNome(), pe);
            System.out.printf("A nova força do %s é de: %d\n", p2.getNome(), p2.getPf());

        } else {
            System.out.printf("O %s está esgotado. Utilize esse turno para recuperar\n", getNome());

            Recuperar();

        }

    }

    public void Recuperar() {

        pe = peInicial * 30 / 100;

        System.out.printf("A nova energia do %s é de %d pontos\n", getNome(), getPe());

    }

    public void getPoderes() {

        System.out.printf("O %s com dano de %d e energia de %s\n ", this.poderes.get(0).getNome(),
                this.poderes.get(0).getDano(), this.poderes.get(0).getPe());
    }

}
