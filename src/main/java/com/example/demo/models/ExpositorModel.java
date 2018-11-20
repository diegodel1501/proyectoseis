package com.example.demo.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Expositor;

@Repository// capa model correpondiente al repositorio se guardara una collection de todos los expocitores 
public class ExpositorModel {
	@PersistenceContext // anotacion obligatoria aunque no se para que es, si alguien sabe cambie este comentario
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")// para evitar el warning solamente 
	public List<Expositor> findAll(){
		
		return entityManager.createQuery("From Expositor").getResultList();// en la parte de create query va la query si queremos algo mas especifico se puede cambiar la query 
	// retornamos todos los expositores 
	}

}
