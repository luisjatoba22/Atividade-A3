
public class Main {
    public static void main(String[] args) throws Exception {

        // Criando os herois
        Heroi Superman = new Heroi("Superman", "DC Comics", 100, 70, 100, 70, "Clark Kent");

        // testando heroi criado
        // System.out.printf("O heroi chamado %s da editora %s possui o real nome de
        // %s\n", Superman.getNome(),
        // Superman.getEditora(), Superman.getNomeReal());

        // Adicionadno Poderes

        Poder fSuperman = new Poder("Força", 10, 8);
        Poder Visao_Superman = new Poder("Visão de Raios", 5, 5);
        Poder Sopro_Superman = new Poder("SuperSopro", 4, 4);

        Superman.AdicionarPoder(fSuperman);
        Superman.AdicionarPoder(Sopro_Superman);
        Superman.AdicionarPoder(Visao_Superman);

        Heroi Homem_Aranha = new Heroi("Homem-Aranha", "Marvel Comics", 80, 50, 80, 50, "Peter Parker");

        Poder fHomem_aranha = new Poder("Força", 7, 5);
        Poder SoltarTeia = new Poder("Soltar Teia", 5, 5);

        Homem_Aranha.AdicionarPoder(fHomem_aranha);
        Homem_Aranha.AdicionarPoder(SoltarTeia);

        Heroi Fenix = new Heroi("Fênix", "Marvel Comics", 150, 100, 150, 100, "Jean Grey");

        Poder fFenix = new Poder("Força", 12, 10);

        Fenix.AdicionarPoder(fFenix);

        // Adicionando Viões

        Vilao Superbizarro = new Vilao("Superbizarro", "DC Comics", 95, 60, 95, 60, 50);

        Poder fSuperbizarro = new Poder("Força", 10, 8);
        Poder Visao_Bizzaro = new Poder("Visao de Raios", 5, 5);
        Poder Sopro_Bizzaro = new Poder("Supersopro", 4, 4);

        Superbizarro.AdicionarPoder(fSuperbizarro);
        Superbizarro.AdicionarPoder(Sopro_Bizzaro);
        Superbizarro.AdicionarPoder(Visao_Bizzaro);

        Vilao Duende_Verde = new Vilao("Duende Verde", "Marvel Comics", 80, 60, 80, 60, 70);

        Poder fDuende = new Poder("Força", 7, 5);
        Poder Granada = new Poder("Granada de Abóbora", 5, 5);

        Duende_Verde.AdicionarPoder(fDuende);
        Duende_Verde.AdicionarPoder(Granada);

        Vilao Doutor_Octopus = new Vilao("Doutor Octopus", "Marvel Comics", 70, 40, 70, 40, 40);

        Poder Tentaculos = new Poder("Tentáculos", 6, 4);

        Doutor_Octopus.AdicionarPoder(Tentaculos);

        // Superman.Atacar();

        // Superman.Atacar();
        // Superman.getPoderes();

        // Superman.getPoderes();

        Personagem vencedor;

        // LUTA 1 - HEROI X VILAO (CROSSOVER)

        vencedor = Confrontar(Duende_Verde, Superman);

        System.out.printf("\nO(A) %s foi o vencedor desse confronto!\n", vencedor.getNome());

        // LUTA 2 - HEROI X HEROI (MARVEL)

        vencedor = Confrontar(Homem_Aranha, Fenix);

        System.out.printf("\nO(A) %s foi o vencedor desse confronto!\n", vencedor.getNome());

        // LUTA 3 - VILAO X VILAO (MARVEL)

        vencedor = Confrontar(Doutor_Octopus, Duende_Verde);

        System.out.printf("\nO(A) %s foi o vencedor desse confronto!\n", vencedor.getNome());

    }

    static Personagem Confrontar(Personagem p1, Personagem p2) {

        // recuperar tudo
        p1.setPe(p1.getPeInicial());
        p1.setPf(p1.getPfInicial());

        // teste de recuperar tudo

        // System.out.println("O valor da energia resetada do oponente 1 é : " +
        // p1.getPe());
        // System.out.println("O valor da força resetada do oponente 1 é : " +
        // p1.getPf());

        p2.setPe(p2.getPeInicial());
        p2.setPf(p2.getPfInicial());

        // Verificação de editoras
        if (p1.getEditora() != p2.getEditora()) {
            System.out.println("Confronto CrossOver.");
        } else {
            System.out.println("Confronto " + p1.getEditora());
        }

        // Exibur o nonme dos oponentes e seus PFs

        // Oponente 1
        System.out.printf("O(a) %s tem %d de pontos de força, e está pronto para o combate!\n", p1.getNome(),
                p1.getPf());

        // Oponente 2
        System.out.printf("O(a) %s tem %d de pontos de força, e está pronto para o combate!\n", p2.getNome(),
                p2.getPf());

        while (p1.getPf() > 0 && p2.getPf() > 0) {

            p1.Atacar(p2);

            p2.Atacar(p1);

        }

        if (p1.getPf() < 0) {

            return p2;
        } else {

            return p1;
        }

    }
}
