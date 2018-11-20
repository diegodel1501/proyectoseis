package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.PonenciaModel;


@Controller

public class PonenciaController {
	@Autowired
	private PonenciaModel ponenciaModel;
	@RequestMapping(value="listarPonencias", method=RequestMethod.GET)
		public String listar(Model model) {
			model.addAttribute("ponencias", ponenciaModel.findAll());
			return "listarPonencias";
		}
}
