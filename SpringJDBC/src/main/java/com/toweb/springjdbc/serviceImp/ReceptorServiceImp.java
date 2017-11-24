package com.toweb.springjdbc.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toweb.springjdbc.dao.ReceptorDAO;
import com.toweb.springjdbc.model.ReceptorDTO;
import com.toweb.springjdbc.service.ReceptorService;

@Service
public class ReceptorServiceImp implements ReceptorService{

	ReceptorDAO receptorDAO;
	
	@Autowired
	public void setReceptorDAO(ReceptorDAO receptorDAO) {
		this.receptorDAO = receptorDAO;
	}

	public List<ReceptorDTO> listAllReceptors() {
		return receptorDAO.listAllReceptors();
	}

	public boolean addReceptor(ReceptorDTO receptorDTO) {
		return receptorDAO.addReceptor(receptorDTO);
	}

	public boolean updateReceptor(ReceptorDTO receptorDTO) {
		return receptorDAO.updateReceptor(receptorDTO);
	}

	public boolean deleteReceptor(int idreceptor) {
		return receptorDAO.deleteReceptor(idreceptor);
	}

	public ReceptorDTO findReceptorById(int idReceptor) {
		return receptorDAO.findReceptorById(idReceptor);
	}

}
