
public class Player extends GameObject{


    private int Life;
    private boolean Invencivel;
    private int Direction;
    private boolean Andar;


    public Player() {

    }

    public Player(int x, int y, int Direction) {
        super(x, y);
        Direction = Direction;
    }

    public int mover(){

        int[] coordinates;
        while (Andar == true){
        if (Direction == 8 ){
            return getY() + (-10);
        }
            if (Direction == 4 ){
                return getX() + (-10);
            }
            if (Direction == 2 ){
                return getY() + (+10);
            }
            if (Direction == 6 ){
                return getX() + (+10);
            }

    }
        return 0;

}

    public int getLife() {
        return Life;
    }

    public void setLife(int life) {
        Life = life;
    }

    public boolean isInvencivel() {
        return Invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        Invencivel = invencivel;
    }

    public int getDirection() {
        return Direction;
    }

    public void setDirection(int direction) {
        Direction = direction;
    }

    public boolean isAndar() {
        return Andar;
    }

    public void setAndar(boolean andar) {
        Andar = andar;
    }
}
