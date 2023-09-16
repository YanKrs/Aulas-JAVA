


public class GameObject {

    private int X;
    private int Y;
    private int SCREENSIZE;

    public GameObject() {
    }

    public GameObject(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getSCREENSIZE() {
        return SCREENSIZE;
    }

    public void setSCREENSIZE(int tela) {
        this.SCREENSIZE = tela;
    }




    }

