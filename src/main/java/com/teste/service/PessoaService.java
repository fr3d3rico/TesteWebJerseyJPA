package com.teste.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.teste.model.Pessoa;

public class PessoaService {
	
	public Pessoa getPessoa(Integer id) {
		
		Pessoa pessoa = null;
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = factory.createEntityManager();
        
        //**********************************
        //EntityTransaction tx = manager.getTransaction();
        
        //tx.begin();
        //Aqui
        //tx.commit();
        //***********************************
        
        Query query = entityManager.createQuery("select p from Pessoa p where p.id = :id");
        query.setParameter("id", id);
        
        pessoa = (Pessoa) query.getSingleResult();
        
        entityManager.close();
        factory.close();
		
		return pessoa;
		
	}
	
}
