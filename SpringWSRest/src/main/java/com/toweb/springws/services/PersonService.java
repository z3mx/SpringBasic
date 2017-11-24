package com.toweb.springws.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.toweb.springws.dto.PersonaDTO;

@Service("personService")
public class PersonService {
	
	protected static Logger logger = Logger.getLogger("service");
	
	private List<PersonaDTO> persons = new ArrayList<PersonaDTO>();

	public PersonService() {
		logger.debug("iniciando DB");
		
		PersonaDTO person1 = new PersonaDTO();
		person1.setId(0L);
		person1.setFisrtName("luis");
		person1.setLastName("Barrios");
		person1.setMoney(1000.0);
		
		PersonaDTO person2 = new PersonaDTO();
		person2.setId(1L);
		person2.setFisrtName("Matthew");
		person2.setLastName("Steven");
		person2.setMoney(2000.0);
		
		PersonaDTO person3 = new PersonaDTO();
		person3.setId(2L);
		person3.setFisrtName("Jeremy");
		person3.setLastName("Sanchez");
		person3.setMoney(4000.0);
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
	}
	
	public List<PersonaDTO> getAll(){
		logger.debug("recuperar todas las personas");
		return persons;
	}
	
	public PersonaDTO get(Long id) {
		logger.debug("recuperar persona con id: "+id);
		for(PersonaDTO persona:persons) {
			if(persona.getId() == id) {
				return persona;
			}
		}
		return null;
	}
}
