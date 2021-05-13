package de.InochiNoShi.cocktailbookbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.InochiNoShi.cocktailbookbackend.entity.Tool;
import de.InochiNoShi.cocktailbookbackend.service.ToolService;

@RestController
@RequestMapping("/tools")
public class ToolController {
	
	private ToolService tService;

	public ToolController(ToolService tService) {
		super();
		this.tService = tService;
	}
	
	@GetMapping
	public List<Tool> listTools() {
		return tService.getAllTools();
	}
	
	@GetMapping("/{id}")
	public Optional<Tool> listToolsId(@PathVariable Long id) {
		return tService.getAllToolsById(id);
	}

}
