package com.springboot.projekt.aufgabe.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.projekt.aufgabe.entities.Nutzer;

@Repository
public interface NutzerDAO extends CrudRepository<Nutzer, Long> {
	
	public Nutzer getNutzerById(long id);
	
	@Query(value= "Select n From Nutzer n" , nativeQuery = false)
	public List<Nutzer> getAllNutzer();
	
	
   

}
