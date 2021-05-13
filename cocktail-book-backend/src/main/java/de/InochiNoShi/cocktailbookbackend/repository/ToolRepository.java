package de.InochiNoShi.cocktailbookbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.InochiNoShi.cocktailbookbackend.entity.Tool;

@Repository
public interface ToolRepository extends JpaRepository<Tool, Long> {

}
