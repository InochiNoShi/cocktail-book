package de.InochiNoShi.cocktailbookbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.InochiNoShi.cocktailbookbackend.entity.Cocktail;

@Repository
public interface CocktailRepository extends JpaRepository<Cocktail, Long>{

}
