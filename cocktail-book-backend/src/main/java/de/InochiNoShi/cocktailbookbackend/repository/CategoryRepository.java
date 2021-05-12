package de.InochiNoShi.cocktailbookbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.InochiNoShi.cocktailbookbackend.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
