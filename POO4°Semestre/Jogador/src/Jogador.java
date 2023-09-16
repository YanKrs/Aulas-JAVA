public class Jogador {
    private String nome = "Joao";
    private int xp;
    private int hp = 100;
    private boolean envenenado;

    public Jogador(){
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public void receberDano(int pontos){
        hp = hp - pontos;
        hp = (hp < 0) ? 0 : hp;
            }

        public void receberCura(int pontos){
            if(pontos < 0) return;
                hp+=pontos;
            }

            public void ganharExperiencia(int pontos){
        if (pontos < 0) return;
        hp += pontos;

            }

            public void receberAntidoto(){

        //envenenado = envenenado ? false : true;
                envenenado = !envenenado;
            //if(isEnvenenado()){
               // envenenado = false;
              //  return;
            //}

            }




    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }



}
