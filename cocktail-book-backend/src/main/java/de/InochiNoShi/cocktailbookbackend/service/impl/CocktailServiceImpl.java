package de.InochiNoShi.cocktailbookbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import de.InochiNoShi.cocktailbookbackend.entity.Cocktail;
import de.InochiNoShi.cocktailbookbackend.repository.CocktailRepository;
import de.InochiNoShi.cocktailbookbackend.service.CocktailService;

@Service
public class CocktailServiceImpl implements CocktailService {
	
	private CocktailRepository cRepo;

	public CocktailServiceImpl(CocktailRepository cRepo) {
		super();
		this.cRepo = cRepo;
	}

	@Override
	public List<Cocktail> getAllCocktails() {
		return cRepo.findAll();
	}

	@Override
	public Optional<Cocktail> getAllCocktailsById(Long id) {
		return cRepo.findById(id);
	}

}
