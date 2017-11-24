package com.toweb.springws.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="persons")
public class PersonListDTO {

	private List<PersonaDTO> list;

	/**
	 * @return the list
	 */
	public List<PersonaDTO> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<PersonaDTO> list) {
		this.list = list;
	}
}
