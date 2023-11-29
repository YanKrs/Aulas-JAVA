package br.senac.sp.epictask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

@Entity
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotBlank//faz a validação para q o campo não seja nulo
    String  title;

    //not null é usado para não passar um valor nulo
    // "" not empty - faz a validação de q não esteja vazia
    //"   " not blank - faz a validação para q tenha caracteres válidos (melhoria do not empty



    @Size(min = 14, max = 14, message = "Digite um CPF com 14 dígitos incluindo pontos e traços")//message é a mensagem de erro q será infromada caso não esteja de acordo
    String  description;

    @Min(value = 18, message = "É necessário ter 18 anos")
    @Max(value= 150, message = "Insira uma idade menor")
    Integer score;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
