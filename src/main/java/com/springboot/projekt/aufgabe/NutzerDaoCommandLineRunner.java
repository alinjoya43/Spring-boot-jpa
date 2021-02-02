package com.springboot.projekt.aufgabe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.projekt.aufgabe.dao.NutzerDAO;
import com.springboot.projekt.aufgabe.entities.Nutzer;

@Component
public class NutzerDaoCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log =
			LoggerFactory.getLogger(NutzerDaoCommandLineRunner.class);
	
	@Autowired
	private NutzerDAO nutzerDAO;

	@Override
	public void run(String... args) throws Exception {
		Nutzer nutzer = new Nutzer("Max", "Munstermann");
				Nutzer nutzer1 = new Nutzer("Max1", "Munstermann1");

		//Neuer Nutzer wurde hinzugefügt:Nutzer [id=1, name=Max, vorname=Munstermann]
		//long insert = nutzerDAO.save(nutzer);
		nutzerDAO.save(nutzer);
		nutzerDAO.save(nutzer1);
		
		log.info("Neuer Nutzer wurde hinzugefügt:" + nutzer);
	}

}
