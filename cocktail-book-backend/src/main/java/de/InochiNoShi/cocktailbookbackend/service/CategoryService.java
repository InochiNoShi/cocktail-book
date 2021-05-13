package de.InochiNoShi.cocktailbookbackend.service;

import java.util.List;
import java.util.Optional;

import de.InochiNoShi.cocktailbookbackend.entity.Category;

public interface CategoryService {
	
	List<Category> getAllCategorys();

	Optional<Category> getAllCategorysById(Long id);
}
