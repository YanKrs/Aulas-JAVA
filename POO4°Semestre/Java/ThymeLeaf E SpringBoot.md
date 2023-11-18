
---

#localhost
Para rodar o LocalHost, inicie a aplicação e em seguida no navegador insira localhost:8080


Informe #/task para ir para o #DB 


Resources -> templates: Aqui é onde fica a página que é mostrada ao usuário

Para aplicar o #css, é criado um arquivo na pasta #static dentro de template

Trabalhamos com a estrutura MVC

#id usador para o front, enquanto o #name é usado mais para o back-end, o qual informa da onde serão passados os dados. É o identificador daquela tag


@PostMapping("new") //criaremos o método post para a página new  
public String save(Task task){  //receber os valores do form, foi selecionado o task Módulo para importar  
    repository.save(task);        //salvar no banco  
    return "redirect:/task";        //redirecionar para a lista




#model serve para modelar os dados de entrada