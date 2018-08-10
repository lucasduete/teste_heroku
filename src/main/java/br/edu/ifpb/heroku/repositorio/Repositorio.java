/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.heroku.repositorio;

import br.edu.ifpb.heroku.entity.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jose
 */
@Stateless
public class Repositorio {
    @PersistenceContext(unitName = "heroku_PU")
    private EntityManager manager;
    public void salvar(Pessoa pessoa){
        manager.persist(pessoa);
    }
    public List<Pessoa> buscarTotos(){
       TypedQuery<Pessoa> Query
                = manager.createQuery("FROM  Pessoa c", Pessoa.class);
        return Query.getResultList();
    }
    
}
