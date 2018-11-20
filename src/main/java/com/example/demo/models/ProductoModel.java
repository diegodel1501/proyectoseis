package com.example.demo.models;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Producto;

@Repository
public class ProductoModel {
	@PersistenceContext
private EntityManager entityManager;
	

	@SuppressWarnings("unchecked")
	public List<Producto> findAll(){
		
		return entityManager.createQuery("From Producto").getResultList();
	}
}
