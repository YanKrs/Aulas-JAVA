public abstract class Jogador {

    private String nome = "Joao";
    private int xp;

    private int x;
    private int y;
    private int hp = 100;
    private boolean envenenado;

    public Jogador() {
    }



    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void receberDano(int pontos){
        hp -= pontos;
        //hp = (hp < 0) ? 0 : hp; //ternario
        if(hp < 0) hp = 0;
    }

    public void recerberCura(int pontos){
        //fail fast + early return
        if (pontos < 0) return;
        hp += pontos;
    }

    public void receberAntidoto(){
        envenenado = !envenenado;
        //envenenado = envenenado ? false : true;

        // if (isEnvenenado()){
        //     envenenado = false;
        //     return;
        // }

        // envenenado = true;

    }

    public void ganharExperiencia(int pontos){
        if (pontos < 0) return;
        xp += pontos;
    }


    public abstract int mover();

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}