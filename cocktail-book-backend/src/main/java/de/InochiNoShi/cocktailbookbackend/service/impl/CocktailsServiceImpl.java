package de.InochiNoShi.cocktailbookbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import de.InochiNoShi.cocktailbookbackend.entity.Cocktails;
import de.InochiNoShi.cocktailbookbackend.repository.CocktailsRepository;
import de.InochiNoShi.cocktailbookbackend.service.CocktailsService;

@Service
public class CocktailsServiceImpl implements CocktailsService{
	
	private CocktailsRepository cRepo;
	
	public CocktailsServiceImpl(CocktailsRepository cRepo) {
		super();
		this.cRepo = cRepo;
	}
	
	@Override
	public List<Cocktails> getAllCocktails() {
		return cRepo.findAll();
	}

}
