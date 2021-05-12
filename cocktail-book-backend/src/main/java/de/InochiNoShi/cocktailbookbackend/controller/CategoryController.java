package de.InochiNoShi.cocktailbookbackend.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.InochiNoShi.cocktailbookbackend.service.CategoryService;

@RestController
public class CategoryController {

	private CategoryService cService;

	public CategoryController(CategoryService cService) {
		super();
		this.cService = cService;
	}
	
	@GetMapping("/category")
	public String listCocktails(Model model) {
		model.addAttribute("cocktails", cService.getAllCategorys());
		return model.toString();
	}
}
