public class Mago extends Jogador implements Tela{
    private int mp;

    public Mago(int x, int y, int mp) {
        super(x, y);
        this.mp = mp;
    }

    @Override
    public int mover() {

    }

    @Override
    public void show() {

    }



    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }



}
