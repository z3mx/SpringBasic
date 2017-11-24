package com.toweb.springjdbc.model;


public class ReceptorDTO{

	 private Integer idclientes; 
	 private String razonsocial; 
	 private String rfc; 
	 private String estado; 
	 private String website; 
	 private String telefonos; 
	 private String rfcEmpresa; 
	 private String tipo; 
	 private String calle; 
	 private String numeroe; 
	 private String colonia; 
	 private String municipio; 
	 private Integer cp; 
	 private String email; 
	 private String cc; 
	 private String numeroi; 
	 private String respresentantelegal; 
	 private String regimenfiscal; 
	 private String numctapago; 

	 public ReceptorDTO() {
		 super();
	 }
	 
	 public ReceptorDTO(Integer idclientes) {
		 super();
		 this.idclientes = idclientes;
	 }
	 
	public Integer getIdclientes(){
		return this.idclientes;
	}

	public void setIdclientes(Integer idclientes){
		this.idclientes = idclientes;
	}

	public String getRazonsocial(){
		return this.razonsocial;
	}

	public void setRazonsocial(String razonsocial){
		this.razonsocial = razonsocial;
	}

	public String getRfc(){
		return this.rfc;
	}

	public void setRfc(String rfc){
		this.rfc = rfc;
	}

	public String getEstado(){
		return this.estado;
	}

	public void setEstado(String estado){
		this.estado = estado;
	}

	public String getWebsite(){
		return this.website;
	}

	public void setWebsite(String website){
		this.website = website;
	}

	public String getTelefonos(){
		return this.telefonos;
	}

	public void setTelefonos(String telefonos){
		this.telefonos = telefonos;
	}

	public String getRfcEmpresa(){
		return this.rfcEmpresa;
	}

	public void setRfcEmpresa(String rfcEmpresa){
		this.rfcEmpresa = rfcEmpresa;
	}

	public String getTipo(){
		return this.tipo;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getCalle(){
		return this.calle;
	}

	public void setCalle(String calle){
		this.calle = calle;
	}

	public String getNumeroe(){
		return this.numeroe;
	}

	public void setNumeroe(String numeroe){
		this.numeroe = numeroe;
	}

	public String getColonia(){
		return this.colonia;
	}

	public void setColonia(String colonia){
		this.colonia = colonia;
	}

	public String getMunicipio(){
		return this.municipio;
	}

	public void setMunicipio(String municipio){
		this.municipio = municipio;
	}

	public Integer getCp(){
		return this.cp;
	}

	public void setCp(Integer cp){
		this.cp = cp;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getCc(){
		return this.cc;
	}

	public void setCc(String cc){
		this.cc = cc;
	}

	public String getNumeroi(){
		return this.numeroi;
	}

	public void setNumeroi(String numeroi){
		this.numeroi = numeroi;
	}

	public String getRespresentantelegal(){
		return this.respresentantelegal;
	}

	public void setRespresentantelegal(String respresentantelegal){
		this.respresentantelegal = respresentantelegal;
	}

	public String getRegimenfiscal(){
		return this.regimenfiscal;
	}

	public void setRegimenfiscal(String regimenfiscal){
		this.regimenfiscal = regimenfiscal;
	}

	public String getNumctapago(){
		return this.numctapago;
	}

	public void setNumctapago(String numctapago){
		this.numctapago = numctapago;
	}

}