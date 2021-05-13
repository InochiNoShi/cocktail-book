package de.InochiNoShi.cocktailbookbackend.service;

import java.util.List;
import java.util.Optional;

import de.InochiNoShi.cocktailbookbackend.entity.Tool;

public interface ToolService {

	List<Tool> getAllTools();

	Optional<Tool> getAllToolsById(Long id);
	
}
