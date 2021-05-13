package de.InochiNoShi.cocktailbookbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.InochiNoShi.cocktailbookbackend.entity.Cocktail;
import de.InochiNoShi.cocktailbookbackend.service.CocktailService;

@RestController
@RequestMapping("/cocktail")
public class CocktailController {
	
	private CocktailService cService;

	public CocktailController(CocktailService cService) {
		super();
		this.cService = cService;
	}
	
	@GetMapping
	public List<Cocktail> listCocktails() {
		return cService.getAllCocktails();
	}
	
	@GetMapping("/{id}")
	public Optional<Cocktail> listCocktailsId(@PathVariable Long id) {
		return cService.getAllCocktailsById(id);
	}

}
