/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.heroku.controle;

import br.edu.ifpb.heroku.service.PessoaService;
import br.edu.ifpb.heroku.entity.Pessoa;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jose
 */
@Named
@RequestScoped
public class PessoaControler {
    @EJB
    private PessoaService service;
    private Pessoa pessoa;
    @PostConstruct
    public void init(){
        this.pessoa = new Pessoa();
    }
    
    public String salvar(){
        service.salvar(pessoa);
        this.pessoa = new Pessoa();
        return null;
    }
    public List<Pessoa> buscarTotos(){
       return service.buscarTotos();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
   
}
