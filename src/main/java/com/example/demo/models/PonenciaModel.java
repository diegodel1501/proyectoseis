package com.example.demo.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ponencia;


@Repository
public class PonenciaModel {
	@PersistenceContext
	private EntityManager entityManager;
	@SuppressWarnings("unchecked")
	public List<Ponencia> findAll(){
		
		return entityManager.createQuery("From Ponencia").getResultList();
	}

}
