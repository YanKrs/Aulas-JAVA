public class Pessoa {

    public Pessoa(String nome, int idade){
        this.nome  = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, char sexo){
        this.nome  = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public Pessoa(){
    }

    String nome;
    int idade;
    char sexo;

    public String imprimir(){
        return "Nome " + nome + "\nIdade " + idade + "\nSexo " + sexo;
    }

}
