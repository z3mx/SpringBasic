package com.toweb.springws.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toweb.springws.dto.PersonListDTO;
import com.toweb.springws.dto.PersonaDTO;
import com.toweb.springws.services.PersonService;

@Controller
public class PersonController {

	protected static Logger logger = Logger.getLogger("controller");

	@Resource(name="personService")
	private PersonService personService;
	
	@RequestMapping(value="/persons",method=RequestMethod.GET, headers="Accept=application/xml, application/json")
	private @ResponseBody PersonListDTO getPersons() {
		
		PersonListDTO personList = new PersonListDTO();
		personList.setList(personService.getAll());
		
		return personList;
	}
	
	@RequestMapping(value="/person/{id}",method=RequestMethod.GET, headers="Accept=application/xml, application/json")
	private @ResponseBody PersonaDTO getPerson(@PathVariable("id")Long id) {
		return personService.get(id);
	}
	
}
