package com.matthieurb.jokesgenerator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matthieurb.jokesgenerator.services.JokesGeneratorService;

@Controller
public class JokesGeneratorController {
	
	private JokesGeneratorService jokesgeneratorService;

	@Autowired
	public JokesGeneratorController(JokesGeneratorService jokesgeneratorService) {
		this.jokesgeneratorService = jokesgeneratorService;
	}
	
	@RequestMapping("/")
	public String getJoke(Model model) {
		
		model.addAttribute("joke", jokesgeneratorService.getAJoke());
		
		return "jokesTemplate";
	}

}
