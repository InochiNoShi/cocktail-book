package de.InochiNoShi.cocktailbookbackend.service;

import java.util.List;
import java.util.Optional;

import de.InochiNoShi.cocktailbookbackend.entity.Cocktail;

public interface CocktailService {
	
	List<Cocktail> getAllCocktails();

	Optional<Cocktail> getAllCocktailsById(Long id);

}
