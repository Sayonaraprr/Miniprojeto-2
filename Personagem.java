public class Personagem {
    private String nome;
    private int energia;
    private int energiaMaxima;

    public Personagem(String nome, int energia, int energiaMaxima) {
        this.nome = nome;
        this.energia = energia;
        this.energiaMaxima = energiaMaxima;
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergia(int energia) {
        if (energia <= energiaMaxima && energia >= 0) {
            this.energia = energia;
        } else {
            System.out.println("A energia não pode ser menor que 0 ou maior que a energia máxima.");
        }
    }
    public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Heroíno", 100, 150);
        Personagem personagem2 = new Personagem("Vilão", 80, 120);

        System.out.println("Nome do Personagem 1: " + personagem1.getNome());
        System.out.println("Energia do Personagem 1: " + personagem1.getEnergia());
        System.out.println("Energia Máxima do Personagem 1: " + personagem1.getEnergiaMaxima());

        System.out.println("\nNome do Personagem 2: " + personagem2.getNome());
        System.out.println("Energia do Personagem 2: " + personagem2.getEnergia());
        System.out.println("Energia Máxima do Personagem 2: " + personagem2.getEnergiaMaxima());

    }
}
}
