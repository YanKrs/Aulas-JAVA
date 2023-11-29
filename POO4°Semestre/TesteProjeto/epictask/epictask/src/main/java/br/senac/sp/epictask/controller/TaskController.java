package br.senac.sp.epictask.controller;

import br.senac.sp.epictask.model.Task;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import br.senac.sp.epictask.repository.TaskRepository;

@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired
    TaskRepository repository;

    @GetMapping
    public String index(Model model){
        model.addAttribute("tasks", repository.findAll());
        return "task/index";
    }

    //Criando uma nova rota
    @GetMapping("new")  //localhost:8080/task/new   - barra task é geral do controller, agora vamos configurar o barra new
    public String form(Task task){
        return "task/form";  //vamos retornar o nome da página, thimeleaf já congigurado para dizer que a extensão é html
//neste momento ele está pegando a reposição através do método get, devemos criar um outro para usar o post
    }

        @PostMapping("new") //criaremos o método post para a página new
        public String save(@Valid Task task, BindingResult result) {  //receber os valores do form, foi selecionado o task Módulo para importar. O @valid faz uma validação dos dados antes de ser criado o objeto. Binding converte os dados !pesquisar!
            if (result.hasErrors()) return "task/form";
            repository.save(task);        //salvar no banco
            return "redirect:/task";        //redirecionar para a lista
        }




        @DeleteMapping("{id}")    // /task/3 porém o 3 é uma variável, então colocamos nas chaves
        public String delete(@PathVariable Long id){
            repository.deleteById(id);
            return "redirect:/task";
        }

    }