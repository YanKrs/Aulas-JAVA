public class Bomb extends Item {
    public Bomb(int x, int y) {
        super(x, y);
    }

    public void explodir(Player jogador) {
        int vidasAtuais = jogador.getLife();

        if (vidasAtuais > 0) {
            jogador.setLife(vidasAtuais - 1);
        }
    }
}
