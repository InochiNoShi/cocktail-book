package de.InochiNoShi.cocktailbookbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import de.InochiNoShi.cocktailbookbackend.entity.Ingredients;
import de.InochiNoShi.cocktailbookbackend.repository.IngredientsRepository;
import de.InochiNoShi.cocktailbookbackend.service.IngredientsService;

@Service
public class IngredientsServiceImpl implements IngredientsService {
	
	private IngredientsRepository iRepo;

	public IngredientsServiceImpl(IngredientsRepository iRepo) {
		super();
		this.iRepo = iRepo;
	}

	@Override
	public List<Ingredients> getAllIngredients() {
		return iRepo.findAll();
	}

	@Override
	public Optional<Ingredients> getAllIngredientsById(Long id) {
		return iRepo.findById(id);
	}
	
	

}
