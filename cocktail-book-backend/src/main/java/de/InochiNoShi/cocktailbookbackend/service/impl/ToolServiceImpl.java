package de.InochiNoShi.cocktailbookbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import de.InochiNoShi.cocktailbookbackend.entity.Tool;
import de.InochiNoShi.cocktailbookbackend.repository.ToolRepository;
import de.InochiNoShi.cocktailbookbackend.service.ToolService;

@Service
public class ToolServiceImpl implements ToolService {
	
	private ToolRepository tRepo;

	public ToolServiceImpl(ToolRepository tRepo) {
		super();
		this.tRepo = tRepo;
	}

	@Override
	public List<Tool> getAllTools() {
		return tRepo.findAll();
	}

	@Override
	public Optional<Tool> getAllToolsById(Long id) {
		return tRepo.findById(id);
	}
}
