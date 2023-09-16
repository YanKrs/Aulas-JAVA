public class Main {
    public static void main(String[] args) {
    var jogador1 = new Jogador();
    var jogador2 = new Jogador("joão");

        System.out.println(jogador1.getHp());
        jogador1.receberDano(200);
        System.out.println(jogador1.getHp());
        jogador1.ganharExperiencia(-20);
        System.out.println(jogador1.getXp());

        if(jogador1.isEnvenenado())
            System.err.println("Envenenado");

    }
}