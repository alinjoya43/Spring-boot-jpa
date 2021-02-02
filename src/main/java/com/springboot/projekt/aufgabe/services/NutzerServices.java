package com.springboot.projekt.aufgabe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.projekt.aufgabe.dao.NutzerDAO;
import com.springboot.projekt.aufgabe.entities.Nutzer;

@Service
public class NutzerServices {
    
	@Autowired
	private NutzerDAO nutzerDao;
	
	public void createNutzer (Nutzer nutzer) {
		
		nutzerDao.save(nutzer);
	}
	
	public List<Nutzer> getAllNutzer (){
		return nutzerDao.getAllNutzer();
	}
	
	public Nutzer getNutzerById(Long id) {
		return nutzerDao.getNutzerById(id);
	}
	public void deleteNutzer(Long Id) {
		nutzerDao.deleteById(Id);
	}
}
