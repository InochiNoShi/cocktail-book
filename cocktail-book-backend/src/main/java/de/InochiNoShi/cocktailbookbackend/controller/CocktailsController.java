package de.InochiNoShi.cocktailbookbackend.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.InochiNoShi.cocktailbookbackend.service.CocktailsService;

@RestController
public class CocktailsController {
	
	private CocktailsService cService;

	public CocktailsController(CocktailsService cService) {
		super();
		this.cService = cService;
	}
	
	@GetMapping("/cocktails")
	public String listCocktails(Model model) {
		model.addAttribute("cocktails", cService.getAllCocktails());
		return model.toString();
	}
}
