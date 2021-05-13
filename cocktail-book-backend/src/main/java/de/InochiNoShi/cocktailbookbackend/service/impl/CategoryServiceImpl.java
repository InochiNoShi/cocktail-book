package de.InochiNoShi.cocktailbookbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import de.InochiNoShi.cocktailbookbackend.entity.Category;
import de.InochiNoShi.cocktailbookbackend.repository.CategoryRepository;
import de.InochiNoShi.cocktailbookbackend.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	private CategoryRepository cRepo;
	
	public CategoryServiceImpl(CategoryRepository cRepo) {
		super();
		this.cRepo = cRepo;
	}

	@Override
	public List<Category> getAllCategorys() {
		return cRepo.findAll();
	}

	@Override
	public Optional<Category> getAllCategorysById(Long id) {
		return cRepo.findById(id);
	}
}
