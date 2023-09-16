public class Hero {
    private String nome; //atributos
    private String poder;
    //Contrutores
    public Hero(){}//default
    public Hero(String nome, String poder){
        this.nome = nome;
        this.poder = poder;
    }
    //Metodos de Acesso
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    //Métodos da classe
    public String imprimir(){
        return "Hero: " + nome + "\nPoder: " + poder;
    }
}