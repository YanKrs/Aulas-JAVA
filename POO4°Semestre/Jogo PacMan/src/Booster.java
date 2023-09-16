public class Booster extends Item{

    private int Duracao;



    public Booster(int x, int y) {
        super(x, y);
    }

    public Booster(int x, int y, int duracao) {
        super(x, y);
        this.Duracao = duracao;
    }

    public int getDuracao() {
        return Duracao;
    }

    public void setDuracao(int duracao) {
        Duracao = duracao;
    }
}
