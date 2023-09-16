public class Animal {
    private String nome;
    private String raca;
    private String cor;
    private String nasc;
    private String dono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }













    public String imprimir(){
        return "Nome " + nome +
        "\nraca " + raca+
        "\nCor " + cor+
        "\nNasc " + nasc+
        "\nDono " + dono;
    }






}
