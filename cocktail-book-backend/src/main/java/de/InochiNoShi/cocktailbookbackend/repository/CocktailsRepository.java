package de.InochiNoShi.cocktailbookbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.InochiNoShi.cocktailbookbackend.entity.Cocktails;

@Repository
public interface CocktailsRepository extends JpaRepository<Cocktails, Long> {

}
