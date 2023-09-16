public class Roda {
    private int aro;
    private String marca;
    private double largura;
    private boolean cheia;

    public Roda(int aro, String marca, double largura) {
        this.aro = aro;
        this.marca = marca;
        this.largura = largura;
        this.cheia = false;
    }

    public int getAro() {
        return aro;
    }

    public String getMarca() {
        return marca;
    }

    public double getLargura() {
        return largura;
    }

    public boolean isCheia() {
        return cheia;
    }

    public void encher() {
        cheia = true;
    }

    public String[] gets() {
        String[] info = new String[4];
        info[0] = Integer.toString(aro);
        info[1] = marca;
        info[2] = Double.toString(largura);
        info[3] = cheia ? "Cheia" : "Vazia";
        return info;
    }
