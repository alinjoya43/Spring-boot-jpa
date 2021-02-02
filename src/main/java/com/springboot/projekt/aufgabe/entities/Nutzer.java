package com.springboot.projekt.aufgabe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Table- Nutzer

@Entity
public class Nutzer {
	
	    @Id
	    @GeneratedValue
        private long id;
	    
	    
        private String name;
        
        
        private String vorname;
        
        
        protected Nutzer() {
        	
        }
        
        
		public Nutzer(String name, String vorname) {
			super();
			this.name = name;
			this.vorname = vorname;
		}
		public long getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getVorname() {
			return vorname;
		}
		@Override
		public String toString() {
			return "Nutzer [id=" + id + ", name=" + name + ", vorname=" + vorname + "]";
		}
        
        
        
        
}
