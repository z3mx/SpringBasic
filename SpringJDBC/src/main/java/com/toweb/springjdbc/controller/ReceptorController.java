package com.toweb.springjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.toweb.springjdbc.model.ReceptorDTO;
import com.toweb.springjdbc.service.ReceptorService;

@Controller
@RequestMapping(value="/receptor")
public class ReceptorController {

	@Autowired
	ReceptorService receptorService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("/receptor/receptor_page");
		
		List<ReceptorDTO>list = receptorService.listAllReceptors();
		model.addObject("listReceptor",list);
		
		return model;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView model = new ModelAndView("/receptor/receptor_form");
		
		ReceptorDTO receptorDTO = new ReceptorDTO();
		model.addObject("receptorForm",receptorDTO);
		
		return model;
	}
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView model = new ModelAndView("/receptor/receptor_form");
		
		ReceptorDTO receptorDTO =receptorService.findReceptorById(id);
		model.addObject("receptorForm",receptorDTO);
		
		return model;
	}
	
	@RequestMapping(value="/save/{id}",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("receptorForm") ReceptorDTO receptorDTO) {
		if(receptorDTO != null && receptorDTO.getIdclientes() != null) {
			receptorService.updateReceptor(receptorDTO);
		}else {
			receptorService.addReceptor(receptorDTO);
		}
		return new ModelAndView("redirect:/list");
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("id") int id) {
		receptorService.deleteReceptor(id);
		return new ModelAndView("redirect:/list");
	}
}
