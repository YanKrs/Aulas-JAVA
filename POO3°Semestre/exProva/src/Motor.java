public class Motor {

    private double torque;
    private double litragem;
    private int cilindro;
    private boolean ligado;




    public Motor(int cilindro, double torque, double litragem){
        this.cilindro = cilindro;
        this.torque = torque;
        this.litragem = litragem;
        ligado = false;
    }


    public boolean ligarDesligar(){
        ligado = !ligado;
        return ligado;
    }

    public String imprimir() {
        String funcionando = (ligado? "motor ligado":"motor desligado");
        return "Motor{" +
                "\nTorque:" + torque +
                "\nLitragem:" + litragem +
                "\nCilindro:" + cilindro +
        '}';
    }
}
