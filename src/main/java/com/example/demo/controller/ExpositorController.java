package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.models.ExpositorModel;

@Controller// explicitamos que el esterotipo es controlador esta clase manda los datos a la pagina web
public class ExpositorController {
@Autowired
	private ExpositorModel expositorModel;
@RequestMapping(value="ListarExpositores", method=RequestMethod.GET)
 public String ListarExpositores(Model model){
	 model.addAttribute("Expositores", expositorModel.findAll());
	 return "ListarExpositores";// esta es la pagina que contiene el nuevo atributo que es una lista de los expocitores 
	 
 }
}
