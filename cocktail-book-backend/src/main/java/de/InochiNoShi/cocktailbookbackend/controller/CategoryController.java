package de.InochiNoShi.cocktailbookbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.InochiNoShi.cocktailbookbackend.entity.Category;
import de.InochiNoShi.cocktailbookbackend.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	private CategoryService cService;

	public CategoryController(CategoryService cService) {
		super();
		this.cService = cService;
	}
	
	@GetMapping
	public List<Category> listCategorys() {
		return cService.getAllCategorys();
	}
	
	@GetMapping("/{id}")
	public Optional<Category> listCategorysId(@PathVariable Long id) {
		return cService.getAllCategorysById(id);
	}
}
