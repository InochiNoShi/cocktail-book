package de.InochiNoShi.cocktailbookbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.InochiNoShi.cocktailbookbackend.entity.Ingredients;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredients, Long>{

}
