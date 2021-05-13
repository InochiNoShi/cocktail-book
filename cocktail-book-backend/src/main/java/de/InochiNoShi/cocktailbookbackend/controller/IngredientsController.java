package de.InochiNoShi.cocktailbookbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.InochiNoShi.cocktailbookbackend.entity.Ingredients;
import de.InochiNoShi.cocktailbookbackend.service.IngredientsService;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {
	
	private IngredientsService iService;

	public IngredientsController(IngredientsService iService) {
		super();
		this.iService = iService;
	}
	
	@GetMapping
	public List<Ingredients> listCocktails() {
		return iService.getAllIngredients();
	}
	
	@GetMapping("/{id}")
	public Optional<Ingredients> listCocktailsId(@PathVariable Long id) {
		return iService.getAllIngredientsById(id);
	}

}
