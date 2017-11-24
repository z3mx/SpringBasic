package com.toweb.springws.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="persona")
public class PersonaDTO {

	private long id;
	private String fisrtName;
	private String lastName;
	private Double money;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the fisrtName
	 */
	public String getFisrtName() {
		return fisrtName;
	}
	/**
	 * @param fisrtName the fisrtName to set
	 */
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the money
	 */
	public Double getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(Double money) {
		this.money = money;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", fisrtName=" + fisrtName + ", lastName=" + lastName + ", money=" + money
				+ "]";
	}
	
}
