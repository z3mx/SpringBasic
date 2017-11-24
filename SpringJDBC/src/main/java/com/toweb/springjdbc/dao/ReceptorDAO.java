package com.toweb.springjdbc.dao;

import java.util.List;

import com.toweb.springjdbc.model.ReceptorDTO;

public interface ReceptorDAO {

	public List<ReceptorDTO> listAllReceptors();
	public boolean addReceptor(ReceptorDTO receptorDTO);
	public boolean updateReceptor(ReceptorDTO receptorDTO);
	public boolean deleteReceptor(int idreceptor);
	public ReceptorDTO findReceptorById(int idReceptor);
}
