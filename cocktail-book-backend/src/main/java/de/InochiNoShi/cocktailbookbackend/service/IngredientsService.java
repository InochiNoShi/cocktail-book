package de.InochiNoShi.cocktailbookbackend.service;

import java.util.List;
import java.util.Optional;

import de.InochiNoShi.cocktailbookbackend.entity.Ingredients;

public interface IngredientsService {
	
	List<Ingredients> getAllIngredients();

	Optional<Ingredients> getAllIngredientsById(Long id);
}
