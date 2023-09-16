public class Roda {
    private int aro;
    private String marca;
    private int largura ;

    private boolean encher;




    public boolean pneuCheio(){
        encher = true;
        return encher;
    }


    public Roda(int aro, String marca, int largura){
        this.aro = aro;
        this.marca = marca;
        this.largura = largura;
    }

    public String imprimir(){
        String tanque = (encher? "tanque Cheio":"tanque Vazio");
        return "{" +
                "\nAro:" + aro +
                "\nMarca:" + marca +
                "\nLargura:" + largura +
                '}';
    }


}
