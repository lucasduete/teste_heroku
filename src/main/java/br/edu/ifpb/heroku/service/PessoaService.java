/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.heroku.service;

import br.edu.ifpb.heroku.repositorio.Repositorio;
import br.edu.ifpb.heroku.entity.Pessoa;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author jose
 */
@Stateless
public class PessoaService {
    @EJB
    private Repositorio repositorio;
    
  
    public void salvar(Pessoa pessoa){
        repositorio.salvar(pessoa);
    }
    public List<Pessoa> buscarTotos(){
       return repositorio.buscarTotos();
    }
    }   

