package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.ProductoModel;

@Controller
public class ProductoController {
	@Autowired
private ProductoModel productoModel;
@RequestMapping(value="listar", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("productos", productoModel.findAll());
		return "listar";
	}
}
